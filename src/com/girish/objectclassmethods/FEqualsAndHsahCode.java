package com.girish.objectclassmethods;

public class FEqualsAndHsahCode {
	private String color;
	private String stripePattern;
	private int height;

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			FEqualsAndHsahCode tiger = (FEqualsAndHsahCode) object;
			if (this.color == tiger.getColor()
					&& this.stripePattern == tiger.getStripePattern()) {
				result = true;
			}
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		System.out.println("Color hash code"+this.color.hashCode());
		hash = 7 * hash + this.color.hashCode();
		
		System.out.println("Hash value is before for color"+hash);
		hash = 7 * hash + this.stripePattern.hashCode();
		System.out.println("Hash code for StripePatter "+hash);
		return 1;
	}

	public static void main(String args[]) {
		FEqualsAndHsahCode bengalTiger1 = new FEqualsAndHsahCode("Yellow", "Dense", 3);
		
		FEqualsAndHsahCode bengalTiger2 = new FEqualsAndHsahCode("Yellow", "Dense", 2);
		FEqualsAndHsahCode siberianTiger = new FEqualsAndHsahCode("White", "Sparse", 4);
		System.out.println("bengalTiger1 and bengalTiger2: "+ bengalTiger1.equals(bengalTiger2));
		System.out.println("bengalTiger1 and siberianTiger: "+ bengalTiger1.equals(siberianTiger));

		System.out.println("bengalTiger1 hashCode: " + bengalTiger1.hashCode());
		System.out.println("bengalTiger2 hashCode: " + bengalTiger2.hashCode());
		System.out.println("siberianTiger hashCode: " + siberianTiger.hashCode());
	}

	public String getColor() {
		return color;
	}

	public String getStripePattern() {
		return stripePattern;
	}

	public FEqualsAndHsahCode(String color, String stripePattern, int height) {
		this.color = color;
		this.stripePattern = stripePattern;
		this.height = height;

	}
}
