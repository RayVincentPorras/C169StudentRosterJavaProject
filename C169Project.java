package C169project;
/*
 * @author Ramon Vincent Porras
 * Assignment details: 
 * This assignment requires a student class and roster class to manage creating, updating, and retrieving data from a student roster.
 * The student data that is managed is the student id, student name, email address, age, and their grades. 
 */
public class C169Project {

    public static void main(String[] args) {
    	//As per the assignment, student information is entered through an array labeled students.
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                              "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                              "3,Jack,Napoli,The_lawyer99@yahoo.com,19,85,84,87",
                              "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
			      			  "5,Ramon,Porras,rporra1@wgu.edu,29,80,94,70"};
        
        //This will create the student roster object.
        Roster roster = new Roster();

            for(int i=0; i < students.length; i++) {
                String characters = students[i];
                String[] variable = characters.split(",");
                String studentId = variable[0];
                String firstName = variable[1];
                String lastName = variable[2];
                String email = variable[3];
                int age = Integer.parseInt(variable[4]);
                int grade1 = Integer.parseInt(variable[5]);
                int grade2 = Integer.parseInt(variable[6]);
                int grade3 = Integer.parseInt(variable[7]);
                
                Roster.add(studentId, firstName, lastName, email, age, grade1, grade2, grade3);
            }
        
        //Test print all. 
        Roster.print_all();
        //Test print invalid student emails to screen.
        Roster.print_invalid_emails();
        //Test print average grade to screen.
        Roster.print_average_grade("1");
        //Test removing student from the roster.
        Roster.remove("3");
        //Validate that the student has been removed. The result should be that it is not able to find the student.
        Roster.remove("3");
    };
}
    
    

    
