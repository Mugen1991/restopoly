package com.restopoly.REST.dice;

/**
 * Created by lars on 13.10.15.
 */
import static spark.Spark.*;

public class Roll {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
