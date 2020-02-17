
public class SchiffStudent {
    private String idNumber;
    private String name;
    private String major;
    private char year;
    private double gpa;
    
    public SchiffStudent() {
       idNumber = null; 
       name = null; 
       major = null; 
       year = 'z'; 
       gpa = 0; 
    }

    public SchiffStudent(String idNumber, String name, 
            String major, char year, double gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.major = major;
        this.year = year;
        this.gpa = gpa;
    }

    
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public char getYear() {
        return year;
    }

    public void setYear(char year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    
}
