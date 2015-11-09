import java.io.InputStreamReader;
import java.io.BufferedReader;

public class HelloUser {
	public static String userName;
	
	public static void greetUser(String userName) {
		System.out.println("Hello " + userName + "!\n");
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("Hello ASE2015 - how are you? :)\nPlease enter your name: ");
			userName = br.readLine();
			greetUser(userName);

		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}
}