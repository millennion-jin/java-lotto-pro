package lotto.domain;

import java.util.Objects;
import lotto.constants.LottoConstants;

public class LottoNumber {

    private static final String ERROR_MESSAGE_NUMBER_OUT_OF_RANGE = "[ERROR] This number is out of range.";

    private final int number;

    public LottoNumber(final int number) {
        validateNumberRange(number);

        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private void validateNumberRange(final int number) {
        if (number < LottoConstants.MIN_LOTTO_NUMBER || number > LottoConstants.MAX_LOTTO_NUMBER) {
            throw new IllegalArgumentException(ERROR_MESSAGE_NUMBER_OUT_OF_RANGE);
        }
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof LottoNumber)) {
            return false;
        }
        return this.number == ((LottoNumber) obj).getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.number);
    }
}
