// Interface Exam with Percent_cal() method
interface Exam {
    void Percent_cal();
}

// Student class with name, roll_no, marks1, marks2 and show() method
class Student {
    String name;
    int roll_no;
    int marks1, marks2;

    public Student(String name, int roll_no, int marks1, int marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

// Result class inherits Student and implements Exam interface
class Result extends Student implements Exam {
    float per;

    public Result(String name, int roll_no, int marks1, int marks2) {
        super(name, roll_no, marks1, marks2);
    }

    // Implement Percent_cal() method from Exam interface
    public void Percent_cal() {
        per = (marks1 + marks2) / 2.0f;
    }

    // Display method to show percentage
    void display() {
        System.out.println("Percentage: " + per + "%");
    }
}

// Main class to test the implementation
public class ResultMI {
    public static void main(String[] args) {
        Result res = new Result("Ahad", 158, 85, 90);
        res.show();
        res.Percent_cal();
        res.display();
    }
}