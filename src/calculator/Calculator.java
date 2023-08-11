package calculator;

import java.util.Objects;
//Model
public class Calculator  {
    private Number a;
    private Number b;
    private Character operation;

    public Calculator(Number a, Number b, Character operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public Calculator(){}

    public Number getA() {
        return a;
    }

    public void setA(Number a) {
        this.a = a;
    }

    public Number getB() {
        return b;
    }

    public void setB(Number b) {
        this.b = b;
    }

    public Character getOperation() {
        return operation;
    }

    public void setOperation(Character operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return Objects.equals(a, that.a) && Objects.equals(b, that.b) && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, operation);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                ", operation=" + operation +
                '}';
    }
}
