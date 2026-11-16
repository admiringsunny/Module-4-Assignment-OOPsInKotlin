package com.capstone


//Module 4 Assignment: OOPs in Kotlin
//This assignment tests your understanding of Object-Oriented Programming in Kotlin. Use classes, objects, inheritance, interfaces, encapsulation, and polymorphism wherever required.
//Section A: Basic OOP Practice
fun main() {
    val toyota = Car("Toyota", "Corolla", 24500.0)
    println("Details: ${toyota.brand}, ${toyota.model}, ${toyota.price}.")
    val honda = Car("Honda", "Civic", 27800.0)
    println("Details: ${honda.brand}, ${honda.model}, ${honda.price}.")
    val hyundai = Car("Hyundai", "Ioniq 5", 43500.0)
    println("Details: ${hyundai.brand}, ${hyundai.model}, ${hyundai.price}.")
}

//1. Create a class 'Car' with properties: brand, model, and price. Create 3 objects and print their details.
class Car(
    var brand: String,
    var model: String,
    var price: Double
)

//2. Create a class 'Student' with name and roll number. Add a function introduce() that prints student details.
//3. Create a class 'Rectangle' with length and breadth. Add a function area() to calculate area.

//Section B: Encapsulation
//4. Create a class 'BankAccount' with a private balance variable.
//Add functions deposit(), withdraw(), and getBalance().
//Ensure balance cannot become negative.
//5. Create a class 'Employee' with a private salary.
//Add setter and getter functions with validation.
//Section C: Inheritance
//6. Create a base class 'Animal' with functions eat() and sleep().
//Create a derived class 'Dog' that adds bark().
//7. Create a base class 'Person'. Derive 'Teacher' and 'Student' classes from it.
//Section D: Interfaces
//8. Create an interface 'Playable' with function play().
//Implement it in classes 'Cricket' and 'Football'.
//9. Create an interface 'Shape' with function area().
//Implement it in Circle and Rectangle classes.
//Section E: Polymorphism
//10. Create a base class 'Shape' with function area().
//Override it in Circle and Rectangle.
//Store objects in a list of Shape and call area() for each.
//11. Create a list of Animal objects (Dog, Cat etc.) and call makeSound() using polymorphism.
//Mini Assignment
//Create a simple Library System:
//• Class Book (title, author)
//• Class Library (list of books)
//• Functions: addBook(), removeBook(), showBooks()
//Use encapsulation and proper OOP structure.
//Submission Guidelines
//• Create a folder/github repository containing all Kotlin files.
//• Run each program and take screenshots of outputs.
//• Include code files or screenshots of code.
//• Upload folder to Google Drive / Github Repository.
//• Submit the Drive link / Github Repository link.
//• Ensure viewing access is enabled(or, public repo in case of github).
