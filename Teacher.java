
public class Teacher extends Person {
    private String[] courses;
    private static final int MAX_COURSES = 5;
    private int numCourses;

    public Teacher(String nama, String alamat) {
        super(nama, alamat);
        courses = new String[MAX_COURSES];
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

    public boolean removeCourse(String course) {
        boolean found = false;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                found = true;
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                break;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mata Kuliah: " + numCourses;
    }
}