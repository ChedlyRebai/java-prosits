import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentMangement = new StudentManagement();

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(0, "chedly", 10));
        studentList.add(new Student(2, "haythem", 70));
        studentList.add(new Student(3, "mohammed", 87));
        studentList.add(new Student(4, "hichem", 20));
        studentList.add(new Student(4, "houssem", 50));

        System.out.println("displayStudents:");
        Consumer<Student> con = student -> System.out.println(student);
        studentMangement.displayStudents(studentList, con);

        System.out.println("\ndisplayStudentsByFilter:");
        Predicate<Student> pre = student -> student.getAge() > 20;
        studentMangement.displayStudentsByFilter(studentList, pre, con);

        System.out.println("\nstudent names:");
        Function<Student, String> names = Student::getNom;
        String studentNames = studentMangement.returnStudentsNames(studentList, names);
        System.out.println(studentNames);
        System.out.println(names);


        System.out.println("\nstudent compare:");
        Comparator<Student> compareById = Comparator.comparingInt(Student::getId);
        List<Student> sorStudents = studentMangement.sortStudentsById(studentList, compareById);
        sorStudents.forEach(System.out::println);


        System.out.println("\nstream:");
        Stream<Student> studentStream = studentMangement.convertToStream(studentList);
        studentStream.forEach(System.out::println);

    }
}