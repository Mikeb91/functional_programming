package finalsection;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //Function<String,String> upperCaseName = name -> name.toUpperCase(); //-- basic lambda
        //Function<String,String> upperCaseName = String::toUpperCase; // -Method reference Lambda
        Function<String,String> upperCaseName = name -> { //brackets are required when logic needs to be applied and the result is not returned directly
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> functionWith2Parameters = (name, age) -> { //The 2 first parameters for BiFunction are the input type attributes, and the third one is the output type.
            if(age<18) System.out.println(name + "is not adult");                    //For function, the input and output types must be the object type and not the primitive type. i.e. cannot be int, must be Integer.

            else System.out.println(name + " is an adult");
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Mike"));
        functionWith2Parameters.apply("Pau", 28);
    }
}
