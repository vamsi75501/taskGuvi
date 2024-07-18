package string_program;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	
		
		
		Scanner SC=new Scanner(System.in);
		System.out.println("ENTER THE LETTERS");
        String letters=SC.nextLine();
        String arr[]=letters.split("");
        String rev="";
        for (int i=arr.length-1;i>=0;i--) {
        	rev=rev+arr[i]+"";
        }
        System.out.println(rev);
        if(letters.equals(rev)||(letters.equalsIgnoreCase(rev))) {
        	System.out.println("PALINDROME");
        	
        }
        else {
        	System.out.println("Not a PAlindrome");
        }
	}

}
