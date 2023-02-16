
# Example Java with Page Object Model Selenium Web Driver Testing

How to do Web Automation Tests with Page Object Model, Java 1.8, Selenium 3.141.59

<table class="image-table">
<tbody>
<tr>
<td>
<img src="https://github.com/hakantektas/commencisTestProject/blob/main/selenium.svg" width="125" height="125">
</td>
<td>
<img src="https://github.com/hakantektas/commencisTestProject/blob/main/download.png" width="125" height="125">
</td>
<td>
<img src="https://github.com/hakantektas/commencisTestProject/blob/main/download%20(1).png" width="125" height="125">
</td>
</tr>
</tbody>
</table>



[![macOS](https://svgshare.com/i/ZjP.svg)](https://svgshare.com/i/ZjP.svg)
[![Maven](https://badgen.net/badge/icon/maven?icon=maven&label)](https://https://maven.apache.org/)
## **Supports**

* Selenium v3
* Page Object Model (POM) usage with Java
* Auto generated HTML Allure test report after test

This project describes how to automate web automation tests with Selenium framework in Java language. It includes an example of how to run your browser tests parametrically and how to run tests in different browsers. It is written in accordance with the Page object model design. It includes examples of how to run multiple test scenarios in different browsers at the same time with Test Suite files.
## Run it on your computer

Clone the project

```bash
  git clone https://github.com/hakantektas/qaYoungTalent2023Mobven.git
```

Go to the project directory.

```bash
  cd [yourPath]/qaYoungTalent2023Mobven
```

Allure report install

```bash

For Mas OS, automated installation is available via Homebrew

brew install allure
```

Run your tests via terminal.

```bash
  mvn -Dtest=searchCase test

```

```bash

Run the following command in terminal to generate an Allure report.

  allure serve 
## Test Runs

Run your tests via terminal. 

```bash
  mvn -Dtest=searchCase test

  
## Kullanım/Örnekler


```java
package PageClassPOM;

import ...
    public homePage(WebDriver driver) {
        this.driver=driver;
    }
    public void home(){
            driver.get(url);
            Allure.addAttachment("Home Page...", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
            waitForLoad(driver);
        }
```

```java
// The primary use of WebDriverManager is the automation of driver management. For using this feature, 
you need to select a given manager in the WebDriverManager API (e.g., chromedriver() for Chrome) and invoke the method setup().
@BeforeTest
    public void setup(){
       ChromeOptions chromeOptions = new ChromeOptions();
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver(chromeOptions);
    }
https://github.com/bonigarcia/webdrivermanager









## Related projects

Here are some related projects


[Awesome README](https://github.com/bonigarcia/webdrivermanager)


Allure report 

For more information on the Allure report 


[Awesome README](https://docs.qameta.io/allure/)
  

## Optimization

POM is preferred to improve code maintainability and readability by setting common methods and elements to a variable.
  
## Lessons Learned

In case of browser incompatibility with the driver that you have used locally, use an updated browser and update your driver.
If you do not want to encounter such problems, you can use the WebDriverManager made by bonigarcia. -> https://github.com/bonigarcia/webdrivermanager




  
