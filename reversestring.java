package Sparsh;

public class reversestring {
	public static void main(String arg[]) {
		String str = "Sparsh";
		char array[]= str.toCharArray();
		for(int i=array.length-1;i>=0;i--)
			System.out.print(array[i]);
	}

}
