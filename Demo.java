/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;
import java.util.*;
public class Demo {

    public static void main(String []args){

              Books b1= new Books(050,"Harry Potter","J.K. Rowling",true);
              Books b2= new Books(010,"kite Runner","Khaled Hosseini.",true);
              ArrayList<Books> Csbooks=new ArrayList<>();
              Csbooks.add(b1);
              Csbooks.add(b2);
              
              Books b3= new Books(020,"Namal","Nimra Ahmed",true);
              Books b4= new Books(040,"H","J.K. Rowling",true);
              ArrayList<Books> EEbooks=new ArrayList<>();
              EEbooks.add(b3);
              EEbooks.add(b4);
             
              Books b5= new Books(101,"","J.K. Rowling",true);
              Books b6= new Books(101,"Harry","J.K. Rowling",true);
              ArrayList<Books> MngSciencesbooks=new ArrayList<>();
              MngSciencesbooks.add(b5);
              MngSciencesbooks.add(b6);
            
              Member m1= new Member("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
              Member m2= new Member("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
              ArrayList<Member> CsMember=new ArrayList<>();
              CsMember.add(m1);
              CsMember.add(m2);
              
              Member m3= new Member("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
              Member m4=new Member("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
              ArrayList<Member> EEMember=new ArrayList<>();
              EEMember.add(m3);
              EEMember.add(m4);
             
              Member m5= new Member("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
              Member m6=new Member("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
              ArrayList<Member> MngSciencesMember=new ArrayList<>();
              MngSciencesMember.add(m5);
              MngSciencesMember.add(m6);
             
              Employee e1= new Employee ("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
              Employee e2=new Employee("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
              ArrayList<Employee> CsEmployee=new ArrayList<>();
              CsEmployee.add(e1);
              CsEmployee.add(e2);
             
              Employee e3= new Employee ("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
              Employee e4=new Employee("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
              ArrayList<Employee> EEEmployee=new ArrayList<>();
              EEEmployee.add(e3);
              EEEmployee.add(e4);             
              Employee e5= new Employee ("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
              Employee e6=new Employee("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
              ArrayList<Employee> MngSciencesEmployee=new ArrayList<>();
              MngSciencesEmployee.add(e5);
              MngSciencesEmployee.add(e6);
              
              Cubicle c1 = new Cubicle(1, true, "Aniqa");
              Cubicle c2 = new Cubicle(2, false, "Amna");
              ArrayList<Cubicle> MngSciencesCubicles = new ArrayList<>();
              MngSciencesCubicles.add(c1);
              MngSciencesCubicles.add(c2);

              Cubicle c3 = new Cubicle(1, true, "Aniqa");
              Cubicle c4 = new Cubicle(2, false, "Amna");
              ArrayList<Cubicle> CsCubicles = new ArrayList<>();
              CsCubicles.add(c3);
              CsCubicles.add(c4);
            
              Cubicle c5 = new Cubicle(1, true, "Aniqa");
              Cubicle c6 = new Cubicle(2, false, "Amna");
              ArrayList<Cubicle> EECubicles = new ArrayList<>();
              EECubicles.add(c5);
              EECubicles.add(c6);
              
              Computers comp1 = new Computers("Dell i7", true);
              Computers comp2 = new Computers("HP i5", true);
              ArrayList<Computers> CsComputers = new ArrayList<>();
              CsComputers.add(comp1);
              CsComputers.add(comp2);

              Computers comp3 = new Computers("Dell i7", true);
              Computers comp4 = new Computers("HP i5", true);
              ArrayList<Computers> EEComputers = new ArrayList<>();
              EEComputers.add(comp3);
              EEComputers.add(comp4);
              
              Computers comp5 = new Computers("Dell i7", true);
              Computers comp6 = new Computers("HP i5", true);
              ArrayList<Computers> MngScienceComputers = new ArrayList<>();
              MngScienceComputers.add(comp5);
              MngScienceComputers.add(comp6);

              libraryRules r1= new libraryRules (3,15,10);
              
              Library csLibrary=new Library("Library cs:",Csbooks,CsMember,CsEmployee,r1,CsCubicles ,CsComputers);
              Library EELibrary=new Library("Library EE:",EEbooks,EEMember,EEEmployee,r1,EECubicles,EEComputers);
              Library MngSciencesLibrary=new Library("Library mng:",MngSciencesbooks,MngSciencesMember,MngSciencesEmployee,r1,MngSciencesCubicles,MngScienceComputers);
               
              ArrayList<Library>library=new ArrayList<>();
              library.add(csLibrary);
              library.add(EELibrary);
              library.add(MngSciencesLibrary);

             University uni=new University("COMSATS",library);
             
             System.out.println("Books in CS library: " + csLibrary.getBooks());            
             System.out.println("Members in CS: "+csLibrary.getMembers());
             System.out.println("Employees in CS: "+csLibrary.getEmployees()); 
             System.out.println("Cubicles in CS: "+csLibrary.getCubicles());
             System.out.println("Computers in CS: "+csLibrary.getComp());

            int c=0;
            for(Library lib:library){
                for (Books b:lib.getBooks()){
                    c++;
                    }
            }  
            System.out.println("total no of book in libraries: "+c);
            
            
            
            c=0;
            for(Library lib:library){
            for(Computers comp:lib.getComp()){
                c++;
            }
            }  
             System.out.println("total no of computers in libraries: "+c);
             
            c=0;
            for(Library lib:library){
            for(Employee emp:lib.getEmployees()){
                c++;
            }
            }  
             System.out.println("total no of Employee in libraries: "+c); 
    }
}

    
    

           
            
             
             
             
 











//             System.out.println(uni.toString());
//             int c=0;
//             for(Library lib:library){
//            for (Books b:lib.getBooks()){
//                c++;
//                 System.out.println("no of book : "+c);
//            }
//             System.out.println("total no of book in one lib: "+c);
//            
//          }
//             System.out.println("total no of book in all lib: "+c);
        
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Choose an option:\n1. Book Management\n2. Employee Management\n3. Member Management\n4. Member Feedback\n5. Library Rules\n6. Book Transactions\n7. Fine Management");
//    System.out.println("Enter your choice (1–7):");
//    int choice = sc.nextInt();
//
//    switch (choice){
//        
//           case 1 : 
//             
//              
//             break;
//
//           case 2:
//              System.out.println("Employee Management selected.");
//              EmployeeManagement e1 =new EmployeeManagement("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
////            call abstract methods
//              e1.showRole();
//              e1.accessLibraryPortal();
//              e1.displayWelcomeMessage();
//              e1.showrecord();
//              break;
//              
//            case 3:
//              System.out.println("Member Management selected.");
//              libraryOperations m = new MemberManagement("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
//              performOperation(m);
//              // call abstract method
////              m.showRole();
////              m.accessLibraryPortal();
////              m.displayWelcomeMessage();
//              
//              break;
//                
//           case 4:
//               System.out.println("Member Feedback selected.");
//               memberFeedback f1 = new memberFeedback("Great library services!","Amna","amna@library.com",12,03211234567 );
//               //call abstract methods
//               f1.accessLibraryPortal();
//               f1.showRole();
//               f1.displayWelcomeMessage();
//               break;
//   
//            case 5:
//               System.out.println("library Rules selected.");
//               libraryRules r2 = new libraryRules(5,15,10);
//
//               
//            case 6:
//                System.out.println("bookTransaction selected.");
//                bookTransaction t1 = new  bookTransaction(005,051,"Issue","March 17, 2025");
//                break;
//                
//            case 7:
//                System.out.println("FineManagement selected.");
//                FineManagement f =new FineManagement(101,033,7);
//                break;
//                
//           default :
//               System.out.println("Incorrect choice! \nPlease enter the number between 1,2,3,4,5,6 or 7");
//    }
//    }
//    
//}
//






































//case 2
//MemberManagement m1 = new MemberManagement();
//              m1.setgender("Female");
//              System.out.println("Gender: " + m1.getgender());
//              m1.setjoinDate("March 17, 2025");
//              System.out.println("Join Date: " + m1.getjoinDate());
//              m1.setName("Amna");
//              System.out.println("Member Name: " + m1.getName());
//              m1.setEmail("Amna@abc.com");
//              System.out.println("Member Email: " + m1.getEmail());
//              m1.setcontNo(00223344);
//              System.out.println("Contact No: " + m1.getcontNo());
//              m1.setID(101);
//              System.out.println("Member ID: " + m1.getID());
//               break;
//case 3;
//EmployeeManagement e1 = new EmployeeManagement();
//                e1.setID(201);
//                System.out.println("Employee ID: " + e1.getID());
//                e1.setName("Amna");
//                System.out.println("Employee Name: " + e1.getName());
//                e1.setEmail("amna@library.com");
//                System.out.println("Employee Email: " + e1.getEmail());
//                e1.setcontNo(03211234567);
//                System.out.println("Phone Number: " + e1.getcontNo());
//                e1.setRole("Librarian");
//                System.out.println("Role: " + e1.getRole());
//                e1.setWorkingShift("Morning");
//                System.out.println("Working Shift: " + e1.getWorkingShift());
//case 4;
//memberFeedback f1 = new memberFeedback();
//               f1.setFeedbackID(1);
//               System.out.println("feedback:" + f1.getFeedbackID());
//               f1.setFeedbackText("Great library services!");
//               System.out.println("Feedback:" + f1.getFeedbackText());
//               f1.setID(18);
//               System.out.println(" Member ID:" + f1.getID());
//               f1.setName("Amna");
//               System.out.println("Employee Name: " + f1.getName());

//theory ass 
//BookManagement b1 = new BookManagement(); 
//             b1.setbookID(101);
//             System.out.println("Book ID: " + b1.getbookID());
//             b1.setbookName("Harry Potter");
//             System.out.println("Book Name: " + b1.getbookName());
//             b1.setbookAuthor("J.K. Rowling");
//             System.out.println("Book Author: " + b1.getbookAuthor());
//System.out.println("Book Management selected.");
//                libraryOperations op = new BookManagement();
//                op.add();
//                op.delete();
//                op.update();
//                
//                BookManagement b1 = new BookManagement();
//                b1.setbookID(101);
//                System.out.println("Book ID: " + b1.getbookID());
//                b1.setbookName("Harry Potter");
//                System.out.println("Book Name: " + b1.getbookName());
//                b1.setbookAuthor("J.K. Rowling");
//                System.out.println("Book Author: " + b1.getbookAuthor());
//                BookManagement b2 = new BookManagement();
//                b2.setbookID(102);
//                System.out.println("Book ID: " + b2.getbookID());
//                b2.setbookName("The Hobbit");
//                System.out.println("Book Name: " + b2.getbookName());
//                b2.setbookAuthor("J.R.R. Tolkien");
//                System.out.println("Book Author: " + b1.getbookAuthor());

//member
//member.setName("Qasim");
//              member.setEmail("qasim@gmail.com");
//              member.setID(045);
//              member.setcontNo(03001234567);
//              member.setGender("Male");
//              member.setJoinDate("2025-05-12");
//              System.out.println("Member Name: " + member.getName());
//              System.out.println("Member Email: " + member.getEmail());
//              System.out.println("Member ID: " + member.getID());
//              System.out.println("Contact Number: " + member.getcontNo());
//              System.out.println("Gender: " + member.getGender());
//              System.out.println("Join Date: " + member.getJoinDate());
              //employee
//e1.setID(105);
//              e1.setName("Ahmed");
//              e1.setEmail("ahmed@gmail.com");
//              e1.setcontNo(03001234567);
//              e1.setRole("Librarian");
//              e1.setWorkingShift("Morning");                        
//              System.out.println("Employee ID: " + e1.getID());
//              System.out.println("Employee Name: " + e1.getName());
//              System.out.println("Employee Email: " + e1.getEmail());
//              System.out.println("Phone Number: " + e1.getcontNo());
//              System.out.println("Employee Role: " + e1.getRole());
//              System.out.println("Working Shift: " + e1.getWorkingShift());
//book
           
//              BookManagement b1 = new BookManagement();
//              b1.setbookID(101);
//              b1.setbookName("Harry Potter");
//              b1.setbookAuthor("J.K. Rowling");
//              System.out.println("Book ID: " + b1.getbookID());
//              System.out.println("Book Name: " + b1.getbookName());
//              System.out.println("Book Author: " + b1.getbookAuthor());
//lRULES
//r2.setMaxBooksAllowed(5);
//               r2.setBorrowTimeLimit(15); 
//               r2.setFinePerDay(10); 
//               System.out.println("Max Books Allowed: " + r2.getMaxBooksAllowed());           
//               System.out.println("Borrow Time Limit (days): " + r2.getBorrowTimeLimit());
//               System.out.println("Fine Per Day (rupees): " + r2.getFinePerDay());
//               System.out.println("Library Branch: " + libraryRules.getLibraryBranch());
//               break; 
//memberfeedback
//f1.setFeedbackText("Great library services!");
//               System.out.println("Feedback:" + f1.getFeedbackText());
//               f1.setID(18);
//               f1.setName("Amna");
//               f1.setEmail("amna@library.com");
//               f1.setcontNo(03211234567);
//               System.out.println(" Member ID:" + f1.getID());
//               System.out.println("Employee Name: " + f1.getName());
//               System.out.println("Employee Email: " + f1.getEmail());
//               System.out.println("Phone Number: " + f1.getcontNo());
//FINEM
//f.setMemberID(101);
//                f.setBookID(501);
//                f.setOverdueDays(7);
//                System.out.println("Member ID: " + f.getMemberID());
//                System.out.println("Book ID: " + f.getBookID());
//                System.out.println("Overdue Days: " + f.getOverdueDays());
//                System.out.println("Fine Rate: " + FineManagement.FINE_RATE);
//                break;
//booktra
// t1.setMemberID(301);
//                t1.setBookID(201);
//                t1.setTransactionType("Issue: ");
//                t1.setTransactionDate("March 28, 2025");
//                System.out.println("Member ID: " + t1.getMemberID());                
//                System.out.println("Book ID: " +t1.getBookID());
//                System.out.println("Transaction Type: " + t1.getTransactionType());
//                System.out.println("Transaction Date: " + t1.getTransactionDate());
//Books b = new Books(101,"Harry Potter","J.K. Rowling",true);
             
//          
//             Employee e = new Employee("Librarian","Morning","Ahmed","ahmed@gmail.com",89,030012356);
//             e.employeeGui();
//                   
//             Member m = new Member("Amna",011,"amna@gmail.com",03001234567, "female","2025-05-12",24,true);
//             m.memberGui();
//
//             libraryRules r = new libraryRules(5,15,10);
//             r.libRulesGui();

//             Cubicle c = new Cubicle(06,true,"Ayeza");
//             c.cubicleGui();

//               Fine f = new Fine(5,12,3);
//               f.fneGui();
//               
//               bookTransaction t = new bookTransaction(005,051,"Issue","March 17, 2025");
//               t.bookTransactionGui();
//               
//               Computers comp = new Computers("Dell i7", true);
//               comp.computerGui();
//               
//               memberFeedback fb = new memberFeedback("Great library services!","Amna","amna@library.com",12,03211234567 );
//               fb.mbrfeedbachGui();

//    public static void performOperation(libraryOperations obj) {
//    System.out.println("Performing Operations");
//    obj.isvalid();
//    obj.isAllowed();
//    System.out.println("");
//    }