/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;
import javax.swing.*;
public class Cubicle {
    int cubicleNumber;
    boolean isAvailable;
    String reservedBy;
    public Cubicle(int cubicleNumber, boolean isAvailable, String reservedBy) {
        this.cubicleNumber = cubicleNumber;
        this.isAvailable = isAvailable;
        this.reservedBy = reservedBy;
    }
    public String toString() {
        return "Cubicle{" + "cubicleNumber=" + cubicleNumber + ", isAvailable=" + isAvailable + ", reservedBy=" + reservedBy + '}';
    }
    public int getCubicleNumber() {
        return cubicleNumber;
    }
    public boolean isIsAvailable() {
        return isAvailable;
    }
    public String getReservedBy() {
        return reservedBy;
    }
    
    
    
    
    
    
    
    
    
    
     public void cubicleGui(){
         JFrame f = new JFrame("Library Cubicle");
        f.setSize(400, 300);
        f.setLocation(500, 300);
        f.setLayout(null);

        JLabel cubicleLabel = new JLabel("Cubicle Number:");
        cubicleLabel.setBounds(30, 30, 150, 30);
        f.add(cubicleLabel);

        JTextField cubicleField = new JTextField();
        cubicleField.setBounds(180, 30, 150, 30);
        f.add(cubicleField);

        JLabel availableLabel = new JLabel("Is Available (true/false):");
        availableLabel.setBounds(30, 80, 170, 30);
        f.add(availableLabel);

        JTextField availableField = new JTextField();
        availableField.setBounds(200, 80, 130, 30);
        f.add(availableField);

        JLabel reservedByLabel = new JLabel("Reserved By:");
        reservedByLabel.setBounds(30, 130, 150, 30);
        f.add(reservedByLabel);

        JTextField reservedByField = new JTextField();
        reservedByField.setBounds(180, 130, 150, 30);
        f.add(reservedByField);

        JButton saveButton = new JButton("Save Cubicle Info");
        saveButton.setBounds(100, 190, 180, 40);
        f.add(saveButton);
        f.setVisible(true);
    }
  
}
