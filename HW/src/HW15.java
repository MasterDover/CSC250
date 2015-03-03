
public class HW15 {
		public static void main(String[] elephant) 
		{
			int[] f1 = {1,2};
			int[] f2 = {1,4};
			int[] answer = HW15.addFractions(f1, f2);
			HW15.displayFraction(answer);
			HW15.reduce(answer);
			HW15.displayFraction(answer);
		}
		
		static int[] divideFractions(int[] cat, int[] dog)
		{
			//should return the result of cat divided by dog
			
			int top1 = cat[0];
			int top2 = dog[1];
			
			int bot1 = cat [1];
			int bot2 = dog[0];
			
			int newTop = top1*top2;
			int newBot = bot1*bot2;
			
			int[] catdog = {newTop, newBot};
			return catdog;
		}
		
		static int[] multiplyFractions(int[] cat, int[] dog)
		{
			int top1 = cat[0];
			int top2 = dog[0];
			
			int bot1 = cat [1];
			int bot2 = dog[1];
			
			int newTop = top1*top2;
			int newBot = bot1*bot2;
			
			int[] catdog = {newTop, newBot};
			return catdog;
		}
		
		static int[] subtractFractions(int[] cat, int[] dog)
		{
			int newDenom = cat[1] * dog[1];
			int newNum1 = cat[0] * dog[1];
			int newNum2 = dog[0] * cat[1];
			int[] answer = {(newNum1 - newNum2), newDenom};
			return answer;
		}
		
		static int[] addFractions(int[] cat, int[] dog)
		{
			//calc the common denom
			int newDenom = cat[1] * dog[1];
			int newNum1 = cat[0] * dog[1];
			int newNum2 = dog[0] * cat[1];
			int[] answer = {(newNum1 + newNum2), newDenom};
			return answer;
		}
		
		static void reduce(int[] f)
		{
			int smaller;
			if(f[0] < f[1])
			{
				smaller = f[0];
			}
			else
			{
				smaller = f[1];
			}
			
			//smaller will be equal to the smaller of numerator and denominator
			while(f[0] % smaller != 0 || f[1] % smaller != 0)
			{
				smaller--;
			}
			
			//smaller is now equal to the largest value that evenly divides both
			//the numerator and the denominator
			f[0] = f[0]/smaller;
			f[1] = f[1]/smaller;
		}
		
		static void displayFraction(int[] f)
		{
			System.out.println(f[0] + "/" + f[1]);
		}

	}
