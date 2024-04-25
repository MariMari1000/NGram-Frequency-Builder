package ie.atu.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * The class Parser consists of methods that read the text from files, parse the text, 
 * count the number of n-grams in all the files in a directory and output the n-grams 
 * and the number of their appearances into a 2D array
 */
public class Parser {
	/*
	 * Declaring the Parser variables:
	 * table is a 2D array object 
	 * n is a type int variable, and later it marks the length of n-grams string
	 */
	private Object[][] table;
	private int n;

	/*
	 * In the constructor Parser a new object 2D array "table" is created and 
	 * 		it is made of two arrays - first type int which length is 26 to the
	 * 		power of size of n-gram string (which can vary from 1 to5), and the 
	 * 		second array type int which size is 2 which represents the pair of 
	 * 		n-gram and its frequency 
	 * n is the length of n-grams string.
	 */
	public Parser(int sizeNGrams) {
		table = new Object[(int) Math.pow(26, sizeNGrams)][2];
		n = sizeNGrams;
	}

	/*
	 * The method addNGram adds the n-gram string and a (long) number of the n-gram 
	 * 		appearances to the object array table. 
	 * addNGram uses hashCode method which compares (values of) strings by using only their
	 * 		hash code. With this approach new n-grams are stored much faster then in a
	 *      regular array

	 */
	public void addNGram(String ngram) {
		/*
		 * Declaring variables index and counter: 
		 * 		index is an int type variable and uses modulus operand to get the "slot" where
		 *      the pair (n-gram, frequency) will be stored 
		 * counter is a type long variable and it is assigned a value of 1
		 */
		int index = ngram.hashCode() % table.length;
		long counter = 1;
		/*
		 * Setting the condition: if there is a string in the table with the existing
		 * 		n-gram then the counter increments the frequency of that n-gram, and the counter
		 * 		is casted from type int to long to avoid integer overflow
		 */
		if (table[index][1] != null)
			counter += (Long) table[index][1];
		/*
		 * Setting the positions of n-gram and counter in the table: n-grams are placed
		 * in the first column, number of n-grams is stored in the second column 
		 * n-gram is set to column 0 and row index
		 * the counter is set to column 1 and row index
		 */
		table[index][0] = ngram;
		table[index][1] = counter;
	}

	/*
	 * The method parse() parses a line at a time from a file. It uses the
	 * BufferedReader function wrapped around FileInputStream and InputStreamReader
	 * to make the reading faster: instead of reading in a byte at a time, it reads
	 * in the whole lines
	 */
	public void parse(String file) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
			String line = null;
			/*
			 * Setting conditions for the BufferedReader function: while there are lines in
			 * the file, every line is split into words based on space and are processed as they are in the
			 * original text file. For every word, any characters that are not letters A-Z
			 * are removed from the line and then the line letters are transformed into
			 * lower case letters
			 */
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					word = word.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
					/*
					 * Processing the words into n-grams: iterating over every word in n-gram
					 * length, and breaking words into n-gram substrings
					 * 
					 */
					for (int i = 0; i < word.length() - n + 1; i++)
						addNGram(word.substring(i, i + n));
				}
			}
			br.close();
		}
	}

	/*
	 * This method takes in the name of the directory and parses all the files
	 * in that directory
	 */
	public void parseDir(String dir) throws Exception {
		/*
		 * Creating a new File instance and a string array files. All the titles of the
		 * files are listed in the string array and then the files parsed by calling the parse() method 
		 * "dir" is the name of a user's directory with text files
		 */
		File f = new File(dir);
		String[] files = f.list();
		for (String file : files)
			parse(dir + "/" + file);
	}

	/*
	 * Getter method for table variable
	 */
	public Object[][] getTable() {
		return table;
	}

}
