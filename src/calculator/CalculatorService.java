package calculator;

// Brain operation
public class CalculatorService {
    private Calculator calculator;

    private CalculatorRepo calculatorRepo;

    Number addition(){
        Number res;
        if(calculatorRepo.isEmpty()){
            if(calculator.getA() instanceof Double || calculator.getB() instanceof Double ){
                res = calculator.getA().doubleValue() + calculator.getB().doubleValue();

            }else {
                res = calculator.getA().intValue() + calculator.getB().intValue();
            }
        }else {
            if(calculator.getA() instanceof Double){
                res = calculatorRepo.getLastResult().doubleValue() + calculator.getA().doubleValue();
            }else {
                res = calculatorRepo.getLastResult().intValue() + calculator.getA().intValue();
            }
        }
        calculatorRepo.save(res);
        return res;

    }

    Number subtraction(){
        Number res;
        if(calculatorRepo.isEmpty()){
            if(calculator.getA() instanceof Double || calculator.getB() instanceof Double ){
                res = calculator.getA().doubleValue() - calculator.getB().doubleValue();

            }else {
                res = calculator.getA().intValue() - calculator.getB().intValue();
            }
        }else {
            if(calculator.getA() instanceof Double){
                res = calculatorRepo.getLastResult().doubleValue() - calculator.getA().doubleValue();
            }else {
                res = calculatorRepo.getLastResult().intValue() - calculator.getA().intValue();
            }
        }
        calculatorRepo.save(res);
        return res;
    }

    Number multiplication(){
        Number res;
        if(calculatorRepo.isEmpty()){
            if(calculator.getA() instanceof Double || calculator.getB() instanceof Double ){
                res = calculator.getA().doubleValue() * calculator.getB().doubleValue();

            }else {
                res = calculator.getA().intValue() * calculator.getB().intValue();
            }
        }else {
            if(calculator.getA() instanceof Double){
                res = calculatorRepo.getLastResult().doubleValue() * calculator.getA().doubleValue();
            }else {
                res = calculatorRepo.getLastResult().intValue() * calculator.getA().intValue();
            }
        }
        calculatorRepo.save(res);
        return res;
    }

    Number division(){

        Number res;
        if(calculatorRepo.isEmpty()){
            if(calculator.getA() instanceof Double || calculator.getB() instanceof Double ){
                res = calculator.getA().doubleValue() / calculator.getB().doubleValue();

            }else {
                res = calculator.getA().intValue() / calculator.getB().intValue();
            }
        }else {
            if(calculator.getA() instanceof Double){
                res = calculatorRepo.getLastResult().doubleValue() / calculator.getA().doubleValue();
            }else {
                res = calculatorRepo.getLastResult().intValue() / calculator.getA().intValue();
            }
        }
        calculatorRepo.save(res);
        return res;
    }
}
