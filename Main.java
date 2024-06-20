
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data Mahasiswa
        System.out.println("=== Input data Mahasiswa ===");
        System.out.print("Nama: ");
        
        String studentName = scanner.nextLine();
        System.out.print("Alamat: ");
        
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        // Input Data Course
        System.out.print("Jumlah mata kuliah yang diambil: ");
        int numCourses = scanner.nextInt();
        System.out.print("\n");
        
        scanner.nextLine(); // consume newline
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Mata kuliah ke-" + (i + 1) + ": ");
            String course = scanner.nextLine();
            student.addCourse(course);
        }

        // Input Data Nilai
        for (int i = 0; i < numCourses; i++) {
            System.out.print("-> Nilai untuk Mata Kuliah " + student.courses[i] + ": ");
            int grade = scanner.nextInt();
            student.addCourseGrade(student.courses[i], grade);
        }

        // Cetak Data Mahasiswa dan Nilai
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println(student);
        student.printGrades();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());

        // Input Data Dosen
        System.out.println("\n=== Input data Dosen ===");
        System.out.print("Nama: ");
        String teacherName = scanner.next();
        
        System.out.print("Alamat: ");
        String teacherAddress = scanner.next();
        
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        // Input Mata Kuliah untuk Dosen
        System.out.print("Jumlah mata kuliah yang diajarkan: ");
        int numTeachingCourses = scanner.nextInt();
        System.out.print("\n");
        
        scanner.nextLine(); // consume newline
        for (int i = 0; i < numTeachingCourses; i++) {
            System.out.print("Mata kuliah yang diajarkan ke-" + (i + 1) + ": ");
            String course = scanner.nextLine();
            teacher.addCourse(course);
        }

        // Cetak Data Dosen
        System.out.println("\nInformasi Dosen:");
        System.out.println(teacher);

        scanner.close();
    }
}
