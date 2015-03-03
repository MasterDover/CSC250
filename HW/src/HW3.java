
public class HW3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
				
		for(int i = 0; i <= 1000000; i++) {
			if(i % 2 != 0) {
				count++;
			}
		}
		System.out.println("total odd numbers: " + count);
	}

}
