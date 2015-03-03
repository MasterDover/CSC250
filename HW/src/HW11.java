
public class HW11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArray = {1,3,3,4,5,6,9,12,4,4,5,6,89,5,3,1,5,67,8,5,3,5,5,7,34,2,2,2,2,2,2,2,2};
		HW11.mostOccurences(iArray);

	}
	
	public static void mostOccurences(int[] ar){
		
		//makes the first number in the array start as most popular. so count starts at 1
		int count = 1;
		int tempCount;
		int popular = ar[0];
		int temp;
		//loops through the entire array
		for(int i = 0; i < (ar.length - 1); i++){
			temp = ar[i];
			tempCount = 0;
			
			//loops throught the array and counts all of the occurences of the int at ar[i]
			for(int x = 1; x < ar.length; x++)
			{
				if(temp == ar[x])
				{
					tempCount++;
				}
			}
			//if there are more than the previous most popular it replaces it
			if (tempCount > count)
			{
				popular = temp;
				count = tempCount;
			}
		}
		System.out.println("most popular: " + popular);
	}

}
