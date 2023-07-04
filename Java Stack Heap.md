#### Java code only runs inside named blocks
#### RAM memory 
### Stack
#### - Run button -> first method -> main -> 
#### slot is creted inside de memory area -> all variables inside the main method are local variables
#### if we create a new method called "do work" it will be added to the stack pile on top of main
#### it will have its variables as well stored in its frame
#### if "do work" invokes another method called do more it will also be pilled on the stack
#### once "do more" is finished and the code on the next line is executed, "do more" will be eliminated from the stack
#### once "do work" is also completed and the main method proceeds to the next line, "do work" will also be removed from the next line


### Heap
#### if we create a local reference variable called "myCar" of type "Car", it belongs inside of main
#### the variable points to the actual object  
####  myCar = new Car() -> the variable "myCar" doesn't contain the object, but it's a reference to it
####  myCar is a reference variable -> it refers to where the actual object resides in memory 
#### the actual object that is created with "new Car()" resides in Heap Memory
#### the "myCar" inside the main() in the main() Stack frame will now point to Car() in Heap memory
#### what is assigned to the myCar variable is not the actual object, but the memory address on the Heap where this Car object resided in memory
#### this is different from primitive data types, where the variable actually contains the data in binary form
#### with myCar, the variable only contains the reference to the memory address where the object is located
#### when we assign the myCar variable a new address, we lose track of the old memory address
#### the old car object is not referenced anymore by any variable, so if becomes a candidate for deletion
#### that's when Garbage Collection comes in, it runs in the Heap memory, looking for objects that dont have any variable pointing to them
#### instance variables -> they belong to a particular instance 
#### the instance variables that belong to every single object of type Car, now will have a slot on the heap memory used to maintain data
