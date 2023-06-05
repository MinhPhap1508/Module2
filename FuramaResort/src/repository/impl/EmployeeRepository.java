package repository.impl;

import model.person.Employee;
import repository.IEmployeeRepository;
import common.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String PATH_EMPLOYEE = "src/data/employee.csv";

    @Override
    public List<Employee> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_EMPLOYEE);
        employeeList.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
//             public Employee(String code, String name, String date, String gender, int idCard, int numberPhone, String email, String level, String position, float salary)
            employeeList.add(new Employee(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], Float.parseFloat(info[9])));

        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> strings = new ArrayList<>();
        strings.add(employee.getCode() + "," + employee.getName() + "," + employee.getDate() + "," + employee.getGender() + "," + employee.getIdCard() + "," + employee.getNumberPhone() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary());
        ReadAndWrite.writeFile(strings, PATH_EMPLOYEE, true);
    }

    @Override
    public Employee getById(String id) {
        employeeList = getAll();
        for (Employee e : employeeList) {
            if (e.getCode().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void updateEmployee() {
        employeeList = getAll();
    }

    @Override
    public void editEmployee() {
        List<String> stringList = new ArrayList<>();
        for (Employee str : employeeList) {
            stringList.add(str.getCode() + "," + str.getName() + "," + str.getDate() + "," + str.getGender() + "," + str.getIdCard() + "," + str.getNumberPhone() + "," + str.getEmail() + "," + str.getLevel() + "," + str.getPosition() + "," + str.getSalary());
        }
        ReadAndWrite.writeFile(stringList, PATH_EMPLOYEE, false);
    }

    @Override
    public void removeEmployed(Employee employee) {
        employeeList = getAll();
        employeeList.remove(employee);
        List<String> strings = new ArrayList<>();
        for (Employee str : employeeList) {
            strings.add(str.getCode() + "," + str.getName() + "," + str.getDate() + "," + str.getGender() + "," + str.getIdCard() + "," + str.getNumberPhone() + "," + str.getEmail() + "," + str.getLevel() + "," + str.getPosition() + "," + str.getSalary());
        }
        ReadAndWrite.writeFile(strings, PATH_EMPLOYEE, false);
    }

    @Override
    public void searchEmployee(String name) {
        employeeList = getAll();
        for (Employee e : employeeList) {
            if (e.getName().contains(name)) {
                System.out.println(e);
            }
        }
    }
}
