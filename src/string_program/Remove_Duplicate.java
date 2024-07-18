package string_program;

public class Remove_Duplicate {
	public static void main(String[] args) {
		 String s="Welcome";
		 StringBuilder sb= new StringBuilder();
		 
		 
		 for (int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 int idx=s.indexOf(ch, i+1);
			 if(idx==-1) {
				 //-1 means character that doesn't repeated in the given String
				 sb.append(ch);
			 }
		 }
		 System.out.println("remove duplicate value:"+sb);
	}

}
