package InnerClass.localInnerClass;

import java.time.LocalDate;

public class Exam {
    void evaluate(int marks) {
        class GradeCalculator {
            String calculate() {
                if (marks >= 75) return "Destination";
                else if(marks >=60) return "First Class";
                else return "pass";
            }

        }
        GradeCalculator gc = new GradeCalculator();
        System.out.println("gc.calculate");
    }
    void displayExamDate() {
        LocalDate date = LocalDate.now().plusDays(5);
        System.out.println("The exam date is:" + date);

    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.evaluate(67);
        exam.evaluate(89);
        exam.displayExamDate();
    }
}
/*
*Grade logic is scoped to the  " evaluate " method
* it avoids polluting the class with helper methods
* it helps in desiging the codebase
 */