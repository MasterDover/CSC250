
public class HW7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeVowels("Noobcake"));
	

	}
	
	static String removeVowels(String s)
	{
		String temp = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'y')
			{
				temp = temp + s.charAt(i);
			}
			else
			{
				temp = temp + "";
			}
		}
		return temp;
 

	}

}
