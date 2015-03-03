
public class HW6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printReverse("123456789");

	}
	
	public static void printReverse(String s){
		String temp = "";
		for(int i = 1; i <= s.length(); i++)
		{
			temp += s.charAt(s.length() - i);
		}
		System.out.println(temp);
	}

}
