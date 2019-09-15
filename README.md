# Tax Calculator
A simple tax calculator utility for adding or removing canadian tax. This project was the result of experimentation using the Netbeans GUI Form editor and the GroupLayout class. Not fully commented or documented for now. Later this project might be cleaned up, fixed, and re-designed (the GUI). For now it remains a fully functional calculator.



# Usage
- Note: Source files along with resource files
  must be in their original location.
- Note: The main class is 'CanadianTaxCalculator'.
- The program can be launched by:
  - Running the CanadianTaxCalculator class in an IDE capable of running  Java.
  - Manually running the JAR:
      ```
      java -jar CanadianTaxCalculator.jar
      ```
  - Manually running the class files within the JAR:
      ```
      java -cp <path to JAR>/CanadianTaxCalculator.jar canadiantaxcalc.CanadianTaxCalculator 
      ```
  - Extracting the JAR, and then compiling and  running the source files within extracted folders:
      ```
      javac <path to src folder>/canadiantaxcalc/*.java
      java -cp . canadiantaxcalc.CanadianTaxCalculator 
      ```
