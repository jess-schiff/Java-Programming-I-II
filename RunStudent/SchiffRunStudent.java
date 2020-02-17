
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SchiffRunStudent {

    public static void main(String[] args) {
        String fileName = "studentInput.txt";        
        try {
            Scanner in = new Scanner(new File(fileName));
            String collegeName = in.nextLine();
            System.out.println(collegeName);            
            while(in.hasNext()) {
                String studentID = in.nextLine().trim();
                String name = in.nextLine().trim();
                
                String major = in.nextLine().trim();
                String year = in.nextLine().trim();
                double gpa = Double.parseDouble(in.nextLine().trim());
                SchiffStudent student = new SchiffStudent(studentID, name, 
                        major,year.charAt(0), gpa);
                
                int index = student.getName().indexOf(" ");
                String firstName = student.getName().substring(0,index);
                String lastName = student.getName().substring(index+1);
                
                String email = firstName.charAt(0)+"-"+lastName+"@siu.edu";
                email = email.toLowerCase();
                int graduate;
                switch(student.getYear()) {
                    case 'S':  graduate = 2020; break;
                    case 'J':  graduate = 2021; break;
                    case 'O':  graduate = 2022; break;
                    case 'F':  graduate = 2023; break;
                    default: graduate = 0;break;                
                }
               
                System.out.println("-----------------------------------------");
                System.out.println("Student:           "+student.getName());
                System.out.println("Major:             "+student.getMajor());
                System.out.println("Graduating Year:   "+graduate);
                System.out.println("Email Address:     "+email);    
                System.out.println("GPA:               "+student.getGpa()); 
                
            }            
            in.close();
        } catch(FileNotFoundException ex) {
            System.out.println(fileName+" not found !");
        }
            
    }
    
}
