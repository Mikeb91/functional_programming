package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("jhon", null, value -> {
            System.out.println("No lastname Provided for " + value);
        });

        hello2("jhon", null, () ->{
            System.out.println("No lastname provided");
        });
    }

    static void hello (String firstName, String lastName, Consumer<String> callback) { //Accepts Consumer arguments required inside that function.
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        }else {
            callback.accept(firstName); //You give the attribute for the callback.
        }
    }
    static void hello2 (String firstName, String lastName, Runnable callback) { //Accepts runnable for no arguments function
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }
}
