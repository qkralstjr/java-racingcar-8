package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        List<String> carNames = inputView.readCarNames();
        int round = inputView.readAttemptCount();

        Cars cars = new Cars(carNames);
        RacingGame racingGame = new RacingGame(cars, round);

        racingGame.play();

        List<String> winners = cars.findWinners();
        outputView.printWinners(winners);
    }
}
