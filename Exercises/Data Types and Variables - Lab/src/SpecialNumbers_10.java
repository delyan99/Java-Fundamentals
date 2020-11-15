import java.util.Scanner;

public class SpecialNumbers_10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		for(int i=1;i<=n;i++) {
			String iString=""+i;
			String result="";
			int r=0;
			for(int j=iString.length()-1;j>=0;j--) {
				result=Character.toString(iString.charAt(j));
				r+=Integer.parseInt(result);
			}
			String special ="";
			if(r==5 || r==7 || r==11) {
				special="True";
			}else {
				special="False";
			}
			System.out.printf("%d -> %s%n", i, special);
		}

	}

}
