package Sparsh;

public class secondhighest {
	public static void main(String arg[]) {
		int arr[]= {1,56,45,6,90,68};
		
		int h1=arr[0],h2=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>h2) {
				h2=arr[i];
				if(h2>h1)
				{
					int temp= h1;
					h1=h2;
					h2 =temp;
				}
			}
		}
		System.out.println("Second highesr no. is: "+h2);
		
	}


}
