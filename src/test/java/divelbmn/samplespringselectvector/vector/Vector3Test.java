package divelbmn.samplespringselectvector.vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector3Test {

    private final double RELATIVE_ERROR = .001d;

    private Vector vector;


    @BeforeEach
    void initVector() {
        vector = new Vector3(new VectorDao(Arrays.asList(1.2d, 2.3d, 3.4d)));
    }

    @Test
    void dimensionsCount() {
        assertEquals(3, vector.dimensionsCount());
    }

    @Test
    void length() {
        assertEquals(4.277d, vector.length(), RELATIVE_ERROR);
    }
}