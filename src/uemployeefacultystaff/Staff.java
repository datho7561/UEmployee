/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeefacultystaff;

/**
 * A class describing university employees that don't teach or research.
 * @author DaTho7561
 */
public class Staff extends UEmployee {
    
    String title;

    /**
     * Creates a new Staff member.
     * pre: none
     * post: new Staff member created
     * @param employeeName
     * @param employeeSalary
     * @param employeeTitle 
     */
    public Staff(String employeeName, double employeeSalary, String employeeTitle) {
        super(employeeName, employeeSalary);
        title = employeeTitle;
    }
    
    /**
     * Returns the title of this employee.
     * pre: none
     * post: title returned
     * @return 
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets a new value for this employee's title.
     * pre: title is not pretentiously meaningless
     * post: new title assigned
     * @param newTitle 
     */
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    
    @Override
    public String toString() {
        return (super.toString() + ", Title: " + title);
    }
    
}
