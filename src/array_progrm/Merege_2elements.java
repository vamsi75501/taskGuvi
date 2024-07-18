package array_progrm;

import java.util.*;
public class Merege_2elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Array1 = {23,45,90,1};        
		int[] Array2 = {77,11,88,99,3}; 
		
		int n1 = Array1.length;       
		int n2 = Array2.length;  
		
		int[] result = new int[n1 + n2];
		
		System.arraycopy(Array1, 0, result, 0, n1);
		
		System.arraycopy(Array2, 0, result, n1, n2); 
		
		System.out.println(Arrays.toString(result));   
		
		
	}

}
