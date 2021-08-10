package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		
		System.out.println("The first number is: " +firstNum);
		System.out.println("The second number is: " +secNum);
		
		for (int i = 0; i <6; i++) {
			
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.println("Sum:" +sum);
		}
	}

}
