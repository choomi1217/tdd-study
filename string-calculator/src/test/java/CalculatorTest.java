import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @DisplayName("원하는 결과값 출력")
    @CsvSource(
            value = {"1 + 2 + 3 = 6"
                    , "1 * 5 = 5"
                    , "5 * 5 / 5 = 5"}
            ,delimiter = '='
    )
    @ParameterizedTest
    void calculator_return_result(String testCase, int expect) {
        Calculator calculator = new Calculator();
        calculator.init(testCase);
        calculator.calculate();
        Assertions.assertThat(calculator.result()).isEqualTo(expect);
    }
}
