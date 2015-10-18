import java.util.Scanner;
public class Leap {
	
	public static void main (String args[]) {
		Scanner key = new Scanner (System.in);
		System.out.print("Enter the Start year: ");
		int start = key.nextInt();
		System.out.print("Enter the final year: ");
		int finish = key.nextInt();
		
		while (start <= finish) {
			if (start % 4 == 0 && start % 100 != 0 || start % 400 == 0){
				System.out.println(start + " This is a Leap Year");
				start++;
			}
			else {
				System.out.println(start + " This is not a leap year");
				start++;
			}	
		}
	}
}

	