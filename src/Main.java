import java.util.HashSet;
import java.util.Set;

class Student {

    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public void nextCourse() {
        if (getAverageGrade() >= 3) {
            course++;
            System.out.println(name + " переведен на следующий курс");
        } else {
            System.out.println(name + " не переведен");
        }
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void removeBadStudents(Set<Student> students) {

        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void printStudents(Set<Student> students, int course) {

        System.out.println("Студенты курса " + course + ":");

        for (Student student : students) {

            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(
                "Иван",
                "A1",
                1,
                new int[]{5, 4, 4, 5,}
        ));

        students.add(new Student(
                "Петр",
                "A1",
                1,
                new int[]{2, 3, 2, 2}
        ));

        students.add(new Student(
                "Жанна",
                "B2",
                2,
                new int[]{5, 5, 4, 5}
        ));

        removeBadStudents(students);

        for (Student student : students) {
            student.nextCourse();
        }
        printStudents(students, 2);
        printStudents(students, 3);
    }
}