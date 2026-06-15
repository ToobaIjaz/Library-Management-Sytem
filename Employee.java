
package librarymanagementsystem;
import java.util.*;
import javax.swing.*;
public class Employee extends Person {
    
    @Override
    public String toString() {
        return "EmployeeManagement{" + "Role=" + Role + ", WorkingShift=" + WorkingShift + '}';
    }
    Scanner sc = new Scanner(System.in);
    String Role;
    String WorkingShift;
    public Employee(String Role, String WorkingShift, String Name, String Email, int ID, int contNo) {
        super(Name, Email, ID, contNo);
        this.Role = Role;
        this.WorkingShift = WorkingShift;
    }
     public boolean isvalid() {
        if (ID > 0) {
            System.out.println("Employee ID is valid.");
            return true;
        } else {
            System.out.println("Invalid Employee ID. Please enter positive ID number!");
            return false;
        }
     }
     public boolean isAllowed() {
        if (Role.equals("Librarian")) {
            System.out.println("The Librarian can add, delete, and update member's data.");
            return true;
        } else {
            System.out.println("Only a Librarian can perform this action.");
            return false;
        }
     }
//call abstract methods
    public void showRole(){
    System.out.println("Employee manages library operations.");
    }
    
    public void displayWelcomeMessage() {
    System.out.println("Welcome! You're logged in as a library employee.");
}
    
    public void accessLibraryPortal(){
    System.out.println("Employees have access to manage books and member record");
    }
    
    public void setRole(String Role) {
        this.Role = Role;
    }
    public String getRole() {
        return Role;
    }
    public void setWorkingShift(String WorkingShift) {
        this.WorkingShift = WorkingShift;
    }
    public String getWorkingShift() {
        return WorkingShift;
    }
      public void showrecord(){
        System.out.println("Employee Details!");
        System.out.println("Role: " +this.Role);
        System.out.println("WorkingShift: "+this.WorkingShift);
        System.out.println("Employee Name: " +this.Name);
        System.out.println("Emp Email: "+this.Email);
        System.out.println("Emp ID: "+this.ID);
        System.out.println("Emp contact no: "+this.contNo);
        
   }
}
    
 

 
    
    
   