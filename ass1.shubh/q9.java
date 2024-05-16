// Student.java
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Course.java
public class Course {
    private String code;
    private String name;
    private int capacity;
    private int enrolledStudents;

    public Course(String code, String name, int capacity) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent() {
        if (enrolledStudents < capacity) {
            enrolledStudents++;
        } else {
            throw new IllegalStateException("Course is full.");
        }
    }

    public void dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
        } else {
            throw new IllegalStateException("No students enrolled.");
        }
    }
}

// EnrollmentSystem.java
public interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails(Course course);
}

// Enrollment.java
public class Enrollment implements EnrollmentSystem {
    @Override
    public void enrollStudent(Student student, Course course) {
        course.enrollStudent();
        System.out.println(student.getName() + " has been enrolled in " + course.getName() + " (code: " + course.getCode() + ").");
    }

    @Override
    public void dropStudent(Student student, Course course) {
        course.dropStudent();
        System.out.println(student.getName() + " has been dropped from " + course.getName() + " (code: " + course.getCode() + ").");
    }

    @Override
    public void displayEnrollmentDetails(Course course) {
        System.out.println("Enrollment details for " + course.getName() + " (code: " + course.getCode() + "):");
        System.out.println("Capacity: " + course.getCapacity());
        System.out.println("Enrolled students: " + course.getEnrolledStudents());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create student and course objects
        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Doe");
        Course course1 = new Course("CSC101", "Introduction to Computer Science", 30);
        Course course2 = new Course("MTH101", "Calculus I", 50);

        // Create enrollment object
        Enrollment enrollment = new Enrollment();

        // Test enrolling and dropping students
        try {
            enrollment.enrollStudent(student1, course1);
            enrollment.enrollStudent(student2, course1);
            enrollment.enrollStudent(student1, course2);
            enrollment.displayEnrollmentDetails(course1);
            enrollment.displayEnrollmentDetails(course2);

            enrollment.dropStudent(student1, course1);
            enrollment.displayEnrollmentDetails(course1);

        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
}