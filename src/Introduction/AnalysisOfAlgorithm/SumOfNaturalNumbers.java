package Introduction.AnalysisOfAlgorithm;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	
	static int sumOfNaturalNum(int j) {
		int sum=0;
		for(int k=1;k<=j;k++) {
			sum+=k;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
	    
	    System.out.println(sumOfNaturalNum(i));
	}

}
