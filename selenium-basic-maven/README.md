# Selenium Basic Maven Configuration

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

## Why use Maven

Although having a steep learning curve and some performance issues compared to recent depency managers, it is a very solid choice since most of Java projects still use maven and only release a maven based configuration.

## pom.xml

In a maven project all dependencies and configurations are saved on a single XML file in the root of the project.

### Dependencies

The community around the Apache Maven project mantains a [public repository called Maven Central] where you can search, download or reference Java libraries.

For this example we use the following libraries:

#### [Selenium Webdriver](https://www.selenium.dev/maven/)

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
    <scope>test</scope>
</dependency>
```

#### [Junit](https://junit.org/junit4/)

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13</version>
    <scope>test</scope>
</dependency>
```

#### [Webdriver Manager](https://github.com/bonigarcia/webdrivermanager)

```xml
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>3.8.1</version>
    <scope>test</scope>
</dependency>

```

#### [Maven Compiler Plugin](https://maven.apache.org/plugins/maven-compiler-plugin/)

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```

### Build

During the build the pom is scanned and all the configs are set and the libraries are automaticly downloaded.

In this process two folders are created: target and bin. These folders should not be added to the code repository so you should add these folders on the gitignore file.

```gitignore
bin
target
```

## 
