/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeefacultystaff;

import java.text.DecimalFormat;

/**
 * A employee class for a university.
 * @author DaTho7561
 */
public class UEmployee {
    
    private String name;
    private double salary;
    
    private static final DecimalFormat salaryFormat = new DecimalFormat("#.00");
    
    /**
     * Creates a new university employee.
     * pre: none
     * post: new university employee created
     * @param employeeName
     * @param employeeSalary 
     */
    public UEmployee(String employeeName, double employeeSalary) {
        name = employeeName;
        salary = employeeSalary;        
    }
    
    /**
     * Returns the name of the employee.
     * pre: none
     * post: name returned
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the salary of the employee.
     * pre: none
     * post: salary returned
     * @return 
     */
    public double getSalary() {
        return salary;
    }
    
    /**
     * Sets a new name for the employee.
     * pre: none
     * post: name set to new value
     * @param newName 
     */
    public void setName(String newName) {
        name = newName;
    }
    
    /**
     * Sets a new salary for the employee.
     * pre: none
     * post: new salary assigned
     * @param newSalary 
     */
    public void setSalary(double newSalary) {
        salary = newSalary;
    }
    
    @Override
    public String toString() {        
        return ("Employee Name: " + name + ", Salary: $" + salaryFormat.format(salary));
    }
    
}
