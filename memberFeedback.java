
package librarymanagementsystem;
import javax.swing.*;
public class memberFeedback extends Person {
    String feedbackText;
    
    public void mbrfeedbachGui(){
        JFrame f = new JFrame("Feedback Form");
        f.setSize(400, 300);
        f.setLocation(500, 300);
        f.setLayout(null);

        JLabel feedbackLabel = new JLabel("Enter Feedback:");
        feedbackLabel.setBounds(30, 20, 150, 30);
        f.add(feedbackLabel);

        JTextArea feedbackArea = new JTextArea();
        feedbackArea.setBounds(30, 50, 250, 100);
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);
        f.add(feedbackArea);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(130, 180, 120, 40);
        f.add(submitButton);

        f.setVisible(true);
    }

    public memberFeedback(String feedbackText, String Name, String Email, int ID, int contNo) {
        super(Name, Email, ID, contNo);
        this.feedbackText = feedbackText;
    }
     public void showRole(){
     System.out.println("This member gives feedback about library services!");
    }
     
     public void accessLibraryPortal(){
    System.out.println("Members can submit feedback on the portal and check responses from staff.");
    }
     
     public void displayWelcomeMessage() {
    System.out.println("Welcome! You're logged in to share your feedback.");
}
     
   
    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getFeedbackText() {
        return feedbackText;
    }
}



















//static int totalFeedbacks = 0;
// public memberFeedback() {
//        totalFeedbacks++;
//    }
//    public static int getTotalFeedbacks() {
//        return totalFeedbacks;
//    }
//System.out.println("Office Location: " + EmployeeManagement.officeLocation);
//public static String officeLocation = "Main Campus Building";
//System.out.println("Total Feedbacks: " + memberFeedback.getTotalFeedbacks());

