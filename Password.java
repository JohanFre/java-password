import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		String password = "asdasd";
		Scanner input = new Scanner(System.in);
		int attempts = 3;
		Boolean passInput = true;

		System.out.println("Enter the password: ");
		
		while (passInput && attempts-- > 0) {
			String passAttempt = input.nextLine();
			
			if (passAttempt.equals(password)) {
				System.out.println("Success!");
			}
			else if (!passAttempt.equals(password)) {
				System.out.println("Wrong password! Attempts remaining: " + attempts);
			}
			else {
				break;
			}
		}
		input.close();

	}
}
