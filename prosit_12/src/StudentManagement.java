import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        for (Student student : students) {
            con.accept(student);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
       for (Student student : students) {

        System.out.println(pre.test(student));
        
       }
       
    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnStudentsNames'");
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createStudent'");
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortStudentsById'");
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToStream'");
    }

}
