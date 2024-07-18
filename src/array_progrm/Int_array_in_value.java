package array_progrm;

public class Int_array_in_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = {1, 2, 3, 4, 5};
	    int Find = 3;
	    boolean found = false;

	    for (int n : num) {
	      if (n == Find) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(Find + " True.");
	    else
	      System.out.println(Find + " False.");
	}

}
