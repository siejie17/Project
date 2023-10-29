# README

### Steps to Access phpMyAdmin and run the project

Follow these steps to access phpMyAdmin using XAMPP and run the project:

1. Start XAMPP: Launch the XAMPP control panel application.

2. Start Apache and MySQL: Click on the "Start" button next to both Apache and MySQL modules to start the Apache web server and MySQL database server.

3. Open a web browser: Launch your preferred web browser.

4. Access phpMyAdmin: In the address bar of your web browser, enter the following URL: http://localhost/phpmyadmin

5. Log in to phpMyAdmin: You should now see the phpMyAdmin login page. Enter your MySQL username and password to log in. By default, the username is "root" and there is no password.

6. Create a database: Click on the "Databases" tab in phpMyAdmin and create a new database named "budgetPlannerApp". This database will be used for the project.

7. Extract the files: Extract all the files from the downloadd zipped folder.

8. Import the database file: Click on the "Import" tab in phpMyAdmin and choose the "Browse" button to locate the `budgetPlannerApp.sql` file provided in the extracted folder. Select the file and click on the "Go" button to import the database structure and data into the "java4lyfe" database.

9. Start Netbeans: Open the Netbeans application.

10. Open the project: In Netbeans, go to the "File" menu bar and select "Open Project". Select the `UNI Budget Planner Application` folder and click on the "Open" button.

11. Run the project: Once the project is opened, click on the "Run" button in Netbeans to start the project. Ensure that XAMPP with Apache and MySQL is still running.

### Additional Configuration (Optional)

Verify that you have JDK 19 installed on your machine. If you have a different version of JDK installed, please follow the instructions below to update the project's Java version.

1. Open the pom.xml file located in the root directory of your project.

2. Locate the <maven-compiler-plugin> configuration section.

3. Inside the <maven-compiler-plugin> section, find the <target> and <source> elements.

4. Check the current values of <target> and <source>. They should be set to a valid Java version, such as 1.8, 11, 14, or 17.

5. If the Java version is not set to 19, update the values of <target> and <source> to 19.

6. Save the pom.xml file and run the project.
