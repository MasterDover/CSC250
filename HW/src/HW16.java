
public class HW16 {


		public class Fraction 
		{
			//Fields
			int numerator;
			int denominator;
			
			//Contructor
			public Fraction(int numerator, int denominator)
			{
				//this = new Object();
				this.numerator = numerator;
				this.denominator = denominator;
				//return this;
			}
			
			//Methods
			Fraction add(Fraction f)
			{
				//should add two fractions creating a new Fraction that is the reduced result
				
				int commonDenom = f.denominator * this.denominator;
				int newNum = (f.numerator * this.denominator) + (f.denominator * this.numerator);
				
				return f.reduce();
				
			}
			
			public Fraction reduce()
			{
				int smaller;
				if(this.numerator < this.denominator)
				{
					smaller = this.numerator;
				}
				else
				{
					smaller = this.denominator;
				}
				
				//smaller will be equal to the smaller of numerator and denominator
				while(this.numerator % smaller != 0 || this.denominator % smaller != 0)
				{
					smaller--;
				}
				
				//smaller is now equal to the largest value that evenly divides both
				//the numerator and the denominator
				this.numerator = this.numerator/smaller;
				this.denominator = this.denominator/smaller;
				Fraction f = new Fraction(this.numerator, this.denominator);
				return f;
			}
			
			void display()
			{
				System.out.println(numerator + "/" + denominator);
			}
		 
		}
	}
