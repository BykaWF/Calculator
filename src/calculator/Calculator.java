package calculator;

import java.util.Objects;

//Model
public class Calculator {
	private Double a;
	private Double b;
	private String operation;

	public Calculator(Double a, Double b, String operation) {
		this.a = a;
		this.b = b;
		this.operation = operation;
	}

	public Calculator() {
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Calculator that = (Calculator) o;
		return Objects.equals(a, that.a) && Objects.equals(b, that.b) && Objects.equals(operation, that.operation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, operation);
	}

	@Override
	public String toString() {
		return "Calculator{" + "a=" + a + ", b=" + b + ", operation=" + operation + '}';
	}
}
