package week1.assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 13;
		boolean flag= false;
		int m=num/2;

	
		for (int i = 2; i <m ; i++) {
			
			if(num%i==0) 
			{ 
			flag=true;
			break;
			}
		}		
			if(flag==false) {
				
				System.out.println("The number " + num + " is prime");
			}
			else
				System.out.println("The number " + num + "is not prime");
	}
}