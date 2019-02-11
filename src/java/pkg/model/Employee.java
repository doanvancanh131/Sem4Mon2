/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.model;

/**
 *
 * @author hp
 */
public class Employee {
    private String EmployeeID;
    private String EmployeeName;
    private String Address;
    private int Age;

    public Employee() {
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return Age;
    }
    
    
}
