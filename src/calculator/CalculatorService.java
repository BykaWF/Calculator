package calculator;

// Brain operation
public class CalculatorService {
	private Calculator calculator;

	private CalculatorRepo calculatorRepo;

	public CalculatorService(Calculator calculator, CalculatorRepo calculatorRepo) {
		this.calculator = calculator;
		this.calculatorRepo = calculatorRepo;
	}

	public Double addition() {
		Double res;
		if (calculatorRepo.isEmpty()) {
			
			res = calculator.getA() + calculator.getB();
			
		} else {
			
			res = calculatorRepo.getLastResult() + calculator.getA();
		}
		calculatorRepo.save(res);
		return res;

	}

	public Double subtraction() {
		Double res;
		if (calculatorRepo.isEmpty()) {

			res = calculator.getA() - calculator.getB();

		} else {

			res = calculatorRepo.getLastResult() - calculator.getA();

		}
		calculatorRepo.save(res);
		return res;
	}

	public Double multiplication() {
		Double res;
		if (calculatorRepo.isEmpty()) {

			res = calculator.getA() * calculator.getB();

		} else {

			res = calculatorRepo.getLastResult() * calculator.getA();

		}
		calculatorRepo.save(res);
		return res;
	}

	public Double division() {

		Double res = null;
		try {
		if (calculatorRepo.isEmpty()) {
			res = calculator.getA() / calculator.getB();
		} else {
			res = calculatorRepo.getLastResult() / calculator.getA();
		}
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException " + e.getMessage());
		}
		calculatorRepo.save(res);
		return res;
	}
}
