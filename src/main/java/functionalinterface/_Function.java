package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function: takes 1 argument and produces 1 result
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        int test = incrementByOneFunction.andThen(multiplyBy10Function).apply(3);
        System.out.println("test: " + test);

        //We can do execute both functions at the same time with method andThen() as follows:

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        //As we can see here, the Function is build with another to functions one
        // executed next to the other one with the use of method andThen()

        //BiFunction takes 2 arguments and produces 1 result

        //Normal Java Function:
        System.out.println(incrementByOneAndMultiply(4, 100));
        //Using biFunction:
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));


    }

    //Functional Programming approach:

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    //Imperative approach:
    static int increment(int number) {
        return number + 1;
    }
    //-----------------------------------------------------------------------------

    //ByFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;


    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
