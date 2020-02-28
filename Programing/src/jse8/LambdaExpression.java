package jse8;

public class LambdaExpression {
	static String picklist="If \"Implied Consent (CA)\"";
	public static void main(String[] args) {
		System.out.println("(//label[text()='"+picklist+"']/..//input)[position()=last()]");
	}

}
