package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	/**
	 * 
	 * @param f The fraction we are multiplying by
	 * @return the new multiplied fraction
	 */
	public Fraction multiply(Fraction f) {
		int n = this.numerator * f.numerator;
		int d = this.denominator * f.denominator;
		Fraction frac = new Fraction(n, d);
		return frac;
	}
	public Fraction simplify() {
		int commonDenominator = gcd(this.numerator, this.denominator);
		int simplifyNumerator = this.numerator/commonDenominator;
		int simplifyDenominator = this.denominator/commonDenominator;
		Fraction frac = new Fraction(simplifyNumerator, simplifyDenominator);
	}
	public int gcd(int p, int q) {
		if(q == 0)
		{
			return p;
		}
		else
		{
			return gcd(q, p%q);
		}
	}
	public Fraction add(Fraction f)
	{
		Fraction newThis = this.simplify();
		Fraction newF = f.simplify();
		
		int num = newThis.getNumerator() + newF.getNumerator();
		
		Fraction frac = new Fraction(num, );
	}
}
