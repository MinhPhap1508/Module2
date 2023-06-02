package repository.impl;

import common.ReadAndWrite;
import model.Person.Customer;
import model.Person.Employee;
import repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    private static final String PATH_CUSTOMER = "src/data/customer.csv";

    @Override
    public List<Customer> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_CUSTOMER);
        customerList.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
//            (String code, String name, String date, String gender, String idCard, String numberPhone, String email, String customerSegment, String address)
            customerList.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }
        return customerList;
    }

    @Override
    public void searchCustomer(String name) {
        customerList = getAll();
        for (Customer c : customerList) {
            if (c.getName().contains(name)) {
                System.out.println(c);
            }
        }
    }

    @Override
    public Customer getById(String id) {
        customerList = getAll();
        for (Customer c : customerList) {
            if (c.getCode().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = new ArrayList<>();
//        (String code, String name, String date, String gender, String idCard, String numberPhone, String email, String customerSegment, String address)
        strings.add(customer.getCode() + "," + customer.getName() + "," + customer.getDate() + "," + customer.getGender() + "," + customer.getIdCard() + "," + customer.getNumberPhone() + "," + customer.getEmail() + "," + customer.getCustomerSegment() + "," + customer.getAddress());
        ReadAndWrite.writeFile(strings, PATH_CUSTOMER, true);
    }

    @Override
    public void editCustomer() {
        List<String> strings = new ArrayList<>();
        for (Customer str : customerList) {
            strings.add(str.getCode() + "," + str.getName() + "," + str.getDate() + "," + str.getGender() + "," + str.getIdCard() + "," + str.getNumberPhone() + "," + str.getEmail() + "," + str.getCustomerSegment() + "," + str.getAddress());
        }
        ReadAndWrite.writeFile(strings,PATH_CUSTOMER,false);
    }

    @Override
    public void updateCustomer() {
        customerList = getAll();
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerList = getAll();
        customerList.remove(customer);
        List<String> stringList = new ArrayList<>();
        for (Customer str : customerList) {
            stringList.add(str.getCode() + "," + str.getName() + "," + str.getDate() + "," + str.getGender() + "," + str.getIdCard() + "," + str.getNumberPhone() + "," + str.getEmail() + "," + str.getCustomerSegment() + "," + str.getAddress());
        }
        ReadAndWrite.writeFile(stringList, PATH_CUSTOMER, false);
    }
}
