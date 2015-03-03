
public class HW9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(doMath("20 +34"));

	}
	
	public static int doMath(String s){
			String[] temp = new String[2];
			temp = s.split(" +");
			String temp1 = temp[0].toString();
			String temp2 = temp[1].toString();
			int num1 = Integer.parseInt(temp1);
			int num2 = Integer.parseInt(temp2);
			
			int answer = num1 + num2;
			
			return answer;
	}

}
