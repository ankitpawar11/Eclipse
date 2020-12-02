package Recursion.RecursionOPPracticePart1;

public class Prog1 {
	
	static void fun1(int n) {
		if(n<1)
			return;
		System.out.println(n);
		fun1(n-1);
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		fun1(3);

	}

}
