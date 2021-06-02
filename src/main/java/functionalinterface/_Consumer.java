package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Normal void method implementation
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);

        //Consumer Functional interface:
        greetCustomerConsumer.accept(maria);
        //BiConsumer: (Two parameters)
        greetCustomerConsumerV2.accept(maria, true);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", Thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", Thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", Thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
