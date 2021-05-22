# Keytool API and Maven Plugin

[![Build Status](https://github.com/evolvedbinary/keytool/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/evolvedbinary/keytool/actions/workflows/ci.yml)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.evolvedbinary.thirdparty.org.codehaus.mojo/keytool-maven-plugin/badge.svg)](https://search.maven.org/search?q=g:com.evolvedbinary.thirdparty.org.codehaus.mojo)

This is a fork of: https://github.com/evolvedbinary/keytool
It just adds the facility for multiple `-ext` arguments.

It is published under our *3rd-party* `groupId` namespace: `com.evolvedbinary.thirdparty.*`.

For the Maven plugins you can use the coordinates:

```xml
<plugin>
	<groupId>com.evolvedbinary.thirdparty.org.codehaus.mojo</groupId>
	<artifactId>keytool-maven-plugin</artifactId>
	<version>1.6.0</version>
</plugin>
```
