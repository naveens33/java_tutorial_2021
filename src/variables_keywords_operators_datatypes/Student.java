package variables_keywords_operators_datatypes;

public class Student {
    int rollNo = 0;
    String name = "";
    static String schoolName = "";

    Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    //non-static method
    void displayDetails(){
        System.out.println(rollNo+" "+name+" "+schoolName);
    }

    static void displaySchoolDetails(){
        System.out.println(schoolName);
    }

    public static void main(String[] args){
        Student s1 = new Student(1, "Anish");


        Student s2 = new Student(3, "Mike");

        schoolName = "Don Bosco";

        s1.displayDetails();
        s2.displayDetails();

        displaySchoolDetails();
    }
}
