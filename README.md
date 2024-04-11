# Cucumber Project Github Automation

## Scenario
- As a guest (not logged in), when searching GitHub for the term "create-react-app" from the landing page search input, you will see: A count of matching results.
- You will find and verify "facebook/create-react-app" project as the first result.
- As a guest, when clicking the "About" button in the landing page footer, you will be taken to the GitHub "About" page. verify, you are on about page.

## Technology and Tools Used
- Selenium
- Cucumber Java
- Cucumber Junit
- Java
- Gradle
- Intellij idea

## Website
- https://github.com/

## Prerequisite
- JDK 11 or higher
- Java IDE (Intellij idea)
- Configured environment variable for Java, Gradle and Allure Report
- Web browser installed (Firefox, Chrome, Edge)

## How to run this project
- Clone the repository  
`https://github.com/touhid-96/Cucumber-Project-Github-Automation.git`
- Execute the following command on the project directory  
`gradle clean build`

## How to run the tests
- Ensure the website is running.
- Execute the following command on the project directory  
`gradle test`

## Report Locations
Open with any web browser
- Gradle report : `./build/reports/tests/test/index.html`  
- Cucumber report : `./target/reports/cucumber-reports.html`

## Gradle Report
![gradle report](https://github.com/touhid-96/Cucumber-Project-Github-Automation/assets/29010371/f883c810-48b8-460c-b0cf-6313a941853b)

## Cucumber Report
![cucumber report](https://github.com/touhid-96/Cucumber-Project-Github-Automation/assets/29010371/b1c497e2-b874-46df-8c9c-866a560ac1dd)

