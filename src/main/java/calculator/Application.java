package calculator;

import calculator.presentation.AdditionClient;
import calculator.service.AdditionService;

public class Application {

    public static void main(String[] args) {
        AdditionClient additionClient = new AdditionClient(new AdditionService());
        additionClient.run();
    }

}
