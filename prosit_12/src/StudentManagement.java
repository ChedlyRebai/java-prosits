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
            if(pre.test(student)){
                con.accept(student);
            }
       }
    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        String names="";
        for (Student student : students) {
            fun.apply(student);
        }
        return names;
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
       return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        students.sort(com);
        return students;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }

}
