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


### Build

During the build the pom is scanned and all the configs are set and the libraries are automaticly downloaded.

In this process two folders are created: target and bin. These folders should not be added to the code repository so you should add these folders on the gitignore file.

```gitignore
bin
target
```

## 
