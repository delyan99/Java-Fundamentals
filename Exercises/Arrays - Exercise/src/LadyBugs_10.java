import java.util.Scanner;

public class LadyBugs_10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size =Integer.parseInt(scan.nextLine());
		String indexes = scan.nextLine();
		String command = scan.nextLine();
		int[] array=new int[size];
		String[] ladybugs = indexes.split(" ");
		int[] ladybugsInteger = new int[ladybugs.length];
		int[] indx= new int[ladybugs.length];
		for (int i = 0; i < ladybugs.length; i++) {
			ladybugsInteger[i]=Integer.parseInt(ladybugs[i]);
			for (int j = 0; j < array.length; j++) {
				if(ladybugsInteger[i]==j) {
					array[j]=1;
				}
			}
		}
		
		while(!command.equals("end")) {
			String[] arrayCommand=command.split(" ");
			int startingPoint=Integer.parseInt(arrayCommand[0]);
			if(startingPoint<0 || startingPoint>=size) {
				command = scan.nextLine();
				continue;
			}
			boolean flag=true;
				if(1==array[startingPoint]) {
					flag=false;
				}
			
			if(flag) {
				command = scan.nextLine();
				continue;
			}
			
			String leftOrRight=arrayCommand[1];
			int movement=Integer.parseInt(arrayCommand[2]);
			if(movement<0) {
				movement=Math.abs(movement);
				if(leftOrRight.equals("left")) {
					leftOrRight="right";
				}else if(leftOrRight.equals("right")){
					leftOrRight="left";
				}
			}

				if(leftOrRight.equals("left")) {
					if(startingPoint-movement<0) {
						array[startingPoint]=0;
					}else if(array[startingPoint-movement]>=0) {
						array[startingPoint]=0;
						if(startingPoint-movement<0) {
							array[startingPoint]=0;
						}else if(startingPoint-movement>=0 && array[startingPoint-movement]==1) {
							startingPoint=startingPoint-movement;
							while(startingPoint>=0 && array[startingPoint]==1) {
								startingPoint=startingPoint-movement;
								if(startingPoint<0) {
									break;
								}
							}
							if(startingPoint>=0) {
								array[startingPoint]=1;
							}
							
						}else if(startingPoint-movement>=0 && array[startingPoint-movement]==0){
							array[startingPoint-movement]=1;
						}
					}
					
				}else if(leftOrRight.equals("right")){
					if(startingPoint+movement>=size) {
						array[startingPoint]=0;
					}else if(startingPoint+movement<=size) {
						array[startingPoint]=0;
						if(startingPoint+movement>size) {
							array[startingPoint]=0;
						}else if(startingPoint+movement<size && array[startingPoint+movement]==1) {
							startingPoint=startingPoint+movement;
							while(startingPoint<size && array[startingPoint]==1) {
								startingPoint=startingPoint+movement;
								if(startingPoint>size) {
									break;
								}
							}
							if(startingPoint<size) {
								array[startingPoint]=1;
							}
							
						}else if(startingPoint+movement<size && array[startingPoint+movement]==0){
							array[startingPoint+movement]=1;
						}	
					}
				}
			
		command = scan.nextLine();
		}
		for (int i : array) {
			System.out.print(i+" ");
		}

	}

}
