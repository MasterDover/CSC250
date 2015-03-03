import java.util.Arrays;

public class HW13 
{
	public static void main(String[] elephant) 
	{
		String[] ar = {"an", "animal", "came", "by", "the", "aardvark"};
		HW13.display(ar);
		HW13.bubbleSort(ar);
		HW13.display(ar);
	}
	
	static void display(String[] ar)
	{
		System.out.println("****************************************");
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("****************************************");
 
	}
	
	static void bubbleSort(String[] ar)
	{
		
		Arrays.sort(ar);
//		
//		int theFollower;
//		for(int currStart = 1; currStart < ar.length; currStart++)
//		{
//			theFollower = currStart;
//			while(theFollower != 0 && ar[theFollower] < ar[theFollower - 1])
//			{
//				int swap = ar[theFollower];
//				ar[theFollower] = ar[theFollower - 1];
//				ar[theFollower - 1] = swap;
//				theFollower--;
//			}
//		}
	}
	
	static void sort(int[] ar)
	{
		//this method should sort ar from smallest to largest number
		//storing the final result in the original memory address
		//of ar.  You may NOT return a value;
		
		for(int nextStart = 0; nextStart < ar.length; nextStart++)
		{
			int winner = ar[nextStart];
			int winnerPos = nextStart;
			for(int i = nextStart; i < ar.length; i++)
			{
				if(ar[i] < winner)
				{
					winner = ar[i];
					winnerPos = i;
				}
			}
			//winner holds the smallest value
			//winnerPos holds the index of the smallest value
			int swap = ar[winnerPos];
			ar[winnerPos] = ar[nextStart];
			ar[nextStart] = swap;
		}
	}
 

}