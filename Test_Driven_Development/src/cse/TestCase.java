package cse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

    @Test
    public void findAdd() {
        assertEquals(12, Addition.add(3, 9));
    }
}
