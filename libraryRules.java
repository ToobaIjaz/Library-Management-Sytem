
package librarymanagementsystem;
import javax.swing.*;
public class libraryRules {
     int maxBooksAllowed; 
     int borrowTimeLimit; 
     int finePerDay;
     static String libraryBranch = "Main Branch";  
   
    public libraryRules(int maxBooksAllowed, int borrowTimeLimit, int finePerDay) {
        this.maxBooksAllowed = maxBooksAllowed;
        this.borrowTimeLimit = borrowTimeLimit;
        this.finePerDay = finePerDay;
    }
    public void setMaxBooksAllowed(int maxBooksAllowed) {
        this.maxBooksAllowed = maxBooksAllowed;
    }
    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    } 
    public void setBorrowTimeLimit(int borrowTimeLimit) {
        this.borrowTimeLimit = borrowTimeLimit;
    }
    public int getBorrowTimeLimit() {
        return borrowTimeLimit;
    } 
    public void setFinePerDay(int finePerDay) {
        this.finePerDay = finePerDay;
    }
    public double getFinePerDay() {
        return finePerDay;
    }
    public static String getLibraryBranch() {
        return libraryBranch;
    }
    
    
    
    
    
    
    public void libRulesGui(){
         JFrame f = new JFrame("Library Rules");
        f.setSize(400, 350);
        f.setLocation(500, 300);
        f.setLayout(null);

        JLabel maxBooksLabel = new JLabel("Max Books Allowed:");
        maxBooksLabel.setBounds(30, 30, 150, 30);
        f.add(maxBooksLabel);

        JTextField maxBooksField = new JTextField();
        maxBooksField.setBounds(180, 30, 150, 30);
        f.add(maxBooksField);

        JLabel borrowTimeLabel = new JLabel("Borrow Time Limit (days):");
        borrowTimeLabel.setBounds(30, 80, 180, 30);
        f.add(borrowTimeLabel);

        JTextField borrowTimeField = new JTextField();
        borrowTimeField.setBounds(210, 80, 120, 30);
        f.add(borrowTimeField);

        JLabel fineLabel = new JLabel("Fine per Day:");
        fineLabel.setBounds(30, 130, 150, 30);
        f.add(fineLabel);

        JTextField fineField = new JTextField();
        fineField.setBounds(180, 130, 150, 30);
        f.add(fineField);

        JButton saveButton = new JButton("Save Rules");
        saveButton.setBounds(100, 200, 180, 40);
        f.add(saveButton);
        f.setVisible(true);
    }
      
}
