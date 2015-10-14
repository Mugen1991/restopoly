package com.restopoly.REST.dice;

/**
 * Created by lars on 13.10.15.
 */
import java.util.Random;

import static com.restopoly.REST.dice.JsonUtil.*;
import static com.restopoly.REST.dice.Roll.*;
import static spark.Spark.*;

public class Dice {
    private int number = 0;


    public  Dice() {
        //definiert was an den client gesendet wird, wenn dieser
        // <ServerIp>/dice aufruft
        get("/dice", (req, res) -> new Roll(roll()) , json());
    }

    private int roll(){
        Random rand = new Random();
        int max = 6;
        int min = 1;
        int nummber = 0;
        number = rand.nextInt((max - min) + 1) + min;
        return number;
    }
}
