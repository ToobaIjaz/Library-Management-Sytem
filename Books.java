
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//constructor
//    public BookManagement(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter book ID: ");
//        bookID = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter book name: ");
//        bookName = sc.nextLine();
//        System.out.println("Enter book author : ");
//        bookAuthor = sc.nextLine();
//    }
//      public void showrecord(){
//        System.out.println("id: " +bookID);
//        System.out.println("name: " +bookName);
//        System.out.println("author: " + bookAuthor);
//     }
    
//    public void insertrecord(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter book ID: ");
//        bookID = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter book name: ");
//        bookName = sc.nextLine();
//        System.out.println("Enter book author : ");
//        bookAuthor = sc.nextLine(); 
//    }
//BookManagement b2 = new BookManagement(102, "Namal", "Nimra Ahmed");
//              System.out.println("Book ID: " + b2.getbookID());
//              System.out.println("Book Name: " + b2.getbookName());
//              System.out.println("Book Author: " + b2.getbookAuthor());
// Implementation of libraryOperations methods
//    public void add() {
//        System.out.println("Adding Book: " + bookName);
//    }

//    public void update() {
//        System.out.println("Updating Book: " + bookName);
//    }

//    public void delete() {
//        System.out.println("Deleting Book: " + bookName);
//    }
//}

         
         
     


