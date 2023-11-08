package lotto.validators;

import static lotto.constant.ErrorMessage.INPUT_BONUS_NUMBER_IN_WINNING_NUMBERS;

import java.util.List;

public class BonusNumberValidator {
    public static void validBonusNumberInWinningNumbers(List<Integer> winningNumbers, Integer bonusNumber) {
        if (isBonusNumberInWinningNumbers(winningNumbers, bonusNumber)) {
            throw new IllegalArgumentException(INPUT_BONUS_NUMBER_IN_WINNING_NUMBERS);
        }
    }

    private static boolean isBonusNumberInWinningNumbers(List<Integer> winningNumbers, Integer bonusNumber) {
        return winningNumbers.contains(bonusNumber);
    }
}