package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void should_return_1_when_input_1(){
        Game game = new Game();
        String result = game.fuzzBuzz(1);

        Assertions.assertEquals("1",result);
    }

    @Test
    public void should_return_Fuzz_when_input_3(){
        Game game = new Game();
        String result = game.fuzzBuzz(3);

        Assertions.assertEquals("Fuzz",result);
    }

    @Test
    public void should_return_Buzz_when_input_5(){
        Game game = new Game();
        String result = game.fuzzBuzz(5);

        Assertions.assertEquals("Buzz",result);
    }

    @Test
    public void should_return_Whizz_when_input_7(){
        Game game = new Game();
        String result = game.fuzzBuzz(7);

        Assertions.assertEquals("Whizz",result);
    }

    @Test
    public void should_return_Whizz_when_input_15(){
        Game game = new Game();
        String result = game.fuzzBuzz(15);

        Assertions.assertEquals("FuzzBuzz",result);
    }
    @Test
    public void should_return_Whizz_when_input_21(){
        Game game = new Game();
        String result = game.fuzzBuzz(21);

        Assertions.assertEquals("FuzzWhizz",result);
    }

    @Test
    public void should_return_Whizz_when_input_35(){
        Game game = new Game();
        String result = game.fuzzBuzz(35);

        Assertions.assertEquals("BuzzWhizz",result);
    }

    @Test
    public void should_return_Whizz_when_input_105(){
        Game game = new Game();
        String result = game.fuzzBuzz(105);

        Assertions.assertEquals("FuzzBuzzWhizz",result);
    }
}
