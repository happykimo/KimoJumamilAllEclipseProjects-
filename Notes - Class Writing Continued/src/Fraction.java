
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	/* what you call the parameters/arguments does not matter so long
	 * as they are sensical and reasonable names
	 */
	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}
	/*
	 * Complete the toString method so that a Fraction object
	 * is printed as numerator/denominator such as 3/4 or 5/4
	 */
	public String toString() {
		return numerator+"/"+denominator;
	}
	
	public String mixedFraction() {
		int num = numerator%denominator;
		int bNum = numerator/denominator;
		String result;
	if(numerator>denominator&& num!=0){
		result = bNum+ " " +num+"/"+denominator;
	}
	else if(numerator>denominator && num==0) {
		result = ""+bNum;
	}
	else {
		result = numerator+"/"+denominator;
	}
	return result;
	}
	
	/* complete the method mixedFraction which represents the Fraction
	 * object as a mixed fraction IFF it is an improper fraction
	 * example(s)
	 *    5/4 -> 1 1/4
	 *    3/4 -> 3/4
	 *    10/2-> 5
	 *    3/2 -> 1 1/2
	 */
	
	public void add(Fraction f2) {
		int fNumerator;
		int fDenominator;
		//we're inside a Fraction object with num/den
		//we're adding a Fraction object to itself
	if(denominator == f2.denominator) {
		fNumerator = numerator+f2.numerator;
		fDenominator = denominator;
	}
	else {
		fDenominator = denominator*f2.denominator;
		fNumerator = (numerator*f2.denominator)+(f2.numerator*denominator);
	}
	numerator = fNumerator;
	denominator = fDenominator;
	}
	public String multiply(Fraction f2) {
		String result;
		int fNumerator = numerator*f2.numerator;
		int fDenominator = denominator *f2.denominator;
		result = fNumerator+"/"+fDenominator;
		return result;
	}
	public void simplify() {
		if (denominator%2 == 0) {
			while(denominator%2==0) {
			denominator/=2;
			numerator/=2;
			if(numerator%denominator == 0) {
				numerator /= denominator;
				denominator = 1;
			}
		}
		}
		else if(denominator%3 == 0) {
			while(denominator%3 == 0) {
				denominator/=3;
				numerator/=3;
				if(numerator%denominator == 0) {
					numerator /= denominator;
					denominator = 1;
				}
			}
		}
		else if(denominator%5==0) {
			while(denominator%5==0) {
				denominator/=5;
				numerator/=5;
				if(numerator%denominator == 0) {
					numerator /= denominator;
					denominator = 1;
				}
			}
		}
		else if(denominator%7==0) {
			while(denominator%7==0) {
				denominator/=7;
				numerator/=7;
				if(numerator%denominator == 0) {
					numerator /= denominator;
					denominator = 1;
				}
			}
		}
		
		
	}
}
