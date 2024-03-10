# CMPG211_assignment_1
### TASKS
1. Create a class named UniversityCourse
	1. that includes **data attributes** that hold the 
		1. **department** (for example, CMPG), 
		2. **course number** (for example, 211),
		3. **credits** (for example, 8)
		4. **fee** for the course (for example, R3 060)
2. Include a **display() method** that displays the course data.
3. Create a **subclass** named LabCourse that adds R1 050 to the **course fee**
4. **Override** the parent class **display() method** to indicate that the course is a lab course and to display all the data
5. Write a **test class** named UseCourse that prompts the user for course information
 
 All of data attributes are **required** as **arguments** to the constructor, except for the fee, which is calculated at R820 per credit hour. 

## Instructions

1. If the user enters/attends a class in any of the following **departments**, create a LabCourse: GEOM, MCHE, CMPG, or PHYM. 
2. If the user enters/attends any other **department**, create a UniversityCourse that does not include the lab fee. Then display the course data. 
3. **Format** output to 2 decimal places. 
4. The user should be asked to **repeat** the process or not, 
	1. (y) indicates yes they want to repeat the process and the process repeats
	2. (n) indicates no they do not want to repeat the process and the process stops. 
5. Save the files as UniversityCourse.java, LabCourse.java, and UseCourse.java.


### NOTES
1. String - %s
2. formatting a number - number: %.2f
3. number of character (width) - number: %10d
4. d - int 
5. f- double
