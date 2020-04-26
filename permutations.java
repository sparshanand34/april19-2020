package Sparsh;

public class permutations {
	public static void main(String arg[]) {
		String str="maN";
		
		permutations(str,0);
	}

	private static void permutations(String str, int pos) {
		int len = str.length();
		
		if(pos==len) {
			System.out.println(str);
			return;
		}
		for(int i=pos;i<len;i++)
		{
			str = swap(str,i,pos);
			permutations(str,pos+1);
			swap(str,i,pos);
		}
		
	}

	private static String swap(String str, int a, int b) {
		char arr[]=str.toCharArray();
		char temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		return new String(arr);
	}


}
