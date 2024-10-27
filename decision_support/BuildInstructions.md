# Decision Support Project - Build Instructions 

## Build System Requirements
The [Apache Ant](https://ant.apache.org/) tool is used for build automation.
Please see [https://ant.apache.org](https://ant.apache.org/) for installation and usage instructions.
 
## Creating an executable jar file
### Apache Ant Automated Build
The project is set up to use Apache Ant to create the jar file.
1. Change the working directory to the project's root directory. (The directory where build.xml resides.)
2. Execute the command `ant jar`
3. The new jar file will be named "**DecisionSupport.jar**" and located in the **build/jar/** subdirectory.
    - Run using `ant run` or `java -jar build/jar/DecisionSupport.jar`

### Command Line Manual Build
If there is no automated build environment set up, the jar file can be created using the `jar` command.
1. Change the working directory to the **src/** subdirectory within the project's root directory.
3. Execute the command `javac metrocs/DSDriver.java` to compile the **DSDriver.java** file.
4. Execute the command `echo Main-Class: metrocs/DSDriver > MANIFEST.MF` to create a manifest file for the jar.
6. Create the jar using the command `jar cfm DecisionSupport.jar MANIFEST.MF metrocs/*.class`
7. The new jar file will be named "**DecisionSupport.jar**" and located in the current working directory.
   - Run using `java -jar DecisionSupport.jar`

More information on creating the jar can be found [here](https://docs.oracle.com/javase/tutorial/deployment/jar/build.html) and more information about java commands can be found [here.](https://docs.oracle.com/en/java/javase/15/docs/specs/man/index.html)

### IDE Build
An executable jar file can also be created within most IDEs.

## Using Ant
To build the project from a copy of the repository use the command:  
   `ant all`  
   
To display the full list of targets use the command:  
   `ant -p`
