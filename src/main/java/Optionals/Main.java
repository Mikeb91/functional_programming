package Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
       Object value =  Optional.ofNullable(null)
                .orElseGet(() -> "Default value");

        Object value2 =  Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("exception"));

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Cannot send email");
                        }
                );
    }
}
