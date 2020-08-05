package org.github.com.jefesimpson.javalin.calculator;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create();


        app.get("/add/:first/:second", context -> {
            context.result(String.valueOf(Integer.parseInt(firstStringParam(context)) + Integer.parseInt(secondStringParam(context))));
        });


        app.get("/sub/:first/:second", context -> {
            context.result(String.valueOf(Integer.parseInt(firstStringParam(context)) - Integer.parseInt(secondStringParam(context))));
        });


        app.get("/mpy/:first/:second", context -> {
            context.result(String.valueOf(Double.parseDouble(firstStringParam(context)) * Double.parseDouble(secondStringParam(context))));
        });


        app.get("/del/:first/:second", context -> {
            context.result(String.valueOf(Double.parseDouble(firstStringParam(context)) / Double.parseDouble(secondStringParam(context))));
        });


        app.get("/pow/:first/:second", context -> {
            context.result(String.valueOf(Math.pow(Integer.parseInt(firstStringParam(context)),Integer.parseInt(secondStringParam(context)))));
        });




        app.start(9090);
    }




    public static String firstStringParam(Context context){
        String first = context.pathParam("first");
        return first;
    }



    public static String secondStringParam(Context context){
        String second = context.pathParam("second");
        return second;
    }
}
