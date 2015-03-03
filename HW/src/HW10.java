
public class HW10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ar = {'h','e','l','l','o'};
		System.out.println(ar);
		HW10.reverseArray(ar);
		System.out.println(ar);
		

	}
	
	static void reverseArray(char[] i){

		char[] temp = new char[i.length];
			for(int x = 0; x < i.length; x++){
				temp[x] = i[i.length - (1+x)];
			}
			for(int x = 0; x < i.length; x++){
				i[x] = temp[x];
			}
	}

}
