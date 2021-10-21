# Selenium Basic Maven Configuration

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

## Why use Maven

Although having a steep learning curve and some performance issues compared to recent depency managers, it is a very solid choice since most of Java projects still use maven and only release a maven based configuration.

## pom.xml

In a maven project all dependencies and configurations are saved on a single XML file in the root of the project.

### Dependencies

The community around the Apache Maven project mantains a [public repository called Maven Central](https://mvnrepository.com/repos/central) where you can search, download or reference Java libraries.

For this example we use the following libraries:

- [Junit](https://junit.org/junit5/) - Finds and execute your tests.

- [Webdriver Manager](https://github.com/bonigarcia/webdrivermanager) - Automates the configuration of webdriver.

- [Selenium Webdriver](https://www.selenium.dev/maven/) - Controls your browser to simulate a user.

### Project folders

All maven projects use a [basic folder structure to organize its files](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)

In this sample project I have added only the test related folders so you can focus only on the testing code.


The first part of the folder structure is the maven way of foldering
```
src/
  test/
    java/
```

The second part is the name of the package, usualy an inverted URL (edumco.com)

```
com/
  edumco/
```

The third part is the most important, it contains the structure you gonna use on your project

```
core/
pages/
tests/
```

On `core`goes your configuration and browser abstraction classes, on `pages` you create a class for each web-page on your project following [the Page Object Pattern](https://martinfowler.com/bliki/PageObject.html) and finally on the `tests` folder gos all your test cases classes.
