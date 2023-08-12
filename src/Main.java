import java.util.Scanner;

import calculator.Calculator;
import calculator.CalculatorRepo;
import calculator.CalculatorService;
import calculator.HandleFlow;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		CalculatorRepo calculatorRepo = new CalculatorRepo();

		CalculatorService calculatorService = new CalculatorService(calculator, calculatorRepo);
		
		HandleFlow hf = new HandleFlow(calculator,calculatorRepo,calculatorService, new Scanner(System.in));
		hf.start();
    }
	

}