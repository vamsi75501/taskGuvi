package string_program;

import java.util.Scanner;

public class Remove_whitespace {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		str=str.replaceAll("\\s+", "");
		
		System.out.println("Remove whitespace:" +str);
	}
}
