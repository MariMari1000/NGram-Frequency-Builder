<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NGram Frequency Builder</title>
</head>
<body>
    <h1>NGram Frequency Builder</h1>
    <p>This Java application allows you to analyze text files to generate and output n-gram frequencies.</p>

    <h2>Usage</h2>
    <p>To use this application, follow these steps:</p>

    <ol>
        <li><strong>Specify Text File Directory:</strong> Enter the full path for the directory containing your text files.</li>
        <li><strong>Specify n-Gram Size:</strong> Choose the size of n-grams (between 1 and 5).</li>
        <li><strong>Specify Output File:</strong> Enter the name for the output file where n-gram frequencies will be saved.</li>
        <li><strong>Build n-Grams:</strong> Analyze the text files to generate n-gram frequencies.</li>
        <li><strong>Quit:</strong> Save the generated n-gram frequencies and exit the application.</li>
    </ol>

    <h2>Getting Started</h2>
    <p>Ensure you have Java installed on your system.</p>

    <h3>Running the Application</h3>
    <p>Compile and run <code>Runner.java</code> to launch the application:</p>

    <pre><code>
    javac Runner.java
    java Runner
    </code></pre>

    <h2>Structure</h2>
    <p>The project structure is as follows:</p>

    <pre>
    - Menu.java           : Contains the menu and user interface logic.
    - NGramOutputter.java : Manages the output of n-gram frequencies to a file.
    - Parser.java         : Handles the parsing and counting of n-grams from text files.
    - Runner.java         : Main class to start the application.
    </pre>

    <h2>Dependencies</h2>
    <p>No external dependencies are required to run this application.</p>

    <h2>Contributing</h2>
    <p>Contributions are welcome! Fork the repository, make your changes, and submit a pull request.</p>

    <h2>License</h2>
    <p>This project is licensed under the MIT License. See <code>LICENSE</code> for more details.</p>

    <hr>
    <p style="text-align: center;">This README is created by ChatGPT.</p>
</body>
</html>
