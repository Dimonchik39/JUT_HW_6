import org.example.AverageNumberList;
import org.example.FindMaxNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class AverageNumberListTest {
    private AverageNumberList averageNumberList;
    private FindMaxNumber findMaxNumber;

    @BeforeEach
    void setUp() {
        averageNumberList = new AverageNumberList();
        findMaxNumber = new FindMaxNumber();
    }

    @Test
    void findAverageInList() {
        List<Integer> list = Arrays.asList(2, 3, 4, 2, 3, 4);
        assertThat(averageNumberList.getAverage(list)).isEqualTo(3);
    }

    @Test
    void maxNumberIsNumber2() {
        assertThat(findMaxNumber.findMaxNum(2, 3))
                .isEqualTo("Второй список имеет большее среднее значение: 3.0");
    }

    @Test
    void maxNumberIsNumber1() {
        assertThat(findMaxNumber.findMaxNum(3, 2))
                .isEqualTo("Первый список имеет большее среднее значение: 3.0");
    }

    @Test
    void equalNumbers() {
        assertThat(findMaxNumber.findMaxNum(3, 3))
                .isEqualTo("Среднее значение списков равны: 3.0");
    }
}


    


