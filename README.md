<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NGram Frequency Builder</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f5f5f5;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        h1, h2, h3 {
            color: #333;
        }
        code {
            background-color: #f8f8f8;
            padding: 2px 4px;
            border-radius: 4px;
        }
        pre {
            background-color: #f8f8f8;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            overflow-x: auto;
        }
    </style>
</head>
<body>

<h1>NGram Frequency Builder</h1>

<p>
    The NGram Frequency Builder is a Java application that analyzes text files to compute the frequency of n-grams (sequences of contiguous items, typically words or characters).
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
<p>Before running the NGram Frequency Builder, compile all Java source files:</p>
<pre><code>javac Menu.java NGramOutputter.java Parser.java Runner.java</code></pre>

<h3>Execution</h3>
<p>To start the NGram Frequency Builder application, execute the <code>Runner</code> class:</p>
<pre><code>java Runner</code></pre>

<h3>Steps to Use the Application:</h3>
    <ol>
        <li><strong>Specify the Text File Directory:</strong></li>
        <p>Enter <code>1</code> in the console to specify the directory containing text files for analysis.</p>
        <p>Example: <code>C:\Users\marij\Desktop\textfiles</code></p>
        <br>

        <li><strong>Specify the Size of n-Grams:</strong></li>
        <p>Enter <code>2</code> in the console to choose the size of n-grams (from <code>1</code> to <code>5</code>) for frequency analysis.</p>
        <p>Example: <code>2</code> (for bigrams)</p>
        <br>

        <li><strong>Specify the Output File Name:</strong></li>
        <p>Enter <code>3</code> in the console to specify the name of the output file where n-gram frequencies will be saved.</p>
        <p>Example: <code>ngrams.txt</code> or <code>output.csv</code></p>
        <br>

        <li><strong>Build the n-Grams:</strong></li>
        <p>Enter <code>4</code> in the console to initiate the computation of n-gram frequencies based on the specified parameters.</p>
        <br>

        <li><strong>Save the Output File and Exit:</strong></li>
        <p>After the computation is complete, enter <code>5</code> in the console to save the computed n-gram frequencies to the specified output file and exit the application.</p>
    </ol>
</body>
</html>
