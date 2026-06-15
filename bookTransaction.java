
package librarymanagementsystem;
import javax.swing.*;
public class bookTransaction {
     int memberID;
     int bookID;
     String transactionType;
     String transactionDate;
    
     
 
    public bookTransaction(int memberID, int bookID, String transactionType, String transactionDate) {
        this.memberID = memberID;
        this.bookID = bookID;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
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
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionDate() {
        return transactionDate;
    }
}
    
