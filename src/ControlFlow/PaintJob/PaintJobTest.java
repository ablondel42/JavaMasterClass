package ControlFlow.PaintJob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintJobTest {

    @Test
    void getBucketCount4p() {
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        assertEquals(3, PaintJob.getBucketCount(3.4, 2.1, 1.5, 2 ));
        assertEquals(3, PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
    }

    @Test
    void getBucketCount3p() {
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5));
        assertEquals(14, PaintJob.getBucketCount(7.25, 4.3, 2.35));
    }

    @Test
    void getBucketCount2p() {
        assertEquals(3, PaintJob.getBucketCount(3.4, 1.5));
        assertEquals(3, PaintJob.getBucketCount(6.26, 2.2));
        assertEquals(5, PaintJob.getBucketCount(3.26, 0.75));
    }
}