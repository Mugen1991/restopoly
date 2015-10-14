package com.restopoly.REST.dice;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by lars on 14.10.15.
 */
public class JsonUtil {

    public static String toJson(Object object){
        return new Gson().toJson(object);
    }

    public static ResponseTransformer json() {
        return JsonUtil::toJson;
    }
}
