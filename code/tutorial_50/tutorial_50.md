# Packages

#### What / Why?
* A package is a group of class files.
* Packages help organize your code.  
* Packages help keep your code unique from other people so you can resolve conflicts in your code if you have two or more classes with the same name.  


#### Naming conventions
```java
// after your website
package com.site.packagename;
package net.site.packagename;
package org.site.packagename;

// using your initials and/or company name
package jre.packagename
package jre.companyname.packagename;
```

#### Compiling packages

>Generic.  

```
javac -d c:/path/to/compile/to c:/path/of/source/file.java
```

>Generic, compile all java files in a directory.  

```
javac -d c:/path/to/compile/to c:/path/of/source/*.java
```

>Current directory = './' or simply just '.' so all these are the same.  

```
javac -d ./ ./*.java 

javac -d . ./*.java

javac -d . *.java
```  

>Compiling from two sources.  

```
javac -d ./ ./source1/*.java ./source2/*.java
```

#### Running classes within packages
>If in different directory.  

```
java -cp c:\location\of\packages full.packagename.ClassName
```

>If in the package directory.  

```
java full.packagename.ClassName
```

#### Windows trick to get a list of all your project's java files
> c:/location/of/source/files/update-sources.cmd  

```
dir /s /b *.java > sources.txt
```

#### Using our `sources.txt` file
>Compiles all your java files to the current directory.  

```
javac -d ./ @sources.txt
```

>Compiles all your java files to a folder called bin, in the current directory.  

```
javac -d ./bin @sources.txt
```
