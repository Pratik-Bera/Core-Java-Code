import java.util.Scanner;


public class College {
    public static void main(String[] args){
        Student s1=new Student();
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter Student ID :");
        s1.sID=scn.nextInt();
        System.out.print("Enter Student Name :");
        scn.nextLine();s1.sName=scn.nextLine();
        System.out.print("Enter Course Name : ");
        s1.sCourse=scn.nextLine();
        System.out.print("Enter Mail ID : ");
        s1.sMail=scn.nextLine();
        System.out.print("Enter Marks of Student : ");
        s1.sMarks=scn.nextDouble();
        System.out.print("Enter Fees of Student : ");
        s1.sFees=scn.nextDouble();
        System.out.println("Enter The Fees Status If paid type\"True\" Otherwise Type \"False\" :");
        s1.sFeesStatus=scn.nextBoolean();
        System.out.print("Enter The gender : ");
        s1.sGender=scn.next().charAt(0);
        System.out.print("Enter Mobile Number : ");
        s1.sMobile=scn.nextLong();

        System.out.println("The Data is Updated as follows. ");

        System.out.println("Student Id\t: "+s1.sID);
        System.out.println("Student Name\t: "+s1.sName);
        System.out.println("Course Name\t: "+s1.sCourse);
        System.out.println("Student Mail\t: "+s1.sMail);
        System.out.println("Student Marks\t: "+s1.sMarks);
        System.out.println("Student Fees\t: "+s1.sFees);
        System.out.println("Fees status\t: "+s1.sFeesStatus);
        System.out.println("Gender\t\t: "+s1.sGender);
        System.out.println("Mobile No\t: "+s1.sMobile);
    }
    
}
