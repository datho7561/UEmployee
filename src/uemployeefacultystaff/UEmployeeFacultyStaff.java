/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeefacultystaff;

/**
 *
 * @author DaTho7561
 */
public class UEmployeeFacultyStaff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creates an array of faculty representing the faculty of the university
        Faculty[] facultyMembers = new Faculty[]{new Faculty("Robert", 9001.54, "Nanoscience"),
            new Faculty("Daniel Radcliffe", 92213.71, "Wizardry"),
            new Faculty("Steven Hawking", 345210.43, "Theoretical Physics")};
        // Creates an array of staff representing the staff of the university
        Staff[] staffMembers = new Staff[] {new Staff("Rick Astley", 200000.21, "Singer"),
            new Staff("Rupert Grint", 1000240.32, "Pyrotechnician"),
            new Staff("Tom Cruise", -23, "Scientologist")};
        
        for(Faculty f: facultyMembers) {
            System.out.println(f);
        }
        
        for(Staff s: staffMembers) {
            System.out.println(s);
        }
    }
    
}
