package edu.iit.cs445.hw2.classimprove;

import java.util.Random;

/**
 * Created by YongYang on 9/26/16.
 */
public class ImprovedRandom extends Random{
    public ImprovedRandom(){
        super();
    };
    public ImprovedRandom(long seed){
        super(seed);
    };

    public int randomIntInRange(int min, int max){
        Random rand=new Random();
        int randomNum= rand.nextInt(max-min)+min;
        return randomNum;
    }
}
