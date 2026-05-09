# Documentation for Automation Tests

## Install Java JDK
### Setup
Ensure Java 8 (1.8.0_202) is installed and configured.
1. Download JDK 8 from Oracle or OpenJDK
2. Install and set JAVA_HOME environment variable
3. Verify installation with java -version

## Set Up Eclipse IDE
### Setup
Use Eclipse as your development environment.
1. Download and install Eclipse IDE for Java Developers
2. Launch Eclipse and create a new Java Project

## Add Selenium and WebDriver JARs
### Required
Include Selenium and ChromeDriver libraries in your project.
1. Download Selenium standalone JAR
2. Download ChromeDriver (version 131.0.6778.139)
3. Add both JARs to project via Build Path → Add External JARs

## Configure ChromeDriver Path
### Point your code to the correct ChromeDriver executable.
1. Place ChromeDriver in a known folder
2. In code: options.setBinary("D:\\software\\chrome-win64\\chrome.exe");
System.setProperty("webdriver.chrome.driver", "D:\\\\software\\\\chromedriver-win64\\\\chromedriver.exe");
Download JARs from GitHub: https://github.com/priyankadolas/assignment 
3. Clone or download your GitHub repository containing the JAR files.
4. Extract them into a local folder.

## Run Tests in Eclipse
### Execution
Execute your automation scripts directly from Eclipse.
1. Right-click the test class → Run As → Java Application
2. Observe browser actions and console output

## Review Results
Final Step: 
Check execution logs and validate outcomes.
1. Console output shows pass/fail status
2. Debug failed tests by reviewing stack traces
3. Adjust locators or waits if needed

## Running Tests via Runnable JAR
If you’ve exported runnable JARs (or downloaded them from GitHub):
1.	Open a terminal/command prompt.
2.	Navigate to the folder containing your runnable JAR file. https://github.com/priyankadolas/assignment/blob/9711360fa060a15e8bf2be9b37435d4fb30846b3/Runnable%20jar%20file/Assignment.jar
3.	Run using: java -jar Assignment.jar
4.	The test will execute outside Eclipse, launching ChromeDriver and performing the scripted actions.
