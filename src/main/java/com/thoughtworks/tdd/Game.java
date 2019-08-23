package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class Game {

    private static final String FUZZ = "Fuzz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String fuzzBuzz(int i){
        String result = "";

        if(i % 3 == 0){
            result += FUZZ;
        }
        if(i % 5 == 0){
            result += BUZZ;
        }
        if(i % 7 == 0){
            result += WHIZZ;
        }

        if(result.equals("")){
            result = String.valueOf(i);
        }
        return result;
    }
}
