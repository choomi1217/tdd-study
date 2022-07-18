package try1.Calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import try1.Calculator.Calculator;

public class CalculatorTest {

    @DisplayName("계산기에 부정확한 입력값을 입력하면 예외를 출력한다.")
    @ParameterizedTest
    @CsvSource({
            "+"
            , "1 ++ 2"
            , " 1 + 2 "
    })
    void calculator_return_exception(String testCase) {
        Calculator calculator = new Calculator(testCase);
    }

    @DisplayName("원하는 결과값 출력")
    @ParameterizedTest
    @CsvSource(
            value = {"1 + 2 + 3 = 6"
                    , "1 * 5 = 5"
                    , "5 * 5 / 5 = 5"}
            ,delimiter = '='
    )
    void calculator_return_result(String testCase, int expect) {
        Calculator calculator = new Calculator(testCase);
        calculator.calculate();
        Assertions.assertThat(calculator.result()).isEqualTo(expect);
    }
}
