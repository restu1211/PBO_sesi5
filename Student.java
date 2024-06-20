
public class Student extends Person {
    private int numCourses;
    String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 10;

    public Student(String nama, String alamat) {
        super(nama, alamat);
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
        numCourses = 0;
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public void addCourseGrade(String course, int grade) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                grades[i] = grade;
                break;
            }
        }
    }

    public void printGrades() {
        System.out.print("Nilai:");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mata Kuliah: " + numCourses;
    }
}