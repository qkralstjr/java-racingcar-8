package racingcar.domain;

import racingcar.view.OutputView;

public class RacingGame {
    private final Cars cars;
    private final int round;
    private final OutputView outputView;

    public RacingGame(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
        this.outputView = new OutputView();
    }

    public void play() {
        outputView.printResultHeader();
        for (int i = 0; i < round; i++) {
            cars.playRound();
            outputView.printRaceResult(cars);
        }
    }
}
