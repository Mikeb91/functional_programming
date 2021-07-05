package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDbConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDbConnectionUrlSupplier = () ->
            "jdbc://localhost:5432/users"; // Takes no arguments but suply a value.

}
