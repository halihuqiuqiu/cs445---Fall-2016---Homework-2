package edu.iit.cs445.hw2.classimprove;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by YongYang on 9/27/16.
 */
public class ImprovedStringTokenizer extends StringTokenizer{
    public ImprovedStringTokenizer(String str){
        super(str);
    }
    public ImprovedStringTokenizer(String str, String delim){
        super(str,delim);
    }
    public ImprovedStringTokenizer(String str, String delim, boolean returnDelims){
        super(str,delim,returnDelims);
    }

    public String[] tokenArray(){
        ArrayList<String> tokenArrayList = new ArrayList<String>();
        while (this.hasMoreTokens()){
            tokenArrayList.add(this.nextToken());
        }
        String[] tokenArray = tokenArrayList.toArray(new String[tokenArrayList.size()]);
        return tokenArray;
    }
}
