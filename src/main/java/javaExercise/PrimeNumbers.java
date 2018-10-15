package javaExercise;

public class PrimeNumbers {

	  public static boolean isPrime(int num) {
		  boolean isNumberPrime = true;
		  
		  for(int i=2; i<num;i++) {
			  if(num%i==0) {
				  isNumberPrime = false;
			
			  }
		  }
		return isNumberPrime;
	  }
	   public static void primeNumbers(int max) {
		   
		   int initial = 1, num =2;
		   
		  while(num<=max) {
			  if(isPrime(num)) {
				  System.out.print(num+"\t");
				 // initial++;
			  }
			  num++;
		  }
	   }
	  public static void main(String[] args) {
		primeNumbers(150);
		 
	}
}
