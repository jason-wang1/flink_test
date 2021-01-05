import org.apache.flink.api.java.tuple.Tuple2;
import org.junit.Test;
import udf.WordToWordCountUDF;

import static org.junit.Assert.*;

public class WordToWordCountUDFTest {

    @Test
    public void map() {
        WordToWordCountUDF wordToWordCountUDF = new WordToWordCountUDF();

        assertEquals(Tuple2.of("hadoop", 1), wordToWordCountUDF.map("hadoop"));
    }
}