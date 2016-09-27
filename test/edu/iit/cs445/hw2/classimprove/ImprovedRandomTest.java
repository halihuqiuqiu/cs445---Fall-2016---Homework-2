package edu.iit.cs445.hw2.classimprove;

import static org.junit.Assert.*;

/**
 * Created by YongYang on 9/26/16.
 */
public class ImprovedRandomTest {
    ImprovedRandom r= new ImprovedRandom();
    @org.junit.Test
    public void randomIntInRange() throws Exception {
        int radnomNum= r.randomIntInRange(5,10);
        assertTrue(radnomNum>=5 && radnomNum<10 );
        assertFalse(radnomNum<5);
        assertFalse(radnomNum>=10);

    }

}