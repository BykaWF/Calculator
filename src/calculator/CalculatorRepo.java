package calculator;

import java.util.List;

//Storage
public class CalculatorRepo {
    private List<Number> storage;

    public CalculatorRepo(List<Number> storage) {
        this.storage = storage;
    }

    void save(Number result){
        storage.add(result);
    }

    void clean(){
        storage.clear();
    }

    Number getLastResult(){
        return storage.get(storage.size() -1);
    }

    boolean isEmpty(){
        return storage.isEmpty();
    }
}
