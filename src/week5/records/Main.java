package week5.records;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ayşe", "Kara", 1234);
        Student student2 = new Student("Fatma", "Beyaz", 1235);
        Student student3 = new Student("Ayşe", "Kara", 1234);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Student1 equals Student2 " + student1.equals(student2));
        System.out.println("Student1 equals Student3 " + student1.equals(student3));

        System.out.println("Student1 hashCode: " + student1.hashCode());
        System.out.println("Student3 hashCode: " + student3.hashCode());

        System.out.println("Student1 hashCode = Student3 hashCode " + (student1.hashCode() == student3.hashCode()));


    }
}
