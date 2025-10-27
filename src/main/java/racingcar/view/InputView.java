package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.exception.ErrorMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        List<String> carNames = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
        validateCarNames(carNames);
        return carNames;
    }

    private void validateCarNames(List<String> carNames) {
        for (String carName : carNames) {
            if (carName == null || carName.trim().isEmpty()) {
                throw new IllegalArgumentException(String.valueOf(ErrorMessage.CAR_NAME_EMPTY));
            }
            if (carName.length() > 5) {
                throw new IllegalArgumentException(String.valueOf(ErrorMessage.CAR_NAME_TOO_LONG));
            }
        }
    }

    public int readAttemptCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        validateAttemptCount(input);
        return Integer.parseInt(input);
    }

    private void validateAttemptCount(String input) {
        try {
            int attemptCount = Integer.parseInt(input);
            if (attemptCount < 1) {
                throw new IllegalArgumentException(String.valueOf(ErrorMessage.ATTEMPT_COUNT_NEGATIVE));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.valueOf(ErrorMessage.ATTEMPT_COUNT_NOT_NUMBER));
        }
    }
}
