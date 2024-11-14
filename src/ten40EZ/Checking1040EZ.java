package ten40EZ;

/** @author:
    @date : 
**/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Checking1040EZ implements EZ1040Methods {
	private Scanner kb;
	// Fields - for use only with file input - DO NOT EDIT VALUES
	private int line1_fromFile;
	private int line2_fromFile;
	private int line3_fromFile;
	private int line5A_fromFile; // input 0 or 1 --> number that can be claimed as dependents
	private int line7_fromFile;
	private int line10_fromFile; // this can be calculated, but you may ask the user to look it up in the table
									// (your choice)
	// Constructor - initializes the fields to values from the file or -1

	public Checking1040EZ(String[] args) {
		kb = new Scanner(System.in);
		// if args contains the name of a file, fill the input variables from the file
		if (args.length > 0) {
			Scanner inputFile = null;
			try {
				inputFile = new Scanner(new File(args[0]));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("\nA file name has been detected, but that file does not exist.");
				System.exit(1);
			}
			try {
				line1_fromFile = inputFile.nextInt();
				line2_fromFile = inputFile.nextInt();
				line3_fromFile = inputFile.nextInt();
				line5A_fromFile = inputFile.nextInt(); // 0 if not a dependent, 1 if dependent
				line7_fromFile = inputFile.nextInt();
				line10_fromFile = inputFile.nextInt();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.out
						.println("\nA file has been detected and read, but the contents are not formatted correctly.");
				System.exit(2);
			}
		} else { // No file input
			line1_fromFile = -1;
			line2_fromFile = -1;
			line3_fromFile = -1;
			line5A_fromFile = -1;
			line7_fromFile = -1;
			line10_fromFile = -1;
		}
	}
	// ****************************************************************************************************************
	// Student code starts below this point
	// NOTE: Do not change the value of any of the line variables above

	// if you wish to run using a data file, use this line:
	// java CheckingApp1040EZ d1.dat
	// *****************************************************************************************************************
	@Override
	public int getLine1(String prompt) {
		if (line1_fromFile != -1) {
			return line1_fromFile; // data has already been entered from a file
		}
		// Student code finishes out this method
		else {

		}
		return 0;
	}

	public int getLine2(String prompt) {
		return 0;
	}



}
