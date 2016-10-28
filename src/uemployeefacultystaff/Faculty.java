/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeefacultystaff;

/**
 * Describes a teaching or researching employee of the university.
 * @author DaTho7561
 */
public class Faculty extends UEmployee {

    private String department;
    
    /**
     * Creates a new faculty member.
     * pre: none
     * post: new faculty member created
     * @param employeeName
     * @param employeeSalary
     * @param employeeDepartment 
     */
    public Faculty(String employeeName, double employeeSalary, String employeeDepartment) {
        super(employeeName, employeeSalary);
        department = employeeDepartment;
    }
    
    /**
     * Returns this faculty member's department.
     * pre: none
     * post: department returned
     * @return 
     */
    public String getDepartment() {
        return department;
    }
    
    /**
     * Changes this faculty member's department.
     * pre: none
     * post: new department assigned
     * @param newDepartment 
     */
    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }
    
    @Override
    public String toString() {
        return (super.toString() + ", Department: " + department);
    }
    
}
