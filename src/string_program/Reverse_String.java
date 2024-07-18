package string_program;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		
		String letter=sc.nextLine();
		
        String emptystring="";
        String sp[]=letter.split(" ");
        
        for(int i=0;i<sp.length;i++){
            String revW="";
            String word=sp[i];
            for (int j=word.length()-1;j>=0;j--){
                revW=revW+word.charAt(j);
            }
            
            emptystring=emptystring+revW+" ";
            
        }
        System.out.println(emptystring);
        System.out.println("The String reversed");

	}

}
