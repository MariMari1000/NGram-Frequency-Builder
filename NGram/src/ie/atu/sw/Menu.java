package ie.atu.sw;

import java.util.Scanner;

/*
 * The Menu class for the NGram Frequency Builder contains methods for showing the menu to the user, 
 * storing user's inputs and running methods of the application
 */
public class Menu {
	private Parser p;
	private Scanner s;
	private boolean keepRunning = true;
	private int sizeNGram = 0;
	private String outputFileName = "";
	private String directoryName = "";

	public Menu() {
		s = new Scanner(System.in);
	}

	
	/*
	 * The start() method is used to show options to the user in the console and to
	 * 		store the function of the choices offered to the user
	 */
	public void start() {
		/*
		 * While the application is running, user sees the options in the console. 
		 * The variable choice, type int is initialized through Scanner class 
		 * The choice variable is surrounded by try - catch exception to make sure that the 
		 * 		input is a number (integer) 
		 * If a user chooses to input anything that is not an integer, the error message 
		 * 		will be shown and the application will again call start() method to present
		 * 		all the options to the user.

		 */
		while (keepRunning) {
			showOptions();
			int choice = 0;
			try {
				choice = Integer.parseInt(s.next());
			} catch (Exception e) {
				System.out.println("[ERROR]    Invalid input (choose numbers between 1-5)    [ERROR]");
				start();
			}
			/*
			 * The switch statement choice is used to select one of the 5 code blocks to be executed
			 * If the user chooses 1 - the method getTextDirectory() is invoked
			 * If the user chooses 2 - the method getSize() is invoked 
			 * If the user chooses 3 - the method getOutputFile() is invoked 
			 * If the user chooses 4 - the method build() is invoked 
			 * If the user chooses 5 - the method save(Object [][] table, String file) in the class 
			 * 		NGramOutputter is invoked and the application shuts down 
			 * The method save(Object [][] table, String file) is surrounded by a try
			 * 		catch expression to catch the exception if class PrintWriter can't write
			 * 		to the file which was entered by the user
			 */
			switch (choice) {
			case 1: {
				getTextDirectory();
				break;
			}
			case 2: {
				getSize();
				break;
			}
			case 3: {
				getOutputFile();
				break;
			}
			case 4: {
				build();
				break;
			}
			case 5: {
				System.out.println("[INFO]    Shutting down.... Please wait.....");
				keepRunning = false;
				try {
					NGramOutputter.save(p.getTable(), outputFileName);
					System.out.println("Saving is completed!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			default:
				System.out.println("[ERROR]    Invalid input    [ERROR]");
			}
		}
	}

	/*
	 * When the application is run, the showOptions() method is shown to the user in
	 * 		the console 
	 * The user then chooses the options 1-5 and the console prompts the
	 * 		user to enter the required info 
	 * The instruction messages are shown to the user to inform them about
	 * 		what to do next or what has been done
	 */

	private void showOptions() {

		System.out.println("************************************************************");
		System.out.println("*      ATU - Dept. Computer Science & Applied Physics      *");
		System.out.println("*                                                          *");
		System.out.println("*                  N-Gram Frequency Builder                *");
		System.out.println("*                                                          *");
		System.out.println("************************************************************");
		System.out.println("(1) Specify Text File Directory");
		System.out.println("(2) Specify n-Gram Size");
		System.out.println("(3) Specify Output File");
		System.out.println("(4) Build n-Grams ");
		System.out.println("(5) Quit");
		System.out.print("Select Option [1-5]>");
		System.out.println();

	}

	/*
	 * The method getTextDirectory() asks the user to enter the name of the
	 * 		directory and stores the name in the directoryName variable using
	 * 		Scanner class
	 */
	private void getTextDirectory() {
		System.out.print("Enter the full path for the Text File Directory: ");
		directoryName = s.next();
		System.out.println("Text File Directory is stored successfully!\n");
	}

	/*
	 * The method getSize() solicits the user to enter the size of n-gram 
	 * The size of the n-gram can be between 1 and 5 
	 * The sizeNGram variable is surrounded by a try - catch expression to make sure 
	 * 		that the n-gram size is correct value 
	 * The object of the Parser class is created with the n-gram size which is
	 * 		stored and later used to initialize all the possibilities for n-grams 
	 */
	private void getSize() {
		System.out.print("Enter the size of Ngrams: ");
		try {
			sizeNGram = Integer.parseInt(s.next());
			while (sizeNGram < 1 || sizeNGram > 5) {
				System.out.println("[ERROR]    Size needs to be between 1 and 5 (included)    [ERROR]");
				System.out.print("Enter the size of Ngrams: ");
				sizeNGram = Integer.parseInt(s.next());
			}
		} catch (Exception e) {
			System.out.println("[ERROR]    Invalid input    [ERROR]");
			getSize();
		}
		p = new Parser(sizeNGram);
		System.out.println("Size of NGrams is stored successfully!\n");
	}

	/*
	 * The method getOutputFile() stores the name of the output file that is entered
	 * 		by the user
	 */
	private void getOutputFile() {
		System.out.print("Enter the name for the Output File: ");
		outputFileName = s.next();
		System.out.println("Output File is stored successfully!\n");
	}

	/*
	 * The method build() calls the method parseDir() from the Parser class 
	 * It is surrounded by the try-catch exception to catch the exception if a
	 *     file is not readable or accessible
	 */
	private void build() {
		System.out.println("Building n-Grams!");
		try {
			p.parseDir(directoryName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
