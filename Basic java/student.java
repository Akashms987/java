public class Student {
    String name;
    int age;
    String grade;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Akash M S";
        student1.age = 21;
        student1.grade = "A";
        student1.displayInfo();

        Student student2 = new Student();
        student2.name = "sunil";
        student2.age = 20;
        student2.grade = "B";
        student2.displayInfo();
    }
    
}
