
public class HW4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
				
		for(int i = 0; i <= 1000000; i++) {
			if((i % 3 == 0) && (i % 6 == 0) && (i % 9 == 0) && (i % 12 == 0)) {
				count++;
			}
		}
		System.out.println("total numbers divisible by 3,6,9, and 12: " + count);
	}

}
