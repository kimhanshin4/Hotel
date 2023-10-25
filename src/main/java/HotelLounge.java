import io.input.InputView;
import io.output.OutputView;

import java.io.IOException;

public class HotelLounge {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void init() throws IOException {
        outputView.printSomething();
        int pick = inputView.getInputNumber();
        if (pick != 1 && pick != 2) {
            throw new IllegalArgumentException();
        }
    }
}
