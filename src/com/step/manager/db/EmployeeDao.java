package com.step.manager.db;

import com.step.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public Connection initConnection() throws SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/emp_manager";
        String username = "postgres";
        String password = "aozhnl";
        return DriverManager.getConnection(url, username, password);
    }

    public int insert(Employee emp) throws SQLException { // insert(Employee emp)
        String preparedSql = "INSERT INTO emp_manager.employee(name, address, phoneno) values (?,?,?)";
        try (Connection connection = initConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(preparedSql)) {
            preparedStatement.setString(1, emp.getName());
            preparedStatement.setString(2, emp.getAddress());
            preparedStatement.setString(3, emp.getPhoneno());

            int rows = preparedStatement.executeUpdate();
            return rows;
        }
    }


    public void update(Employee emp) throws SQLException {
        String sql = "UPDATE emp_manager.employee SET name=?, address=?, phoneno=? WHERE id=?";
        // TODO: try-with-resources
        Connection connection = initConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, emp.getName());
        preparedStatement.setString(2, emp.getAddress());
        preparedStatement.setString(3, emp.getPhoneno());
        preparedStatement.setInt(4, emp.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public List<Employee> read() throws SQLException { // list address = 1
        String sql = "SELECT id, name, address, phoneno FROM emp_manager.employee";
        // TODO: try-with-resources
        Connection connection = initConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Employee> emps = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            String phoneno = resultSet.getString("phoneno");
            emps.add(new Employee(id, name, address));
        }
        statement.close();
        connection.close();
        return emps;

    }


    public void delete(Employee emp) {
        String sql = "DELETE FROM emp_manager.employee WHERE id=?";
        // TODO: try-with-resources
        // connection
        // preparedStatement
        // preparedStatement.setInt(1, emp.getId())
        // preparedStatement.executeUpdate()
        // close()
    }
}
