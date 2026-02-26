//Given Student, Faculty, and Course classes related by mapping
package MOREONCOLLECTION;
import java.util.*;
class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Faculty {
    int id;
    String name;
    Faculty(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Course {
    int id;
    String title;
    Course(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

public class Test9 {
    public static void main(String[] args) {
        // Create objects
        Student s1 = new Student(1, "Ravi");
        Student s2 = new Student(2, "Neha");

        Faculty f1 = new Faculty(1, "Dr. Sharma");
        Faculty f2 = new Faculty(2, "Prof. Rao");

        Course c1 = new Course(1, "Java");
        Course c2 = new Course(2, "Python");

        // Mapping student to course
        Map<Student, Course> studentCourseMap = new HashMap<>();
        studentCourseMap.put(s1, c1);
        studentCourseMap.put(s2, c2);

        // Mapping course to faculty
        Map<Course, Faculty> courseFacultyMap = new HashMap<>();
        courseFacultyMap.put(c1, f1);
        courseFacultyMap.put(c2, f2);

        // Fetching full details
        System.out.println("Student - Course - Faculty mapping:");
        for (Student s : studentCourseMap.keySet()) {
            Course course = studentCourseMap.get(s);
            Faculty faculty = courseFacultyMap.get(course);
            System.out.println(s.name + " → " + course.title + " → " + faculty.name);
        }
    }
}
