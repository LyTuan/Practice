package CutString;

import java.util.Scanner;

public class CutString {
	public static void main(String avgs[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String line = input.nextLine();
		int temp1 = 0;
		int temp2 =0;
		for(int pos = 0; pos<line.length();pos++){
			
			if(line.charAt(pos)!=' '&&pos==0){
				temp1 = pos;
			}
			else if(line.charAt(pos)!=' '&&line.charAt(pos-1)==' '){
				temp1 = pos;
			}
			if ((line.charAt(pos)==' '&&line.charAt(pos+1)!=' ')||pos == line.length()-1){	
				if(pos==line.length()-1){
				temp2 = pos+1;
				}
				else{
					temp2 =pos;
				}
		}
			if(temp2>temp1){
				String word = line.substring(temp1,temp2);
				System.out.println(word);
			}
		
			
			
		}
	}
}
