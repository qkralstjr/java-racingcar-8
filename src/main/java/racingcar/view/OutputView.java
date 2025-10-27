package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {

    public void printResultHeader() {
        System.out.println("\n실행 결과");
    }

    public void printRaceResult(Cars cars) {
        List<Car> carList = cars.getCars();
        for (Car car : carList) {
            printCarResult(car);
        }
        System.out.println();
    }

    private void printCarResult(Car car) {
        String dashes = "-".repeat(car.getPosition());
        System.out.println(car.getName() + " : " + dashes);
    }

    public void printWinners(List<String> winners) {
        String winnerNames = String.join(", ", winners);
        System.out.println("최종 우승자 : " + winnerNames);
    }
}
