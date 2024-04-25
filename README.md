<h1>NGram Frequency Builder</h1>
<p>This project implements a Java application for building n-gram frequency tables from text files.</p>

<h2>Project Overview</h2>

<p>The project directory structure is organized as follows:</p>

<pre>
ngram-frequency-builder/
├── src/
│   └── ie/
│       └── atu/
│           └── sw/
│               ├── Menu.java
│               ├── NGramOutputter.java
│               ├── Parser.java
│               └── Runner.java
└── README.md
    </pre>

<ul>
        <li><code>Menu.java</code>: Manages user interaction and options.</li>
        <li><code>NGramOutputter.java</code>: Handles output of n-gram frequencies to files.</li>
        <li><code>Parser.java</code>: Parses text files to generate n-grams and their frequencies.</li>
        <li><code>Runner.java</code>: Main class to execute the application.</li>
    </ul>

<h2>Instructions for the User</h2>

<p>After running the application, follow these steps:</p>

<ol>
        <li>Enter <code>1</code> to specify the directory you'd like to analyze.</li>
        <li>Enter the name of the directory with text files (e.g., <code>C:\Users\marij\Desktop\textfiles</code>).</li>
        <li>Enter <code>2</code> to specify the size of the n-gram (choose a number between <code>1</code> and <code>5</code>).</li>
        <li>Enter the number between <code>1</code> and <code>5</code> (the n-gram size).</li>
        <li>Enter <code>3</code> to specify the name of the output file (e.g., <code>ngrams.txt</code> or <code>output.csv</code>).</li>
        <li>Enter the name of the output file.</li>
        <li>Enter <code>4</code> to build the n-grams.</li>
        <li>Enter <code>5</code> to save the output file.</li>
    </ol>

<h2>Usage</h2>

<h3>Running the Application</h3>

<p>To run the application:</p>

<ol>
        <li>Compile the Java files:</li>
    </ol>

<pre><code>javac ie/atu/sw/Runner.java</code></pre>

<ol start="2">
        <li>Execute the application:</li>
    </ol>

<pre><code>java ie.atu.sw.Runner</code></pre>

<h2>Dependencies</h2>

<ul>
<li>Java Development Kit (JDK) 8 or higher</li>
    </ul>

<h2>Project Details</h2>

<h3>Menu Class (<code>Menu.java</code>)</h3>

<p>The <code>Menu</code> class manages user interaction and options for the NGram Frequency Builder. It provides
        methods to:</p>

<ul>
        <li>Show options to the user.</li>
        <li>Retrieve and store user inputs.</li>
        <li>Execute methods of the application based on user choices.</li>
    </ul>

<h3>NGramOutputter Class (<code>NGramOutputter.java</code>)</h3>

<p>The <code>NGramOutputter</code> class contains methods to write n-gram frequencies into an output file. It
        includes:</p>

<ul>
<li><code>save(Object[][] table, String file)</code>: Saves n-gram frequencies to the specified output
            file.</li>
    </ul>

<h3>Parser Class (<code>Parser.java</code>)</h3>

<p>The <code>Parser</code> class handles text parsing and n-gram frequency counting. It includes methods to:</p>

<ul>
<li><code>parse(String file)</code>: Parse text from a file and count n-gram frequencies.</li>
<li><code>parseDir(String dir)</code>: Parse all files in a specified directory.</li>
    </ul>

<h2>Contributing</h2>

<p>Contributions to this project are welcome! To contribute:</p>

<ol>
        <li>Fork the repository.</li>
        <li>Create your feature branch (<code>git checkout -b feature/new-feature</code>).</li>
        <li>Commit your changes (<code>git commit -am 'Add new feature'</code>).</li>
        <li>Push to the branch (<code>git push origin feature/new-feature</code>).</li>
        <li>Create a new Pull Request.</li>
    </ol>



</body>

</html>
