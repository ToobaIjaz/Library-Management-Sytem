
package librarymanagementsystem;
import javax.swing.*;
public class Books{
     int bookID;
     String bookName;
     String bookAuthor;
     boolean isAvailable;
    
    public Books( int bookID, String bookName, String bookAuthor, boolean isAvailable) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.isAvailable = isAvailable;   
   }
      public String toString() {
        return "BookManagement{" + "bookID=" + bookID + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", isAvailable=" + isAvailable + '}';
    }
      public void setbookID(int bookID){
    this.bookID = bookID;
    }
    public int getbookID(){
        return bookID;
    }  
    public void setbookName(String bookName){
        this.bookName = bookName;
    }
    public String getbookName(){
        return bookName;
    }  
    public void setbookAuthor(String bookAuthor){
       this.bookAuthor= bookAuthor;
    }
    public String getbookAuthor(){
       return bookAuthor;
    }
      
      
      
      
      
      
      
      
      
      
     public boolean isvalid() {
        if (bookName.length() >= 3) {
            System.out.println("Book name is valid.");
            return true;
        } else {
            System.out.println("Book name is too short.");
            return false;
        }
     }
      public boolean isAllowed() {
        if (isAvailable) {
        System.out.println("The book is available to be borrowed.");
        return true;
      } else {
        System.out.println("The book is currently unavailable.");
        return false;
    }
      } 
     
}
