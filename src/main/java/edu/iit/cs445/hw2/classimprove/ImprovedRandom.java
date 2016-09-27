package edu.iit.cs445.hw2.classimprove;

import java.util.Random;

/**
 * This class improve the Random class by adding one method
 * Created by YongYang on 9/26/16.
 */
public class ImprovedRandom extends Random{
    /**
     * default constructor
     */
    public ImprovedRandom(){
        super();
    };

    /**
     * Constructor with parameter seed
     * @param seed
     */
    public ImprovedRandom(long seed){
        super(seed);
    };

    /**
     * generate a random integer between two specified integers
     * @param min
     * @param max
     * @return
     */
    public int randomIntInRange(int min, int max){
        Random rand=new Random();
        int randomNum= rand.nextInt(max-min)+min;
        return randomNum;
    }
}
