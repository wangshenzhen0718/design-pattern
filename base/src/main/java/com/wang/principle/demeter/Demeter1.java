package com.wang.principle.demeter;


import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                '}';
    }
}

class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager{


    public List<CollegeEmployee> getAllCollegeEmployee(){
        ArrayList<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id"+i);
            list.add(collegeEmployee);

        }
        return list;


    }
}

class SchoolManager{
    public List<Employee> getAllEmployee(){
        ArrayList<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校员工id"+i);
            list.add(employee);
        }


        return list;
    }
    void printAllEmployee(CollegeManager sub){
        List<CollegeEmployee> allEmployee = sub.getAllCollegeEmployee();
        for (CollegeEmployee collegeEmployee : allEmployee) {
            System.out.println(collegeEmployee.getId());
        }
        List<Employee> allEmployee1 = this.getAllEmployee();
        for (Employee employee : allEmployee1) {
            System.out.println(employee.getId());
        }


    }

}

