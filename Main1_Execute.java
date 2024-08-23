import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Change my name to yours in the class name and file name
public class Main1_Execute {
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Application to use arrays for grades of some test.\n");
        
		System.out.println("I am creating a test and read the grades from a file.");
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many students? ");
		int scnt = in.nextInt();
		
		
		//Create an object of gradeRecord_?? for a test and
                    //display the test information
		Main1 myTest = new Main1();
		myTest.setStudentCount(scnt);
		myTest.displayInfo();

		//Create an object to represent a text file - source of the data
		File inFile = new File("grades.txt");
		Scanner input = new Scanner(inFile);
		
		//Call a method of the class to read the grades for
                    // this test from the above input file
        myTest.inputData(input);
        
		//Get the data for this test and display
		String[] sn = new String[scnt];
		float[] sg = new float[scnt];
		myTest.getData(sn, sg);
		for (int i=0; i<sn.length; i++) {
            System.out.printf("%s\t%.2f\n", sn[i], sg[i]);
	    }
        System.out.println();
        //Display the average of the grades
		calcAverage(sg);
		System.out.printf("%f", calcAverage(sg));
	} //end main method
	
	private static float calcAverage(float[] s) {
	    float av=0;
	    
	    for (int i=0; i<s.length; i++) {
	        av += s[i];
	    }
	    
	    return av/s.length;
	} //end method calcAverage
} //end of class