package CountPrime;
import java.util.Scanner;
public class PrimeNum {
	
		public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("enter positive number");
		int num=input.nextInt();
			 int count=0;
			for(int i=2;i<num;i++) 
				if(num%i==0) {
					count++;
			break;
				}
			if(count==0) {
			System.out.print("prime =");
			}
			else {
				System.out.print("not prime");
			}
			}

}
