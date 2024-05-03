Selenium WebDriver Framework for Appfire Website

Overview

This repository contains an automation testing framework built with Selenium WebDriver, Cucumber, and Java. The framework is designed to automate tests for the SauceDemo website. It provides a structured approach to writing and executing automated test scenarios using the behavior-driven development (BDD) methodology.

Features BDD Test Scenarios: Write test scenarios in natural language using Gherkin syntax. Page Object Model (POM): Implement a modular and maintainable testing framework using the POM design pattern. Cross-Browser Testing: Execute tests across different web browsers by configuring WebDriver instances. Parallel Execution: Run tests concurrently to reduce execution time. Reporting: Generate detailed test reports using Cucumber's built-in reporting features.

Prerequisites

Ensure you have the following software installed on your machine:

Java Development Kit (JDK) Apache Maven WebDriver-compatible browser drivers (e.g., ChromeDriver, GeckoDriver)

Getting Started Clone this repository to your local machine:

  git clone https://github.com/knurs/TestAutomationFramework.git
Navigate to the project directory:

cd selenium-cucumber-java-webdriver
Install dependencies using Maven:

mvn clean install
Running Tests To run all tests, execute:

mvn test
To run tests with specific tags, use:

mvn test -Dcucumber.options="--tags @tagname"
Configuration

Update src/test/resources/config.properties with appropriate settings. Add WebDriver executable paths to the system PATH or specify the paths in the configuration file. Reporting After test execution, HTML reports can be found in the target/cucumber-reports directory.

Contributing Contributions are welcome! Please fork this repository, make your changes, and submit a pull request.

License This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments Inspired by Cucumber and Selenium open-source projects.  //by KNSev
