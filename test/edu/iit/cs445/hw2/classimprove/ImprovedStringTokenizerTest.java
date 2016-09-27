package edu.iit.cs445.hw2.classimprove;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * unit test for class ImprovedStringTokenizer
 * Created by YongYang on 9/27/16.
 */
public class ImprovedStringTokenizerTest {
    /** instantiation of class ImprovedStringTokenizer to test */
    ImprovedStringTokenizer t= new ImprovedStringTokenizer("This class is easy");

    /**
     * Unit test for {@link ImprovedStringTokenizer#tokenArray()}
     * @throws Exception
     */
    @Test
    public void tokenArray() throws Exception {

        String[] exp ={"This", "class", "is", "easy"};
        String[] test = t.tokenArray();
        Assert.assertArrayEquals(exp,test);
    }

}