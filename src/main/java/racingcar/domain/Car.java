package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.exception.ErrorMessage;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(String.valueOf(ErrorMessage.CAR_NAME_EMPTY));
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException(String.valueOf(ErrorMessage.CAR_NAME_TOO_LONG));
        }
    }

    public void move() {
        int rn = Randoms.pickNumberInRange(0, 9);
        if (rn >= 4) {
            position++;
        }
    }

    public String getName(){
        return name;
    }
    public int getPosition(){
        return position;
    }
}
