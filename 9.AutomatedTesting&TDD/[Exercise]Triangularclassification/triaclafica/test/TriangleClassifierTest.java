import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

    @Test
    void triangles() {
        int triangleedgest = 2;
        int triangleedgend = 2;
        int triangleedgerd = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangles(triangleedgest, triangleedgend, triangleedgerd);
        assertEquals(expected, result);
    }

    @Test
    void triang() {
        int triangleedgest = 2;
        int triangleedgend = 2;
        int triangleedgerd = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.triangles(triangleedgest, triangleedgend, triangleedgerd);
        assertEquals(expected, result);
    }

    @Test
    void angles() {
        int triangleedgest = 3;
        int triangleedgend = 4;
        int triangleedgerd = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.triangles(triangleedgest, triangleedgend, triangleedgerd);
        assertEquals(expected, result);
    }

    @Test
    void triles() {
        int triangleedgest = 8;
        int triangleedgend = 2;
        int triangleedgerd = 3;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.triangles(triangleedgest, triangleedgend, triangleedgerd);
        assertEquals(expected, result);
    }

    @Test
    void trgles() {
        int triangleedgest = -1;
        int triangleedgend = 2;
        int triangleedgerd = 1;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.triangles(triangleedgest, triangleedgend, triangleedgerd);
        assertEquals(expected, result);
    }

    @Test
    void triaes() {
        int triangleedgest = 0;
        int triangleedgend = 1;
        int triangleedgerd = 1;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.triangles(triangleedgest, triangleedgend, triangleedgerd);
        assertEquals(expected, result);
    }
}