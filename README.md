# Learn_with_Krish
In this code I declared empty block, static block and constructor. Output as follows:

Hello, I am coming from static block

Hello, I am coming from empty block

Hello, I am coming from constructor

Static block is executed first. And then empty block and after constructor executed. 
Static block executed before the main method also. That mean static block executed first in all. Because the first action of JVM in runtime is loads the CheckBlock(class name of my code) class file to the memory, when that class file is loading static block is executed. After the class file is loaded JVM calls the main method to execute.  And also static block is executed one time, because class file execute one time into the memory. 

During the object creation empty block and constructor are starting to execute. Before the execution of the constructor, empty block is executed. After the completion of empty block execution, then constructor start to execute. Constructor logic is specific to the particular object. 
