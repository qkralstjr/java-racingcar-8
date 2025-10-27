package racingcar.exception;

public enum ErrorMessage {

    CAR_NAME_EMPTY ("자동차 이름은 공백일 수 없습니다."),
    CAR_NAME_TOO_LONG ("자동차 이름은 5자를 초과할 수 없습니다."),
    ATTEMPT_COUNT_NEGATIVE ("시도 횟수는 1 이상이어야 합니다."),
    ATTEMPT_COUNT_NOT_NUMBER ("시도 횟수는 숫자여야 합니다.");

    private final String message;
    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

