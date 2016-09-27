package edu.iit.cs445.hw2.classimprove;

/**
 *test for class ImproveRandom
 * Created by YongYang on 9/27/16.
 */
public class TestImprovedRandom {
    public static void main(String[] args) {
        ImprovedRandom r= new ImprovedRandom();
        System.out.println(r.randomIntInRange(3,4));
        System.out.println(r.randomIntInRange(3,5));
        System.out.println(r.randomIntInRange(3,10));
    }
}
