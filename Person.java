
package librarymanagementsystem;
public abstract class Person {
     String Name;
    String Email;
    int ID;
    int contNo; 
    public Person(String Name, String Email, int ID, int contNo) {
        this.Name = Name;
        this.Email = Email;
        this.ID = ID;
        this.contNo = contNo;
    }
    public  abstract void showRole();
    public  abstract void accessLibraryPortal();
    public abstract void displayWelcomeMessage();
    
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getEmail() {
        return Email;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }
    public void setcontNo(int contNo) {
        this.contNo = contNo;
    }

    public int getcontNo() {
        return contNo;
    } 
}























































//    String Name;
//    String Email;
//    int ID;
//    int contNo;
//    
//    public void setName(String Name){
//    this.Name = Name;
//    }
//    public String getName(){
//        return Name;
//    }
//    
//    public void setEmail(String Email){
//        this.Email = Email;
//    }
//    public String getEmail(){
//        return Email;
//    }
//    public void setID(int ID){
//        this.ID = ID;
//    }
//    public int getID(){
//        return ID;
//    }
//    
//    public void setcontNo(int contNo){
//       this.contNo= contNo;
//    }
//    public int getcontNo(){
//        return contNo;
//    }
//}
