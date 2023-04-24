# Automated test set for Luxoft official website
<img width=50% align="middle" title="LUXOFT" src="images/luxoft-new-white.svg">


## :page_with_curl:	Contents
+ [Test cases run](#test-cases-run)
+ [Instruments used](#instruments-used)
+ [How to run these tests](#how-to-run-these-tests)
    + [Using console](#using-the-console)
    + [Using Jenkins](#using-jenkins)
+ [Final report in Allure Reports](#final-report-in-allure-reports)
+ [Allure TestOps integration](#allure-testops-integration)
+ [Test results](#test-results)
<!-- + [Интеграция с Jira](#Jira) -->

## Test cases run
### Automated test cases
- Main page
  - [x] The main page logo visibility
  - [x] The correct amount of services listed in the OUR SERVICES section
  - [x] The correct amount of social media links in the footer
- Search page
  - [x] The search results start from the first page
  - [x] The search header text correctness
  - [x] The correct amount of items on the search first page
### Manual test cases
- Main page
  - [x] The header navigation has clickable links
  - [x] The header navigation hovering initiates a dropdown menu
- Search page
  - [x] No items shown for a search with random symbols
  - [x] The search header says there are no results for a search with random symbols


# Instruments used
<p  align="center">
  <code><img width="5%" title="IntelliJ IDEA" src="images/IDEA-logo.svg"></code>
  <code><img width="5%" title="Java" src="images/java-logo.svg"></code>
  <code><img width="5%" title="Selenide" src="images/selenide-logo.svg"></code>
  <code><img width="5%" title="Selenoid" src="images/selenoid-logo.svg"></code>
  <code><img width="5%" title="Gradle" src="images/gradle-logo.svg "></code>
  <code><img width="5%" title="JUnit5" src="images/junit5-logo.svg"></code>
  <code><img width="5%" title="Allure Report" src="images/allure-Report-logo.svg"></code>
  <code><img width="5%" title="Allure TestOps" src="images/allure-ee-logo.svg"></code>
  <code><img width="5%" title="Github" src="images/git-logo.svg"></code>
  <code><img width="5%" title="Jenkins" src="images/jenkins-logo.svg"></code>
<!--   <code><img width="5%" title="Jira" src="images/jira-logo.svg"></code> -->
  <code><img width="5%" title="Telegram" src="images/Telegram.svg"></code>

</p>

+ **Java** is the primary programming language for this project.
+ **Selenide** framework was used for writing the automated tests.
+ **JUnit 5** is used as a unit testing framework.
+ **Gradle** is used to build the project.
+ **Jenkins** is used to run the tests.
+ **Selenoid** is used to launch browsers in **Docker** containers.
+ **Allure Report** is used to visualize test results.
+ **Telegram API** is used for receiving the final report via Telegram Bot.



# <a name="HowToRun">How to run these tests</a>
Please note that the following methods will run the tests with the following parameters:
+ Browser: **Google Chrome**
+ Browser version: **100.0**
+ Browser size: **1920x1080**

### <a name="Console">Using the console</a>
To run the automated tests:
```bash
gradle clean test 
```
To get the report:
```bash
allure serve build/allure-results
```

### <a name="Jenkins">Using [Jenkins](https://jenkins.autotests.cloud/job/c18-Ailinyan-MiniProject15/)</a>

To run this test through Jenkins, please use this [job](https://jenkins.autotests.cloud/job/c18-Ailinyan-MiniProject15/), specially created for this project.
The environment is set up for Russian language, to run it please use the button with an :arrow_forward:.
You can see the results via Allure Reports, or use the link to Allure TestOps.

<p  align="center">
<img src="images/jenkins.png" alt="How to run the tests with Jenkins" width="550">
</p>


# <a name="AllureReports">Final report in [Allure Reports](https://jenkins.autotests.cloud/job/c18-Ailinyan-MiniProject15/)</a>

#### Общая информация
The main page of the Allure report contains the following information blocks:

>- <code><strong>*ALLURE REPORT*</strong></code> - displays the following info for the given run:
>>- Date and time; 
>>- The total number of cases in the given run; 
>>- A pie chart indicating the percentage and number of test results: successful, failed, or broken.
>- <code><strong>*TREND*</strong></code> - a line chart that displays the trend of passing tests from build to build
>- <code><strong>*SUITES*</strong></code> - displays the distribution of test results across test suites
>- <code><strong>*CATEGORIES*</strong></code> - displays the distribution of failed tests sorted by defect types
<p align="center">
  <img src="images/allure distributed.png" alt="Allure Report" width="650">
</p>

### List of tests with a description of steps and visualization of results
This page presents the standard distribution of the tests run by user stories and test suites.

<p align="center">
  <img src="images/Allure Report steps.png" alt="Allure Report" width="650">
</p>



# <a name="AllureTestOps">[Allure TestOps](https://allure.autotests.cloud/project/2195/) integration</a>

### The main dashboard
<p align="center">
  <img src="images/allureTestOPS dashboards.png" alt="dashboards" width="650">
</p>

### Project's test plans
<p align="center">
  <img src="images/allure_testplans.png" alt="Test plans" width="650">
</p>

#### Manual test cases
<p align="center">
  <img src="images/testops_testplan1.png" alt="Manual test cases" width="750">
</p>

#### Automated test cases
<p align="center">
  <img src="images/testops_testplan2.PNG" alt="Manual test cases" width="750">
</p>

### All test cases
<p align="center">
  <img src="images/Test cases.png" alt="test cases" width="750">
</p>

### Launches
<p align="center">
  <img src="images/allureTestOPS launches.png" alt="launches" width="650">
</p>

### Launch details
<p align="center">
  <img src="images/allureTestOPS launch.png" alt="launch" width="750">
</p>

### Defects
<p align="center">
  <img src="images/testOps_defect.png" alt="defects" width="750">
</p>


# [Jira](https://jira.autotests.cloud/) integration

### Ticket linked with Allure TestOps defect
<p align="center">
  <img src="images/jira-issue.png" alt="The defect in Jira" width="750">
</p>

###  Main page content layout Jira task
<p align="center">
  <img src="images/jira-task-main.png" alt="The main page layout task" width="750">
</p>

###  Search from the main page Jira task
<p align="center">
  <img src="images/jira-task-search.png" alt="Search from the main page task" width="750">
</p>



# <a name="Results">Test results</a>

### Selenoid sample run demo
There's a video attachment for each test available.
<p align="center">
  <img title="Selenoid Video" src="images/sample-video-web.gif">
</p>

### Telegram notification example
<p align="center">
<img src="images/tlgrm.png" alt="Telegram" width="550">
</p>