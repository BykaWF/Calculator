package calculator;

import java.util.Scanner;

public class HandleFlow {

	private Calculator calculator;
	private CalculatorRepo calculatorRepo;
	private CalculatorService calculatorService;
	private Scanner scanner;

	public HandleFlow(Calculator calculator, CalculatorRepo calculatorRepo, CalculatorService calculatorService,
			Scanner scanner) {
		this.calculator = calculator;
		this.calculatorRepo = calculatorRepo;
		this.calculatorService = calculatorService;
		this.scanner = new Scanner(System.in);
	}

	public void start() {
		boolean flag = true;

		while (flag) {
			System.out.print("Enter operation: ");
			String operation = scanner.next();

			switch (operation) {
			case "+":
			case "-":
			case "*":
			case "/":
				handleOperation(operation);
				break;
			case "q":
				System.out.println("Thanks for your time, bye!");
				flag = false;
				break;
			case "n":
				calculatorRepo.clean();
				break;
			default:
				System.out.println("Invalid operation. Please enter a valid operation.");
			}

			System.out.println();
			System.out.println("---------------------");
		}
	}

	public void handleOperation(String operation) {
		if (calculatorRepo.isEmpty()) {
			System.out.print("A: ");
			double a = scanner.nextDouble();
			System.out.print("B: ");
			double b = scanner.nextDouble();
			calculator.setA(a);
			calculator.setB(b);
		} else {
			System.out.print(calculatorRepo.getLastResult() + " " + operation);
			calculator.setA(scanner.nextDouble());
		}

		double result = 0;
		switch (operation) {
		case "+":
			result = calculatorService.addition();
			break;
		case "-":
			result = calculatorService.subtraction();
			break;
		case "*":
			result = calculatorService.multiplication();
			break;
		case "/":
			result = calculatorService.division();
			break;
		}

		System.out.println("Result: " + result);
	}
}
