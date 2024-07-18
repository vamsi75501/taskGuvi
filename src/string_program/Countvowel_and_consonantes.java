package string_program;

public class Countvowel_and_consonantes {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String s="Hello guvi welcome you on board";
		int count1=0,count2=0;
		
		String h=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count1++;
				//System.out.println(s);
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count2++;
				//System.out.println(s);
			}
		}
System.out.println("no.of.Vowels:"+count1);

System.out.println("no.of.Vowels:"+count2);
System.out.println("no.of.Vowels:"+ h);
	 
	}

}
