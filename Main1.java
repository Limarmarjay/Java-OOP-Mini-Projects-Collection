//Class definition
import java.util.Scanner;

//Class name, file name, and constructors
public class Main1 {
	//instance variables
	private int studentCount;
	
	//Add needed instance variables (arrays) for the student names and grades
    //studentNames and grades
	private String[] studentNames;
	private float[] grades;
	
	//set method
	public void setStudentCount(int students) {
		studentCount = students;
	}

	//get method
	public int getStudentCount() {
		return studentCount;
	}

	//method to display the information
	public void displayInfo() {
		System.out.printf("\nThere are %d students who took this test.", studentCount);
	}
    
	//Add a public method inputData to obtain all grades from the given source
    //It should use an object of Scanner as a parameter for the data source
    public void inputData(Scanner in) {
        //Create arrays for the student names and grades
        studentNames = new String[studentCount];
        grades = new float[studentCount];
        
        System.out.println("\n\nThe grades are:");
        for (int i=0; i<studentCount; i++) {
            studentNames[i] = in.next();
            grades[i] = in.nextFloat();
            System.out.printf("%s\t%.1f\n", studentNames[i], grades[i]);
        }
        System.out.println();
	}
	
	//Add a public method getData to get all student names and grades for checking
    //It should use array parameters to obtain the student names and grades
	public void getData(String[] sn, float[] g) {
	    for (int i=0; i<studentCount; i++) {
	        sn[i] = studentNames[i];
	        g[i] = grades[i];
	    }
	}
} //end of class