package calculator;

import java.util.ArrayList;
import java.util.List;

//Storage
public class CalculatorRepo {
    private List<Double> storage = new ArrayList<>();

    
    public CalculatorRepo() {
    	
    }

    void save(Double result){
        storage.add(result);
    }

    public void clean(){
        storage.clear();
    }

    public Double getLastResult(){
        return storage.get(storage.size() -1);
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }
}
