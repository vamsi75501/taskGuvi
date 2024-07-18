package array_progrm;

public class Average_element {
	public static void main(String[] args) {
	        int [] numArray = { 45, 675, 6, 204, 33, 46 };
	        int sum = 0;

	        for (int  num: numArray) {
	           sum += num;
	        }

	        int  average = sum / numArray.length;
	        System.out.format("The average is:"+ average);
	}

}
