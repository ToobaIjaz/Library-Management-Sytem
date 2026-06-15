     package librarymanagementsystem;
     import javax.swing.*;
    public class Member extends Person {
    String gender;
    String joinDate;
    int age;
    boolean hasValidMembership; 
   
    public Member(String Name,int ID, String Email,int contNo, String gender, String joinDate, int age, boolean hasValidMembership) {
        super(Name,Email,ID,contNo);
        this.gender = gender;
        this.joinDate = joinDate;
        this.age = age;
        this.hasValidMembership = hasValidMembership;
    }
       public String toString() {
        return "MemberManagement{" + "gender=" + gender + ", joinDate=" + joinDate + ", age=" + age + ", hasValidMembership=" + hasValidMembership + '}';
    }
        public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isHasValidMembership() {
        return hasValidMembership;
    }
    public void setHasValidMembership(boolean hasValidMembership) {
        this.hasValidMembership = hasValidMembership;
    }

 
    
    public boolean isvalid() {
        if (age >= 5) {
            System.out.println("Member age is valid.");
            return true;
        } else {
            System.out.println("Too young to be a member.");
            return false;
        }
    }
    public boolean isAllowed() {
        if (hasValidMembership) {
            System.out.println("The member is eligible to borrow books.");
            return true;
        } else {
            System.out.println("The member does not have a valid membership.");
            return false;
        }
    }
    public void showRole() {
        System.out.println("This person is a library member who can borrow books!");
    }
    public void accessLibraryPortal() {
        System.out.println("Members can search and borrow books.");
    }
    public void displayWelcomeMessage() {
        System.out.println("Welcome! You're logged in as a library member.");
    }


     public void memberGui() {
    JFrame f = new JFrame("Member Class");
    f.setSize(400, 450);             
    f.setLocation(500, 500);
    f.setLayout(null);

    JLabel genderLabel = new JLabel("Enter Gender:");
    genderLabel.setBounds(30, 30, 150, 30); 
    f.add(genderLabel);

    JTextField genderField = new JTextField();
    genderField.setBounds(170, 30, 150, 30);
    f.add(genderField);

    JLabel joinDateLabel = new JLabel("Enter Join Date:");
    joinDateLabel.setBounds(30, 80, 150, 30);
    f.add(joinDateLabel);

    JTextField joinDateField = new JTextField();
    joinDateField.setBounds(170, 80, 150, 30);
    f.add(joinDateField);

    JLabel ageLabel = new JLabel("Enter Age:");
    ageLabel.setBounds(30, 130, 150, 30);
    f.add(ageLabel);

    JTextField ageField = new JTextField();
    ageField.setBounds(170, 130, 150, 30);
    f.add(ageField);

    JLabel membershipLabel = new JLabel("Valid Membership (true/false):");
    membershipLabel.setBounds(30, 180, 200, 30);
    f.add(membershipLabel);

    JTextField membershipField = new JTextField();
    membershipField.setBounds(230, 180, 90, 30);
    f.add(membershipField);

    JButton b = new JButton("Add Member Details");
    b.setBounds(100, 240, 180, 40);
    f.add(b);
    f.setVisible(true);
}
}

   


    
    
  




















//polymorhism
//     public void setName(String Name) {
//        if(Name.length() > 5){
//                this.Name = Name;
//            }
//            else {
//                System.out.println("Enter name longer than 5 characters!");
//            }
        
  
//}
  
 
  
    //int memberid;
//    String membername;
//    String memberEmail;
//    
//    public void insertrecord(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter member id: ");
//        memberid = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter member name: ");
//        membername = sc.nextLine();
//        System.out.println("Enter member Email : ");
//        memberEmail = sc.nextLine(); 
//    }
//         
//         
//     public void showrecord(){
//        System.out.println("id: " + memberid);
//        System.out.println("name: " + membername);
//        System.out.println("author: " + memberEmail);
//}
    
//static int totalMembers = 0;
//
// public MemberManagement() {
//        totalMembers++;
//    }
//    public static int getTotalMembers() {
//        return totalMembers; 
//System.out.println("Total Members: " + MemberManagement.getTotalMembers());
//}
//    public void showrecord(){
//        System.out.println("Member id: " + ID);
//        System.out.println(" Member name: " + Name);
//        System.out.println("join date: " + joinDate );
//}
