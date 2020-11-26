package com.step;

import com.step.manager.EmployeeManagerInFile;
import com.step.manager.EmployeeManagerInMemory;
import com.step.manager.IEmployeeManager;
import com.step.manager.db.EmployeeDao;
import com.step.manager.db.EmployeeManagerDB;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // citim optiunea
        int option = (new Scanner(System.in)).nextInt();
        IEmployeeManager employeeManager;
        switch(option) {
            case 1: {
                employeeManager = new EmployeeManagerInMemory();
                break;
            }
            case 2: {
                employeeManager = new EmployeeManagerInFile();
                break;
            }
            case 3: {
                employeeManager = new EmployeeManagerDB();
                break;
            }
        }

        // Afisarea meniului
        // Citirea optiunilor
        // Executia lor
        //        employeeManager.read();
        //        employeeManager.insert();
        //        employeeManager.delete();



    }
}
