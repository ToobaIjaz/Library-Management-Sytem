/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;
import javax.swing.*;
public class Computers {
    String type;
    boolean isAvailable;

    public String toString() {
        return "Computers{" + "type=" + type + ", isAvailable=" + isAvailable + '}';
    }
    public String getType() {
        return type;
    }
    public boolean isIsAvailable() {
        return isAvailable;
    }
    public Computers(String type, boolean isAvailable) {
        this.type = type;
        this.isAvailable = isAvailable;
    }
    
    
    
    
    
    
    public void computerGui(){
        JFrame f = new JFrame("Computers");
        f.setSize(350, 200);
        f.setLocation(500, 300);
        f.setLayout(null);

        JLabel typeLabel = new JLabel("Enter Type:");
        typeLabel.setBounds(30, 30, 100, 30);
        f.add(typeLabel);

        JTextField typeField = new JTextField();
        typeField.setBounds(140, 30, 150, 30);
        f.add(typeField);

        JLabel availableLabel = new JLabel("Is Available (true/false):");
        availableLabel.setBounds(30, 80, 150, 30);
        f.add(availableLabel);

        JTextField availableField = new JTextField();
        availableField.setBounds(180, 80, 110, 30);
        f.add(availableField);

        JButton addDetails = new JButton("addDetails");
        addDetails.setBounds(90, 130, 150, 40);
        f.add(addDetails);
        f.setVisible(true);
    }
}
