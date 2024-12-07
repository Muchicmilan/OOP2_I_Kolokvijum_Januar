package ComplexNumbers;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {
    private ComplexNumber c1;
    private ComplexNumber c2;
    @BeforeEach
    void setUp() {
        c1 = new ComplexNumber(1,2);
        c2 = new ComplexNumber(2,3);
    }
    @Test
    void shouldCheckIfModulusIsCorrect() {
        double expectedModulus = Math.sqrt(1+2*2);
        Assertions.assertThat(c1.modulus()).isCloseTo(expectedModulus, Offset.offset(0.00001));
    }
    @Test
    void shouldCheckIfAdditionIsCorrect() {
        ComplexNumber c3 = c1.add(c2);
        double expectedReal = 1+2;
        double expectedImaginary = 2+3;
        Assertions.assertThat(c3.getReal()).isCloseTo(expectedReal, Offset.offset(0.00001));
        Assertions.assertThat(c3.getImag()).isCloseTo(expectedImaginary, Offset.offset(0.00001));
    }
    @Test
    void shouldCheckIfMultiplicationIsCorrect() {
        ComplexNumber c3 = ComplexNumber.multiply(c1, c2);
        double expectedReal = 2-(2*3);
        double expectedImaginary = 3+(2*2);
        Assertions.assertThat(c3.getReal()).isCloseTo(expectedReal, Offset.offset(0.00001));
        Assertions.assertThat(c3.getImag()).isEqualTo(expectedImaginary);
    }

}