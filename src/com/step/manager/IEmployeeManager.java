package com.step.manager;

import com.step.Employee;

import java.util.List;

public interface IEmployeeManager {
    public int insert(Employee e);
    public int update(Employee e);
    public List<Employee> read();
    public int delete(Employee e);
    public void close();
}
