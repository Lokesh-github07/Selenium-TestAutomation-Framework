# Selenium Test Automation Framework  

[![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)](https://www.java.com/)
[![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-Framework-FF6C37)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![POM](https://img.shields.io/badge/Design%20Pattern-Page%20Object%20Model-blue)](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)
[![WebDriverManager](https://img.shields.io/badge/WebDriverManager-Driver%20Management-4B8BBE)](https://bonigarcia.dev/webdrivermanager/)
![GitHub commit activity](https://img.shields.io/github/commit-activity/t/Lokesh-github07/TestAutomationFramework?style=flat-square)

A Java-based Selenium automation framework for testing web applications using a reusable and maintainable structure.

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverManager

## ⚙️ How It Works

The framework uses **Page Object Model** to separate test cases from page elements and actions.

```text
Test Case → Page Object → Selenium WebDriver → Web Application → Assertion
```

TestNG manages execution and assertions, while Maven manages dependencies and test execution.

## ✨ Features

- Web UI automation
- Page Object Model
- Reusable page classes
- TestNG test execution
- Assertions and validations
- WebDriver management
- Maven dependency management
- Scalable framework structure

## 📂 Structure

```text
src/test/java/com/automation/
├── base/
├── driver/
├── pages/
└── tests/

pom.xml
testng.xml
```

## ▶️ Run

```bash
git clone https://github.com/YOUR_USERNAME/SeleniumTestAutomationFramework.git
cd SeleniumTestAutomationFramework
mvn clean test
```

## 👨‍💻 Author

**Lokesh Pande**

[GitHub](https://github.com/Lokesh-github07)
