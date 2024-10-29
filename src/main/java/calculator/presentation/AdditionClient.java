package calculator.presentation;

import java.math.BigInteger;

import calculator.service.AdditionService;
import calculator.presentation.view.InputView;
import calculator.presentation.view.OutputView;

public class AdditionClient {

    private final AdditionService additionService;

    public AdditionClient(final AdditionService additionService) {
        this.additionService = additionService;
    }

    public void run() {
        String input = readInput();

        BigInteger total = additionService.calculate(input);

        printAdditionResult(total);
    }

    private String readInput() {
        InputView inputView = new InputView();
        return inputView.read();
    }

    private void printAdditionResult(final BigInteger total) {
        OutputView outputView = new OutputView();
        outputView.printTotal(total);
    }

}
