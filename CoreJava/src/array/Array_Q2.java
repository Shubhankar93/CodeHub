// Question - Shift all Zeros to end (Same Question as Array_Q1)
package array;

public class Array_Q2 {

	public static void main(String[] args) {
		int a[] = { 1, 0, 3, 0, 5, 0, 0, 9 };
		int l = a.length;
		for (int i=0; i<l; i++)
		{
			if (a[i] == 0  )
			{
				int t = 0;
				for (int j=1; j<l-i; j++){
					if (a[i+t+1] !=0){
					a[i+t] = a[i+t+1];
					t++;
					}
					
				}
				a[l-1] = 0;
			}
		}
		
		for (int k : a ){
		System.out.println(k);
		}

	}

}
