/*Name    : Sujit Patil
  Class   : SE 9
  Roll No : 23159
  Batch   : G9
*/ 
import java.util.Scanner;
class Employee { // Declaring Employee class
    public int emp_id;
    public String emp_name;
    public String email_id;
    public long contact_no;
    static int count1;
    static int count2;
    public double salary, bp, da, hra, pf, club_fund;

   
    Employee() { //Default constructor
        emp_id = 0;
        emp_name = "Noname";
        email_id = "xyz@gmail.com";
        contact_no = 111111111L;
    }

    String verify_name(Employee arr[], int i) {//Function to verify name of employee
        String name;
        Scanner sc = new Scanner(System.in);
        int j = 0;
        do {
            System.out.println("Enter name of employee : ");
            name = sc.nextLine();

            for (j = 0; j < i; j++) {
                if (arr[j].emp_name.equals(name)) {
                    System.out.println("Duplicate names are not allowed ");
                    break;
                }
            }

        } while (j < i);
        return name;
    }

    boolean traverse_email(String email) {//Function to traverse each character of email id of employee and check that is there any uppercase letter in email
        int count = 0;
        for (int i = 0; i < email.length(); i++) {

            if (Character.isUpperCase(email.charAt(i))) {
                count++;
            }
        }

        if (count == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    String verify_emailid(Employee arr[], int i) {//Function to verify email id 
        String email;
        Scanner sc = new Scanner(System.in);
        int j = 0;
        do {
            System.out.println("Enter email-id  of employee : ");
            email = sc.nextLine();

            for (j = 0; j <= i; j++) {
                if (arr[j].email_id.equals(email)) {
                    System.out.println("Duplicate email id's are not allowed ");
                    break;
                }
                if ((!(email.endsWith("@gmail.com"))) || (traverse_email(email))) {//This condtion ensures that email ends with @gmail.com and there is no uppercase letter in it
                    System.out.println("Please enter valid email-id");
                    break;
                }
            }

        } while (j < i);
        return email;
    }

    int verify_id(Employee arr[], int i) {//Function to verify id of employee
        int id;
        Scanner sc = new Scanner(System.in);
        int j = 0;
        do {
            System.out.println("Enter id of employee : ");
            id = sc.nextInt();

            for (j = 0; j < i; j++) {
                if (arr[j].emp_id == id) {
                    System.out.println("Duplicate id's are not allowed ");
                    break;
                }

            }

        } while (j < i);

        return id;

    }

    long verify_contactno(Employee arr[], int i) {//Function to verify contact no of employee
        long number;
        Scanner sc = new Scanner(System.in);
        int j = 0;
        do {
            System.out.println("Enter contact no.of employee : ");
            number = sc.nextInt();

            for (j = 0; j < i; j++) {
                if (arr[j].contact_no == number) {
                    System.out.println("Duplicate contact numbers are not allowed ");
                    break;
                }

            }

        } while (j < i);
        return number;
    }

    void getdata(Employee arr[], int i) {//Function to collect data of employee
        Scanner sc = new Scanner(System.in);
        emp_name = verify_name(arr, i);
        email_id = verify_emailid(arr, i);
        emp_id = verify_id(arr, i);
        contact_no = verify_contactno(arr, i);
        System.out.println("Enter basic pay of employee no. " + ((count1) + 1));
        bp = sc.nextDouble();
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club_fund = 0.001 * bp;
        salary = (bp + da + hra + pf + club_fund);
        count1++;
    }

    void display() {//Function to display data of employee
        System.out.println("\n");
        System.out.println("Details of employee no. " + ((count2) + 1) + " are as follows : ");
        System.out.println("Name : " + emp_name);
        System.out.println("Id : " + emp_id);
        System.out.println("Email Id : " + email_id);
        System.out.println("Contact no. : " + contact_no);
        System.out.println("\n");
        count2++;
    }
}

class programmer extends Employee {//Programmer class derived from class Employee
    static int count_programmer1;
    static int count_programmer2;
    static int count_programmer3;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of programmer no. " + ((count1) + 1));
        emp_name = sc.nextLine();
        System.out.println("Enter email id of programmer no. " + ((count_programmer1) + 1));
        email_id = sc.nextLine();
        System.out.println("Enter id of programmer no. " + ((count_programmer1) + 1));
        emp_id = sc.nextInt();
        System.out.println("Enter basic pay of programmer no. " + ((count_programmer1) + 1));
        bp = sc.nextDouble();
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club_fund = 0.001 * bp;
        salary = (bp + da + hra + pf + club_fund);
        count_programmer1++;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Details of programmer no. " + ((count_programmer2) + 1) + " are as follows : ");
        System.out.println("Name : " + emp_name);
        System.out.println("Id : " + emp_id);
        System.out.println("Email Id : " + email_id);
        System.out.println("\n");
        count_programmer2++;
    }

    void generate_payslip() {
        System.out.println("**********Salary Reciept*******");
        System.out.println("Employee Type : Programmer\nProgrammer No : " + ((count_programmer3) + 1));
        System.out.println("Basic Pay : Rs " + bp);
        System.out.println("DA : Rs " + da);
        System.out.println("HRA : Rs " + hra);
        System.out.println("PF : Rs " + pf);
        System.out.println("Club Fund : Rs " + club_fund);
        System.out.println("Total Salary : Rs " + salary);
      
        count_programmer3++;
    }
}

class Team_leader extends Employee {//Team_leader class derived from class Employee
    static int count_teamleader1;
    static int count_teamleader2;
    static int count_teamleader3;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of team leader no. " + ((count_teamleader1) + 1));
        emp_name = sc.nextLine();
        System.out.println("Enter email id of Team Leader no. " + ((count_teamleader1) + 1));
        email_id = sc.nextLine();
        System.out.println("Enter id of Team Leader no. " + ((count_teamleader1) + 1));
        emp_id = sc.nextInt();
        System.out.println("Enter basic pay of Team Leader no. " + ((count_teamleader1) + 1));
        bp = sc.nextDouble();
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club_fund = 0.001 * bp;
        salary = (bp + da + hra + pf + club_fund);
        count_teamleader1++;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Details of programmer no. " + ((count_teamleader2) + 1) + " are as follows : ");
        System.out.println("Name : " + emp_name);
        System.out.println("Id : " + emp_id);
        System.out.println("Email Id : " + email_id);
        System.out.println("\n");
        count_teamleader2++;
    }

    void generate_payslip() {
        System.out.println("**********Salary Reciept*******");
        System.out.println("Employee Type : Team Leader\nTeam Leader No : " + ((count_teamleader3) + 1));
        System.out.println("Basic Pay : Rs " + bp);
        System.out.println("DA : Rs " + da);
        System.out.println("HRA  :Rs " + hra);
        System.out.println("PF : Rs " + pf);
        System.out.println("Club Fund : Rs " + club_fund);
        System.out.println("Total Salary : Rs " + salary);
        count_teamleader3++;

    }
}

class Project_Manager extends Employee {//Project manager class derived from class employee
    static int count_Projectmanager1;
    static int count_Projectmanager2;
    static int count_Projectmanager3;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of project manager no. " + ((count_Projectmanager1) + 1));
        emp_name = sc.nextLine();
        System.out.println("Enter email id of project manager no. " + ((count_Projectmanager1) + 1));
        email_id = sc.nextLine();
        System.out.println("Enter id of project manager no. " + ((count_Projectmanager1) + 1));
        emp_id = sc.nextInt();
        System.out.println("Enter basic pay of project manager no. " + ((count_Projectmanager1) + 1));
        bp = sc.nextDouble();
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club_fund = 0.001 * bp;
        salary = (bp + da + hra + pf + club_fund);
        count_Projectmanager1++;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Details of Project manger no. " + ((count_Projectmanager2 + 1) + " are as follows : "));
        System.out.println("Name : " + emp_name);
        System.out.println("Id : " + emp_id);
        System.out.println("Email Id : " + email_id);
        System.out.println("\n");
        count_Projectmanager2++;
    }

    void generate_payslip() {
        System.out.println("**********Salary Reciept*******");
        System.out.println("Employee Type : Project Manager\nProject Manager No : " + ((count_Projectmanager3) + 1));
        System.out.println("Basic Pay : Rs " + bp);
        System.out.println("DA : Rs " + da);
        System.out.println("HRA  :Rs " + hra);
        System.out.println("PF : Rs " + pf);
        System.out.println("Club Fund : Rs " + club_fund);
        System.out.println("Total Salary : Rs " + salary);
        count_Projectmanager3++;

    }
}

class Assistant_Project_Manager extends Employee {//Assistant Project Manager derived from class employee
    static int count_asstprojectmanager1;
    static int count_asstprojectmanager2;
    static int count_asstprojectmanager3;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of project manager no. " + ((count_asstprojectmanager1) + 1));
        emp_name = sc.nextLine();
        System.out.println("Enter email id of project manager no. " + ((count_asstprojectmanager1) + 1));
        email_id = sc.nextLine();
        System.out.println("Enter id of project manager no. " + ((count_asstprojectmanager1) + 1));
        emp_id = sc.nextInt();
        System.out.println("Enter basic pay of project manager no. " + ((count_asstprojectmanager1) + 1));
        bp = sc.nextDouble();
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club_fund = 0.001 * bp;
        salary = (bp + da + hra + pf + club_fund);
        count_asstprojectmanager1++;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Details of Project manger no. " + ((count_asstprojectmanager2 + 1) + " are as follows : "));
        System.out.println("Name : " + emp_name);
        System.out.println("Id : " + emp_id);
        System.out.println("Email Id : " + email_id);
        System.out.println("\n");
        count_asstprojectmanager2++;
    }

    void generate_payslip() {
        System.out.println("**********Salary Reciept*******");
        System.out.println("Employee Type : Assistant Project Manager\nAssistant Project Manager No : "
                + ((count_asstprojectmanager3) + 1));
        System.out.println("Basic Pay : Rs " + bp);
        System.out.println("DA : Rs " + da);
        System.out.println("HRA  :Rs " + hra);
        System.out.println("PF : Rs " + pf);
        System.out.println("Club Fund : Rs " + club_fund);
        System.out.println("Total Salary : Rs " + salary);
        count_asstprojectmanager3++;
    }
}

public class lab_Assign2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;
    do{
        System.out.println("\nSelect the employee type :\n\t1.Programmer\n\t2.Team Leader\n\t3.Project Manager\n\t4.Assistant Project Manager\n\t5.Exit");
        choice = sc.nextInt();//Taking choice from user about which employee type to choose 

        switch (choice) {
            case 1:{
            System.out.println("Enter the maximum no. of programmers ");
            int max_programmer = sc.nextInt();
            programmer arr[] = new programmer[max_programmer];
            for(int i =0;i<max_programmer;i++){
                arr[i] = new programmer();
                arr[i].getdata(arr, i);
            }
            for(int i =0;i<max_programmer;i++){
                arr[i].display();
                arr[i].generate_payslip();
            }
            }
                break;

            case 2:{
                System.out.println("Enter the maximum no. of team leaders ");
                int max_teamleader = sc.nextInt();
                Team_leader arr[] = new Team_leader[max_teamleader];
                for(int i =0;i<max_teamleader;i++){
                    arr[i] = new Team_leader();
                    arr[i].getdata(arr, i);
                }
                for(int i =0;i<max_teamleader;i++){
                    arr[i].display();
                    arr[i].generate_payslip();
                }
                }
                    break;
            
            case 3:{
                System.out.println("Enter the maximum no. of project managers ");
                int max_pmanager = sc.nextInt();
                Project_Manager arr[] = new Project_Manager[max_pmanager];
                for(int i =0;i<max_pmanager;i++){
                    arr[i] = new Project_Manager();
                    arr[i].getdata(arr, i);
                }
                for(int i =0;i<max_pmanager;i++){
                    arr[i].display();
                    arr[i].generate_payslip();
                }
                }
                    break;
            
            case 4:{
                System.out.println("Enter the maximum no. of Assistant project managers ");
                int max_asstpmanager = sc.nextInt();
                Assistant_Project_Manager arr[] = new Assistant_Project_Manager[max_asstpmanager];
                for(int i =0;i<max_asstpmanager;i++){
                    arr[i] = new Assistant_Project_Manager();
                    arr[i].getdata(arr, i);
                }
                for(int i =0;i<max_asstpmanager;i++){
                    arr[i].display();
                    arr[i].generate_payslip();
                }
                }
                    break;
            
            case 5: 
              break;
        
            default:{
                System.out.println("Wrong choice !");
            }
                break;
        }
    }while(choice!= 5);

    }
}