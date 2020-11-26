package com.step.manager;

import com.step.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerInFile implements IEmployeeManager {
    List<Employee> employeeList = new ArrayList<>();

    public EmployeeManagerInFile() {
        // importul datelor din fisier
    }

    @Override
    public int insert(Employee e) {
        return 0;
    }

    @Override
    public int update(Employee e) {
        return 0;
    }

    @Override
    public List<Employee> read() {
        return null;
    }

    @Override
    public int delete(Employee e) {
        return 0;
    }

    @Override
    public void close() {
        // save
    }
}
