package divelbmn.samplespringselectvector.vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector1Test {

    private Vector vector;


    @BeforeEach
    void initVector() {
        vector = new Vector1(new VectorDao(Collections.singletonList(1.1d)));
    }

    @Test
    void dimensionsCount() {
        assertEquals(1, vector.dimensionsCount());
    }

    @Test
    void length() {
        assertEquals(1.1d, vector.length());
    }
}