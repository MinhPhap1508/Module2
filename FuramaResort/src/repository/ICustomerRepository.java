package repository;

import model.Person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void searchCustomer(String name);
    Customer getById(String id);
    void addCustomer(Customer customer);
    void editCustomer();
    void updateCustomer();
    void deleteCustomer(Customer customer);
}
