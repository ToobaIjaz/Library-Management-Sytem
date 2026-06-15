package librarymanagementsystem;
import javax.swing.*;
public class Fine {
    int memberID;    
    int bookID;     
    int overdueDays; 
    static  int FINE_RATE = 10;
    
    public void fineGui(){
        JFrame f = new JFrame("Fine Class");
        f.setSize(400, 300);
        f.setLocation(500, 300);
        f.setLayout(null);

        JLabel memberLabel = new JLabel("Enter Member ID:");
        memberLabel.setBounds(30, 30, 150, 30);
        f.add(memberLabel);

        JTextField memberField = new JTextField();
        memberField.setBounds(180, 30, 150, 30);
        f.add(memberField);

        JLabel bookLabel = new JLabel("Enter Book ID:");
        bookLabel.setBounds(30, 80, 150, 30);
        f.add(bookLabel);

        JTextField bookField = new JTextField();
        bookField.setBounds(180, 80, 150, 30);
        f.add(bookField);

        JLabel overdueLabel = new JLabel("Enter Overdue Days:");
        overdueLabel.setBounds(30, 130, 150, 30);
        f.add(overdueLabel);

        JTextField overdueField = new JTextField();
        overdueField.setBounds(180, 130, 150, 30);
        f.add(overdueField);

        JButton saveButton = new JButton("Save Fine Info");
        saveButton.setBounds(100, 190, 180, 40);
        f.add(saveButton);

        f.setVisible(true);
    }

    public Fine(int memberID, int bookID, int overdueDays) {
        this.memberID = memberID;
        this.bookID = bookID;
        this.overdueDays = overdueDays;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    public int getMemberID() {
        return memberID;
    }
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public int getBookID() {
        return bookID;
    }
    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }
    public int getOverdueDays() {
        return overdueDays;
    }
    public int getFINE_RATE() {
        return overdueDays * FINE_RATE;
    }
}