package pc;

import java.util.Scanner;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
public class UserInput {
	Scanner input = new Scanner(System.in);
	
	public UserInput() {
		super();
	}
	public String inputString() {
		return input.nextLine();
	}
	public int inputInt() {
		return input.nextInt();
	}
}
