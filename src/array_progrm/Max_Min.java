package array_progrm;

public class Max_Min {
	public static void main(String[] args) {
		
		int a[]= {100,45,73,596,473,456,93,98};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The max value:"+max);
		
		int min=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The min value:"+min);
	
		
		
	}

}
