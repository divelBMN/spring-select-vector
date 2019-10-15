package divelbmn.samplespringselectvector.vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector2Test {

    private final double RELATIVE_ERROR = .001d;

    private Vector vector;


    @BeforeEach
    void initVector() {
        vector = new Vector2(new VectorDao(Arrays.asList(1.2d, 2.3d)));
    }

    @Test
    void dimensionsCount() {
        assertEquals(2, vector.dimensionsCount());
    }

    @Test
    void length() {
        assertEquals(2.594d, vector.length(), RELATIVE_ERROR);
    }
}