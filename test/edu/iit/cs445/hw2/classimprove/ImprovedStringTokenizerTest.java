package edu.iit.cs445.hw2.classimprove;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by YongYang on 9/27/16.
 */
public class ImprovedStringTokenizerTest {
    ImprovedStringTokenizer t= new ImprovedStringTokenizer("This class is easy");
    @Test
    public void tokenArray() throws Exception {

        String[] exp ={"This", "class", "is", "easy"};
        String[] test = t.tokenArray();
        Assert.assertArrayEquals(exp,test);
    }

}