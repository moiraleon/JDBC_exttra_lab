package com.devmountain.model;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.util.Date;
import java.util.Objects;

public class Employee {


//    public boolean tryConnection() throws Exception{
//        Connection connection = DriverManager.getConnection("..");
//        boolean isValid = connection.isValid(2);
//        connection.close();
//        return isValid;
//    }

    private int id;
    private String name;
    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private Date hired_date;
    private int department_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getHired_date() {
        return hired_date;
    }

    public void setHired_date(Date hired_date) {
        this.hired_date = hired_date;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department_id == employee.department_id && Objects.equals(name, employee.name) && Objects.equals(first_name, employee.first_name) && Objects.equals(last_name, employee.last_name) && Objects.equals(email, employee.email) && Objects.equals(address, employee.address) && Objects.equals(hired_date, employee.hired_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, first_name, last_name, email, address, hired_date, department_id);
    }
}
