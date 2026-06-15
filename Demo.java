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

