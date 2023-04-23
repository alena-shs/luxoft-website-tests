# Automated test set for Luxoft official website
<img width=50% align="middle" title="LUXOFT" src="images/luxoft-new-white.svg">


## Contents
+ [Introduction](#Description)
+ [Instruments](#Technology)
+ [How to run the test with Jenkins](#HowToRun)
    + [Using console](#Console)
    + [Using Jenkins](#Jenkins)
+ [Final report in Allure Reports](#AllureReports)
+ [Allure TestOps integration](#AllureTestOps)
+ [Test reslts](#Results)
<!-- + [Интеграция с Jira](#Jira) -->

## <a name="Description">Test cases run</a>
### Automated test cases
- [x] 
### Manual test cases
- [x] 


# <a name="Technology">Instruments used</a>
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
The environment is set up for Russian language, to run it please use the button on the screenshot below.

<p  align="center">
<img src="images/Run test.png" alt="How to run the tests with Jenkins" width="850">
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
  <img src="images/Allure Report.png" alt="Allure Report" width="650">
</p>

### List of tests with a description of steps and visualization of results
This page presents the standard distribution of the tests run by user stories, test suites, and Java classes from the code.

<p align="center">
  <img src="images/Allure Report steps.png" alt="Allure Report" width="650">
</p>



# <a name="AllureTestOps">[Allure TestOps](https://allure.autotests.cloud/project/2195/) integration</a>

### The main dashboard
<p align="center">
  <img src="images/allureTestOPS dashboards.png" alt="dashboards" width="650">
</p>

### The dashboard for different test types
<p align="center">
  <img src="images/allureTestOPS dashboards test types.png" alt="dashboards test types" width="650">
</p>

### Launches
<p align="center">
  <img src="images/allureTestOPS launches.png" alt="launches" width="650">
</p>

### Launch details
<p align="center">
  <img src="images/allureTestOPS launch.png" alt="launch" width="750">
</p>

### Test cases
<p align="center">
  <img src="images/Test cases.png" alt="test cases" width="750">
</p>

### Defects
<p align="center">
  <img src="images/testOps_defect.png" alt="defects" width="750">
</p>



<!-- # <a name="Jira">[Jira](https://jira.autotests.cloud/) integration</a> -->



# <a name="Results">Test results</a>

### Selenoid sample run demo
<p align="center">
    <img src="images/videoUI.jpg" alt="defects" width="900">
<!--     <video src='images/videoMob.mp4' width=450/> -->
</p>

### Telegram notification example
<p align="center">
<img src="images/tlgrm.png" alt="Telegram" width="550">
</p>