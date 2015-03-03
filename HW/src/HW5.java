
public class HW5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String s2 = "Elephant";
		System.out.println(s.length());
		System.out.println(s2.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		System.out.println(s2.charAt(1));
		
		
		//write the code to display the contents of s to the screen
		//one character at a time
		//H
		//e
		//l
		//l
		//o
		System.out.println("");
		for(int i = 0; i < s.length(); i++){
			System.out.println(s.charAt(i));
		}

	}

}
