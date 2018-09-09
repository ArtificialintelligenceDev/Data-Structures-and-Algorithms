/* Name:      Joseph Santos
 * Date:      09.08.18
 * E-Mail:    jtsantos0001@student.stcc.edu
 * Student #: 0284385
 * 
 */

public class HW_1_Emirp {
	 public static void main(String[] args) {
		 emirpMatrix(); 
	    }
	 
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// This method will print the 100 emirps.
	 public static void emirpMatrix() {
		 // Initialize variables. I start at 13 because 1-12 are not emirps. 
		 int eCounter = 0;
		 int eNum = 13;
		 
		 //While the number of emirps is less than 100, if the emirp is prime, add another emirp.
		 while (eCounter < 100) {
			 if(isPrime(eNum))
				 if (checkEmirp(eNum)) {
					 eCounter ++;
					// if the number of emirps per line when divided by 10 have no remainder, this must mean its at 10 numbers so go to the next line.
					 if (eCounter % 10 == 0)
						 System.out.printf("%d \n", eNum);
					 
					 else
						 // Otherwise print the next number.
						System.out.printf("%-5d", eNum);
						 
				 }
			 // increment to next emirp number.
			 eNum++;
		 }
	 }
	 
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
	 // Return true if num is emirp
	 public static boolean checkEmirp(int eNum) {
		 int reverseEmirp = Integer.parseInt(new StringBuilder(Integer.toString(eNum)).reverse().toString());
		 /*numbers like 11 or 777 are not emirps because an emirp is a DIFFERENT number. This 
		  * if statement checks for these numbers.
		  */
		 if (eNum == reverseEmirp)
			 return false;
		 // If number is prime and when reversed. is an emirp, return true, otherwise return false.
		 if(isPrime(reverseEmirp))
			 return true;
		 return false;
	 }
	 
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 
	 // Checking for prime number by utilizing the insightful Silvestri method isPrime. 
	 private static boolean isPrime(int eNum) {
			for (int i = 2; i <= (int)(Math.sqrt(eNum)); i++)
				if (eNum % i == 0)
					return false;
			return true;
		}
	}


