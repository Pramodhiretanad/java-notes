package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordlength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email CREATED: " + this.firstName + " " + this.lastName);
        // call a method asking for the department - return the department
        this.department = setDepartment();
       // System.out.println("Department: " + this.department);
        // call a method that returns Random password
        this.password = randomPassword(defaultPasswordlength);
        System.out.println("your password is: " + this.password);
        // Combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
       // System.out.println("Your email is: " + email);
     }
    // Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 For Development\n3 for Account\n0 for None\nENTER department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return " ";
        }
    }
        // Generate a random Password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
        // Set the mailbox Capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
        // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
        // change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailBoxCapacity(){ return mailBoxCapacity;}
    public String getAlternateEmail() { return alternateEmail;}
    public String getPassword(){ return password;}

    public String showInfo() {
        return  "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY MAIL: " + email  +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }

}
