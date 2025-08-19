# ECommerceProject

This is an automation framework for testing e-commerce web applications using Selenium, Cucumber (BDD), and TestNG.

## Features

- Selenium WebDriver for browser automation (Chrome, Edge)
- Cucumber for BDD-style test scenarios
- TestNG for test execution and reporting
- ExtentReports for HTML reporting
- Utility classes for common actions and Excel file handling
- Maven for build and dependency management

## Project Structure

- `src/main/java` - Main Java source code
- `src/test/java` - Test code, step definitions, and utilities
- `src/test/resources/features` - Cucumber feature files
- `Config/Config.properties` - Configuration properties (e.g., browser selection)
- `Framework/` - WebDriver executables
- `testSuite/testng.xml` - TestNG suite configuration
- `extentReport.html` - Generated test report

## How to Run

1. Install dependencies:
   ```
   mvn clean install
   ```
2. Execute tests:
   ```
   mvn test
   ```
3. View the test report in `extentReport.html`.

## Notes

- Update `Config/Config.properties` to set the desired browser.
- Feature files are located in `src/test/resources/features`.
- Test results and reports are generated in the project root and `target/` directory.

---