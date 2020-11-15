import java.util.Scanner;

public class Messages_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int times=Integer.parseInt(scan.nextLine());		
		String result="";
		for(int i=1;i<=times;i++) {
			String input=scan.nextLine();
			int number=Integer.parseInt(input);
			int n=number%10;
			switch(n) {
			case 1:
				break;
			case 2:
				if(input.length()==1) {
					result+="a";
				}else if(input.length()==2){
					result+="b";
				}else if(input.length()==3) {
					result+="c";
				}
				break;
			case 3:
				if(input.length()==1) {
					result+="d";
				}else if(input.length()==2){
					result+="e";
				}else if(input.length()==3) {
					result+="f";
				}
				break;
			case 4:
				if(input.length()==1) {
					result+="g";
				}else if(input.length()==2){
					result+="h";
				}else if(input.length()==3) {
					result+="i";
				}
				break;
			case 5:
				if(input.length()==1) {
					result+="j";
				}else if(input.length()==2){
					result+="k";
				}else if(input.length()==3) {
					result+="l";
				}
				break;
			case 6:
				if(input.length()==1) {
					result+="m";
				}else if(input.length()==2){
					result+="n";
				}else if(input.length()==3) {
					result+="o";
				}
				break;
			case 7:
				if(input.length()==1) {
					result+="p";
				}else if(input.length()==2){
					result+="q";
				}else if(input.length()==3) {
					result+="r";
				}else if(input.length()==4) {
					result+="s";
				}
				break;
			case 8:
				if(input.length()==1) {
					result+="t";
				}else if(input.length()==2){
					result+="u";
				}else if(input.length()==3) {
					result+="v";
				}
				break;
			case 9:
				if(input.length()==1) {
					result+="w";
				}else if(input.length()==2){
					result+="x";
				}else if(input.length()==3) {
					result+="y";
				}else if(input.length()==4) {
					result+="z";
				}
				break;
			case 0:
				result+=" ";
				break;
			}
		}
		System.out.println(result);

	}

}
