package data;

import domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDatabase {
    private final List<Customer> list = new ArrayList<>();

    public CustomerDatabase() {
        list.add(new Customer());
        list.add(new Customer());
        list.add(new Customer());
    }

    public void addCustomer(Customer customer) {
        list.add(customer);
    }

    public Customer findByIndex(int index) {
        return list.get(index);
    }
}
