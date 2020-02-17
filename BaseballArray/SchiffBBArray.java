
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SchiffBBArray {

    public static void main(String[] args) {
        String fileName = "bbInput.txt";        
        try {
            Scanner in = new Scanner(new File(fileName));
            //Read the name of the basketball player
            String name = in.nextLine().trim();
            //Read the year the player turned pro
            int proYear= Integer.parseInt(in.nextLine().trim());
            //Read the number of years the basketball player has played in the NBA.  
            //Use this value as the size of an array of type double
            int nYears= Integer.parseInt(in.nextLine().trim());
            double [] array  = new double[nYears];  
            /*
                Create a for loop that iterates from 0 to the number of years 
                the player has played pro.  In the loop read the number of FGA 
                and FGM for the year
            */
            for(int i=0;i<nYears;i++) {
                double  fga = Double.parseDouble(in.nextLine());
                double  fgm = Double.parseDouble(in.nextLine());
                array[i] = fgm/fga;
            }
            in.close();       
            //Call method
            printFGP(name,proYear,array);          
           
        } catch(FileNotFoundException ex) {
            System.out.println(fileName+" not found !");
        }
    }
    
    //Method for displaying info
    static void printFGP(String name, int year, double array[]) {
        System.out.printf("%s's Field Goal Percentage By Year:\n\n",name);
        for(int i=0;i<array.length;i++) {
            System.out.printf("Year: %d Field Goal Percentage: %.1f\n",
                    year+i,array[i]*100);
        }
    }
            
}
