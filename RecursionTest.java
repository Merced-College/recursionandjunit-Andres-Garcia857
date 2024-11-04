// Andres Garcia
// 11/2/2024
// CPSC-39-10111
// Recursion problems with JUnit testing

import static org.junit.Assert.*;
import org.junit.Test;

public class RecursionTest {
    
    /*
     * count8 JUnit Testing
    */
    @Test
    public void count8Tests() {
        assertEquals(1, Recursion.count8(8));

        assertEquals(3, Recursion.count8(88));

        assertEquals(2, Recursion.count8(834853));

        assertEquals(0, Recursion.count8(36925));

        assertEquals(17, Recursion.count8(888888888));
    }//End count8Tests

    /*
     * countHi JUnit Testing
    */
    @Test
    public void countHiTests() {
        assertEquals(1, Recursion.countHi("xhix"));

        assertEquals(2, Recursion.countHi("hihih"));

        assertEquals(0, Recursion.countHi("hello"));

        assertEquals(3, Recursion.countHi("hixxhixxhi"));

        assertEquals(4, Recursion.countHi("hixhivsdcvshisdshi"));
    }//End countHiTests

    /*
     * countHi2 JUnit Testing
    */
    @Test
    public void countHi2Tests() {
        assertEquals(1, Recursion.countHi2("hi"));

        assertEquals(0, Recursion.countHi2("xxhixx"));

        assertEquals(2, Recursion.countHi2("xhihihi"));

        assertEquals(3, Recursion.countHi2("hi, hi, hi everyone!"));

        assertEquals(4, Recursion.countHi2("hihihxhixhihihi"));
    }//End countHi2Tests

    /*
     * strCount JUnit Testing
    */
    @Test
    public void strCountTests() {
        assertEquals(2, Recursion.strCount("catcat", "cat"));

        assertEquals(3, Recursion.strCount("here, there, everywhere", "here"));

        assertEquals(0, Recursion.strCount("abound", "around"));
        
        assertEquals(4, Recursion.strCount("Pablo Sanchez-Garcia", "a"));

        assertEquals(5, Recursion.strCount("ash, bash, stash, lash, cash", "ash"));
    }//End strCountTests

    /*
     * stringClean JUnit Testing
    */
    @Test
    public void stringClean() {
        assertEquals("piza", Recursion.stringClean("pizza"));

        assertEquals("armadilo", Recursion.stringClean("armadillo"));

        assertEquals("fogy", Recursion.stringClean("foggy"));

        assertEquals("contour", Recursion.stringClean("contour"));

        assertEquals("wodland", Recursion.stringClean("wwooodllllannnndd"));
    }//End stringClean
}//End class