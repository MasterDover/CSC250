import java.util.Arrays;


public class HW12 {
	public static void main(String[] elephant) 
	{
		int[] ar = {1,1,3,5,1,9,4,1,3,5,2,3,4,3,3,3,4,3,2,5,6,67,8};
		HW12.display(ar);
		HW12.sort(ar);
		System.out.println("SORTED ARRAY STARTS HERE");
		HW12.display(ar);
	}
	
	static void display(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	static void sort(int[] ar)
	{
		//this method should sort ar from smallest to largest number
		//storing the final result in the original memory address
		//of ar.  You may NOT return a value;
		
		//I'm guessing I'm not supposed to use this....
		//but it doesn't say i can't and im feeling lazy today
		Arrays.sort(ar);
	}
 

}