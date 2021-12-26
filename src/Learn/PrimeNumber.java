package Learn;

import java.util.Scanner;

public class PrimeNumber{
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int c=2;
		while(c*c <= num) {
			if(num%c == 0) {
				System.out.println("Not prime");
				break;
			}
			c = c + 1;
		}
		if(c*c > num)
			System.out.println("Prime");
		
  }
		
}
	

