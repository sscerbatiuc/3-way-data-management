package com.step.manager.db;

import com.step.Employee;
import com.step.manager.IEmployeeManager;

import java.sql.SQLException;
import java.util.List;

public class EmployeeManagerDB implements IEmployeeManager {
    EmployeeDao employeeDao = new EmployeeDao();

    public int insert(Employee e) {
        try {
            return employeeDao.insert(e);
        } catch (SQLException ex) {
            // Rezolvam eroarea
            return -1;
        }
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

    }
}
