/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;
import java.util.*;

public class University {
     String instituteName;
     ArrayList<Library> library ;

    University(String instituteName, ArrayList<Library> library) {
        this.instituteName = instituteName;
        this.library = library;
    }
}

