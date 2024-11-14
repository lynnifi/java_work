package ten40EZ;

/** @author:Cailyn Farrell
    @date : 11/14/24
    Block X
**/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
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
	
	public static int InputInt () {
		int x = 0;
		Scanner kb = new Scanner(System.in);
		boolean yay = false;
		while (!yay) {
            try {
                x = kb.nextInt();
                yay=true;
            } catch (InputMismatchException e) {
            	System.out.println("Please follow the formatting.");
                kb.next(); 
            }
        }
		return x;
	}
	public static boolean InputDependent () {
		Scanner kb = new Scanner(System.in);
		boolean yay = false;
		boolean d = false ;
		while (!yay) {
            try {
                String x = kb.nextLine();
                if(x.toLowerCase().equals("Dependent")) {
	                yay=true;
	                d = true;
                }
                if(x.toLowerCase().equals("Independent")) {
	                yay=true;
	                d = false;
                }
            } catch (InputMismatchException e) {
            	System.out.println("Please follow the formatting.");
                kb.next(); 
            }
        }
		return d;
	}
	
	@Override
	public int getLine1(String prompt) {
		if (line1_fromFile != -1) {
			return line1_fromFile; // data has already been entered from a file
		}
		// Student code finishes out this method
		else {
			
			a		
			
		}
		return InputInt();
	}
	@Override
	public int getLine2(String prompt) {
		if (line2_fromFile != -1) {
			return line2_fromFile; // data has already been entered from a file
		}
		// Student code finishes out this method
		else {
			System.out.println("Please enter your taxable interest. (Line 2)");
		}
		int taxinterest = InputInt();
		if (taxinterest>1500) {
			System.out.println("Your taxable interest is too high for you to use this form.");
			System.exit(0);
		}
		return taxinterest;
	}

	@Override
	public int getLine3(String prompt) {
		if (line3_fromFile != -1) {
			return line3_fromFile; // data has already been entered from a file
		}
		// Student code finishes out this method
		else {
			System.out.println("Please enter your unemployment compensation and Alaska Permanent Fund dividends. (Line 3)");
		}
		return InputInt();
		// TODO Auto-generated method stub
	}

	@Override
	public int calculateLine4(int line1, int line2, int line3) {
		// TODO Auto-generated method stub
		return line1+line2+line3;
	}

	@Override
	public int getLine5A(String prompt) {
		if (line5A_fromFile != -1) {
			return line5A_fromFile; // data has already been entered from a file
		}
		// Student code finishes out this method
		else {
			System.out.println("Please enter 'dependent' or 'independent' based on your status. (Line 1)");
		}
		return 0;
		// TODO Auto-generated method stub
	}

	@Override
	public int calculateLine5(int line1, int line5a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateLine6(int line4, int line5) {
		// TODO Auto-generated method stub
		int x =0;
		if (line5<=line4) {
			x= line4-line5;
		}
		if (line4-line5>100000) {
			System.out.println("Your taxable income is too high for you to use this form.");
			System.exit(0);
		}
		return x;
	}

	@Override
	public int getLine7(String prompt) {
		if (line7_fromFile != -1) {
			return line7_fromFile; // data has already been entered from a file
		}
		// Student code finishes out this method
		else {
			System.out.println("Please enter your federal income tax. (Line 7)");
		}
		return InputInt();
		// TODO Auto-generated method stub
	}

	@Override
	public int calculateLine9(int line7, int line8) {
		// TODO Auto-generated method stub
		return line7+line8;
	}

	@Override
	public int getLine10(String prompt, int line6) {
		if (line10_fromFile != -1) {
			return line10_fromFile; // data has already been entered from a file
		}
		// Student code finishes out this method
		else {
			System.out.println("Please enter your tax from the tax table using the value:" + line6 + ". (Line 10)");
		}
		return InputInt();
		// TODO Auto-generated method stub
	}

	@Override
	public int calculateLine12(int line10, int line11) {
		// TODO Auto-generated method stub
		return line10+line11;
	}

	@Override
	public int calculateLine13(int line9, int line12) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateLine14(int line9, int line12) {
		// TODO Auto-generated method stub
		return 0;
	}



}
