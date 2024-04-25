package ie.atu.sw;

import java.io.File;
import java.io.PrintWriter;

/*
 * The class NGramOutputter is used  to store methods that are used to write a file that 
 * 		has the table with n-grams and n-gram frequencies saved
 */

public class NGramOutputter {
	/*
	 * The method save() is used to save NGrams and their frequencies into an output file
	 * It uses the PrintWriter class which writes the values from the table array into an
	 * output file
	 */
	public static void save(Object[][] table, String file) throws Exception {
		PrintWriter pw = new PrintWriter(new File(file));
		/*
		 * For every row in the table, PrintWriter writes a row(n-gram string), comma, 
		 * frequencies of n-grams in file, then separates each line in the output document
		 */
		for (int row = 0; row < table.length; row++) {
			if (table[row][0] != null)
				pw.write(table[row][0] + "," + table[row][1] + "\n");
		}

		pw.close();
	}

}
