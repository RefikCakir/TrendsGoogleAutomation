  # BDD Trends Google Test Automation Framework
  
  The Framework was mainly built by using Maven, java, Selenium, Cucumber, JUnit and 
   implemented Behavior Driven Development and Page Object Model Structure.
    
     
 ##Tools
    
  >Java 1.8
  >
  >Selenium 3.141.59 
  >
  >Maven 3.6.0 
  >
  >Cucumber 6.8.1 
  >
  >Junit 4.12
  
  ##Framework Overview
  
  - Used maven as build automation tool which has Pom.xml file that allows centralizes
  all  dependency and configure the necessary plugin and profiles.
  - Used Cucumber to write test cases in Feature file. 
  - Used Gherkin language keywords such as **Given, When, And, Then** in order to describe test scenario.
  - Create **step definition** class to execute feature file.
  - Create  **runner** class to run test and helps to generate 
  codes for step definition from feature files. Also, **runner**
  class contains *feature file* and *step definitions* locations.
  - Created **page** classes to store element of each pages.
  - Create **FailedRunner** class for failure test cases
  - Create **utils** classes such as *Browser, ConfigurationReader and Driver* and store 
  reusable code and method that could possibly run.
  - Create **Hook** class and store method that will run @Before and @After all tests.
  - Create **Configuration Properties** file to store important information.
  - Implement **Page Object Model** structure to keep codes more organized and clean.
  
  ##Features
  
  - Generate report by using extend reports
  - Support for all major web browsers such as **Chrome** and **Firefox**
  - Support for capturing screenshots
  - Include methods that help perform common web actions.
  - Support running test on multiple browsers.
  
  ##Maintainer
  
  *Refik Cakir*

