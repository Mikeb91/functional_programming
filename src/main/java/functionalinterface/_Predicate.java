package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09546000000"));
        System.out.println(isPhoneNumberValid("075460000"));

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09546000000"));
        System.out.println(isPhoneNumberValidPredicate.test("075460000"));

        //This way we can use 2 predicates, is it possible to use and
        System.out.println("Is phone number and contains number 3: " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
        //and it´s possible to use or as well
        System.out.println("Is phone number and contains number 3: " +
                isPhoneNumberValidPredicate.or(containsNumber3).test("07000000003"));

        //Finally we have BiPredicate which is the same thing just with 2 parameters
        System.out.println("Contains 0 and Show number: " +
                containsNumber0AndShowNumber.test("1234156798", true)
                );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<String, Boolean> containsNumber0AndShowNumber = (phoneNumber, showNumber) ->
            phoneNumber.contains("3") && showNumber;

}
