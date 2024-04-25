<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NGram Frequency Builder</title>
</head>
<body>
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

    <h2>Usage</h2>

    <h3>Running the Application</h3>

    <p>To run the application, compile and execute <code>Runner.java</code>:</p>

    <pre><code>javac ie/atu/sw/Runner.java
java ie.atu.sw.Runner</code></pre>

    <p><strong>Generating N-Grams</strong></p>

    <p>Follow the menu prompts to specify the text file directory, n-gram size, and output file.</p>

    <h2>Dependencies</h2>

    <ul>
        <li>Java Development Kit (JDK) 8 or higher</li>
    </ul>

    <h2>Contributing</h2>

    <p>Contributions to this project are welcome! To contribute:</p>

    <ol>
        <li>Fork the repository</li>
        <li>Create your feature branch (<code>git checkout -b feature/new-feature</code>)</li>
        <li>Commit your changes (<code>git commit -am 'Add new feature'</code>)</li>
        <li>Push to the branch (<code>git push origin feature/new-feature</code>)</li>
        <li>Create a new Pull Request</li>
    </ol>

    <h2>License</h2>

    <p>This project is licensed under the MIT License. See <code>LICENSE</code> for details.</p>

</body>
</html>

