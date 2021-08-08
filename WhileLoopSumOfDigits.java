package week1.assignments;

public class WhileLoopSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num = 234;
	int sum=0;

	
	while (num!=0) {
	
		sum= sum+num%10;
		num=num/10;
		
	}
		System.out.println("Sum of digits is " + sum );
		
	}
	}