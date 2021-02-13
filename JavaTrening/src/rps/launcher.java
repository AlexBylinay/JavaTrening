package rps;

import java.util.Scanner;

public class launcher {

	private static final int EXIT_COMMAND_CODE = 4;

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int cmd = -1;
		System.out.print("Введите любое целое число от 1 до 3: ");
		cmd = scan.nextInt();
		while (cmd != EXIT_COMMAND_CODE) {
			while (!isValid(cmd)) {

				System.out.print(" Неверный ввод, Введите любое целое число от 1 до 3 ");
				cmd = scan.nextInt();

			}
			if (cmd != EXIT_COMMAND_CODE) {
				RPS userInput = RPS.fromNum(cmd);
				RPS machineInput = RPS.fromNum(generateNumber());

				System.out.println("robot - " + machineInput + ": user - " + userInput + ":");
				RoundRecult rr = userInput.compare(machineInput);
				System.out.printf("Result: %s - %s%n", rr, rr.getValue());
				System.out.print("Введите любое целое число от 1 до 3: ");
				cmd = scan.nextInt();

			}
		}
		System.out.println("Program termited");
		scan.close();

	}

	private static boolean isValid(int cmd) {
		return RPS.isValid(cmd) || cmd == EXIT_COMMAND_CODE;
	}

	public static int generateNumber() {
		return (int) (1 + Math.random() * 3);
	}
}
