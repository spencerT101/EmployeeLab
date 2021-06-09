package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private Manager manager;
    private String departmentName;

    public Manager(String name, String niNumber, double salary, String departmentName) {

        super(name, niNumber, salary);
        this.departmentName = departmentName;
    }

        public String getDepartmentName(){
            return departmentName;
        }

    }

