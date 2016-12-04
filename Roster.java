package C169project;
import java.util.ArrayList;
import java.util.List;

    public class Roster {
        static String invalidEmailPrompt = "Invalid email address: ";
        
        //Create list of student. 
        private static List<Student> students = new ArrayList<Student>();
        
        //Add student data to list.
        public static void add(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
            Student student = new Student(studentId, firstName, lastName, email, age, grade1, grade2, grade3);
            students.add(student);
        }
        
        //Print all students data to screen.
        public static void print_all() {
            for (Student student : students) {
                student.print();
            }
        }
        
        //Print all invalid student emails to screen.
        public static void print_invalid_emails() {   
            for(Student aStudent : students) {
                String emailsInRoster = aStudent.getEmail();
                    if (!emailsInRoster.contains("@")) {
                        System.out.println(invalidEmailPrompt + emailsInRoster);
                    }
                    
                    else if (emailsInRoster.contains(" ")) {
                        System.out.println(invalidEmailPrompt + emailsInRoster);
                    }
                    else if (!emailsInRoster.contains(".")) {
                        System.out.println(invalidEmailPrompt + emailsInRoster);
                    }             
            }
        }
        
        //Remove student by student id from the roster.
        public static void remove(String studentId) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentId().equals(studentId)) {
                    students.remove(i);
                    System.out.println("Student with the id of " + studentId + " has been removed.");
                    return;
                }
            }            
            System.out.println("Student ID " + studentId + " can not be found.");
        }
        
        //Print out the average grade for the student id entered in by the student data array.
        public static void print_average_grade(String studentId) {
            for (Student student : students) {
                if(student.getStudentId().equals(studentId)) {
                    double totalGradeAmount = student.getGrade1() + student.getGrade2() + student.getGrade3();
                    double gradeAverage = totalGradeAmount / 3;
                                       
                    System.out.println(gradeAverage + " is the average grade for the Student Id of " + studentId);                                  
                }
            }
        }    
}

