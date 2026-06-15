/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;
import java.util.*;
public class Library {
    String name;
    //ArrayList<libraryRules> librules;
    libraryRules r1;
    ArrayList<Books> books;
    ArrayList<Member> members;
    ArrayList<Employee> employees;
    ArrayList<Cubicle> cubicles;
    ArrayList<Computers> comp;

    public Library(String name, ArrayList<Books> books, ArrayList<Member> members, ArrayList<Employee> employees, libraryRules r1,ArrayList<Cubicle> cubicles,ArrayList<Computers> comp) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.employees = employees;
        this.r1=r1;
        this.cubicles= cubicles;
        this.comp= comp;
    }
    public String toString() {
        return "Library{" + "name=" + name + ", r1=" + r1 + ", books=" + books + ", members=" + members + ", employees=" + employees + ", cubicles=" + cubicles + ", comp=" + comp + '}';
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Books> getBooks() {
        return books;
    }
    public ArrayList<Member> getMembers() {
        return members;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public  libraryRules getr1(){
        return r1;
    }
    public ArrayList<Cubicle> getCubicles() {
        return cubicles;
    }
        public libraryRules getR1() {
        return r1;
    }

    public ArrayList<Computers> getComp() {
        return comp;
    }
}