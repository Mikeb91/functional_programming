package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        //We can do execute both functions at the same time with method andThen() as follows:

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        //As we can see here, the Function is build with another to functions one
        // executed next to the other one with the use of method andThen()

    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }
}
