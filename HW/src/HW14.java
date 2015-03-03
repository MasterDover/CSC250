
import java.util.Random;


public class HW14 
{
	public static void main(String[] args)
	{
		String[] ar = {"an", "animal", "came", "by", "the", "aardvark"};


		HW14.displayArray(ar);
		HW14.mergeSort(ar);
		HW14.displayArray(ar);
	}

	static void displayArray(String[] ar)
	{
		System.out.println("****************************");
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("****************************");
	}

	static void mergeSort(String[] ar)
	{
		HW14.mergeSortHelper(ar, 0, ar.length-1);
	}

	static void mergeSortHelper(String[] ar, int begin, int end)
	{
		if(begin != end)
		{
			int length = end - begin + 1;
			int beginLeft = begin;
			int endLeft = begin + (length/2) - 1;
			int beginRight = endLeft + 1;
			int endRight = end;

			//call mergeSortHelper on the left half
			HW14.mergeSortHelper(ar, beginLeft, endLeft);

			//call mergeSortHelper on the right half
			HW14.mergeSortHelper(ar, beginRight, endRight);

			//merge the halves
			String[] temp = new String[length];
			for(int i = 0; i < temp.length; i++)
			{
				if(beginLeft > endLeft)
				{
					//winner is the curr position in the right half
					temp[i] = ar[beginRight];
					beginRight++;
				}
				else if(beginRight > endRight)
				{
					//winner is the curr position in the left half
					temp[i] = ar[beginLeft];
					beginLeft++;
				}
				else
				{
					//both beginLeft and beginRight point to legal places
					if(ar[beginLeft].compareTo(ar[beginRight]) < 0)
					{
						//beginLeft is the winner
						temp[i] = ar[beginLeft];
						beginLeft++;
					}
					else
					{
						//beginRight is the winner
						temp[i] = ar[beginRight];
						beginRight++;
					}
				}
			}//end of for loop

			//now copy the contents of temp back into ar between begin and end
			for(int i = 0; i < temp.length; i++)
			{
				ar[begin+i] = temp[i];
			}
		}//end of if for not being a 1 list
	}//end of mergeSortHelper
}
