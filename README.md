<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NGram Frequency Builder - README</title>
</head>
<body>
    <h1>NGram Frequency Builder</h1>

    <p>
        The NGram Frequency Builder is a Java application that analyzes text files to compute the frequency of n-grams (sequences of contiguous items, typically words or characters). This README provides comprehensive instructions on how to use the application effectively, including detailed steps and examples.
    </p>

    <h2>Features</h2>
    <ul>
        <li><strong>Text File Directory Specification:</strong> Specify the directory containing text files for analysis.</li>
        <li><strong>n-Gram Size Selection:</strong> Choose the size of n-grams (from 1 to 5) to analyze.</li>
        <li><strong>Output File Specification:</strong> Specify the name of the output file to save the computed n-gram frequencies.</li>
        <li><strong>Build n-Grams:</strong> Process the specified text files to compute n-gram frequencies.</li>
        <li><strong>Save Results:</strong> Save the computed n-gram frequencies to the specified output file.</li>
    </ul>

    <h2>Usage Instructions</h2>

    <h3>Compilation</h3>
    <p>Before running the NGram Frequency Builder, compile all Java source files (<code>Menu.java</code>, <code>NGramOutputter.java</code>, <code>Parser.java</code>, <code>Runner.java</code>) using the following command:</p>
    <pre><code>javac Menu.java NGramOutputter.java Parser.java Runner.java</code></pre>

    <h3>Execution</h3>
    <p>To start the NGram Frequency Builder application, execute the <code>Runner</code> class:</p>
    <pre><code>java Runner</code></pre>

    <h3>Steps to Use the Application:</h3>
    <ol>
        <li><strong>Specify the Text File Directory:</strong>
            <ul>
                <li>Enter <code>1</code> in the console to specify the directory containing text files for analysis.</li>
                <li>Example: <code>C:\Users\marij\Desktop\textfiles</code></li>
            </ul>
        </li>
        <li><strong>Specify the Size of n-Grams:</strong>
            <ul>
                <li>Enter <code>2</code> in the console to choose the size of n-grams (from <code>1</code> to <code>5</code>) for frequency analysis.</li>
                <li>Example: <code>2</code> (for bigrams)</li>
            </ul>
        </li>
        <li><strong>Specify the Output File Name:</strong>
            <ul>
                <li>Enter <code>3</code> in the console to specify the name of the output file where n-gram frequencies will be saved.</li>
                <li>Example: <code>ngrams.txt</code> or <code>output.csv</code></li>
            </ul>
        </li>
        <li><strong>Build the n-Grams:</strong>
            <ul>
                <li>Enter <code>4</code> in the console to initiate the computation of n-gram frequencies based on the specified parameters.</li>
            </ul>
        </li>
        <li><strong>Save the Output File and Exit:</strong>
            <ul>
                <li>Once the computation is complete, enter <code>5</code> in the console to save the computed n-gram frequencies to the specified output file and exit the application.</li>
            </ul>
        </li>
    </ol>

    <h3>Additional Information:</h3>
    <ul>
        <li>Ensure that the specified directory contains readable text files (e.g., <code>.txt</code> files) for accurate n-gram analysis.</li>
        <li>The size of n-grams (<code>n</code>) determines the length of contiguous sequences of items (characters or words) to analyze.</li>
        <li>The output file will contain each n-gram along with its frequency of occurrence, separated by commas or other specified delimiters.</li>
    </ul>

    <h2>Example Usage</h2>
    <p>Let's walk through an example scenario:</p>
    <ol>
        <li><strong>Directory:</strong> <code>C:\Users\marij\Desktop\textfiles</code></li>
        <li><strong>n-Gram Size:</strong> <code>2</code> (for bigrams)</li>
        <li><strong>Output File:</strong> <code>ngrams.txt</code></li>
    </ol>
    <p>Follow these steps:</p>
    <ol>
        <li>Enter <code>1</code> and specify <code>C:\Users\marij\Desktop\textfiles</code> as the directory.</li>
        <li>Enter <code>2</code> and choose <code>2</code> as the n-gram size.</li>
        <li>Enter <code>3</code> and specify <code>ngrams.txt</code> as the output file name.</li>
        <li>Enter <code>4</code> to build the n-grams based on the specified parameters.</li>
        <li>After computation, enter <code>5</code> to save the results to <code>ngrams.txt</code> and exit the application.</li>
    </ol>

    <hr>

    <p>
        These detailed usage instructions provide a step-by-step guide on using the NGram Frequency Builder application effectively. Modify the provided code or README as needed based on specific requirements or use cases.
    </p>

    <p>
        If you encounter any issues or have questions about the application, please refer to the provided code or contact the developer for assistance.
    </p>
</body>
</html>
