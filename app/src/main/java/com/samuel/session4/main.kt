package com.samuel.session4

class Student(
    val name: String,
    val program: String,
    val isActive: Boolean
)

class User(
    val username: String,
    val isVerified: Boolean,
    val followers: Int
){
    fun showProfile(){
        println("Username: $username")
        println("Followers: $followers")
        println("Verified user: $isVerified")
    }
}

class Book(
    val title: String,
    val author: String,
    val year: Int
){
    fun showBook() {
        println("Title: $title")
        println("Author: $author")
        println("Year: $year")
    }
}

class Employee(
    val name: String,
    val position: String,
    val salary: Int
) {
    fun employeeSummary(){
        println("Name: $name")
        println("Position: $position")
        println("Salary: $salary")
    }
}

fun main() {
    // CHALLENGE 1
    println("===Challenge 1===")
    val originalPrice = 99.99f
    val discountPercentage = 15.0f
    val finalPrice = calculateDiscount(originalPrice, discountPercentage)
    println("The original price is: $originalPrice$")
    println("Tje discount percentage is: $discountPercentage")
    println("The final price is: %.2f".format(finalPrice))

    println("===LAMBDA FUNCTIONS===")
    // BASIC LAMBDA EXAMPLE
    val sayHi = {println("Hi!")}
    sayHi()
    sayHi()

    // LAMBDA WITH PARAMETER EXAMPLE
    val greet = {name: String -> println("Hello, $name")}
    greet("Reggie")
    greet("Samuel")

    // LAMBDA THAT RETURNS A VALUE EXAMPLE
    val multiply = { number1: Int, number2: Int -> number1 * number2}
    println(multiply(4,5))

    //CHALLENGE 2
    println("===Challenge 2===")
    val welcome =  {println("Welcome")}
    welcome()

    val cityPrint = {city: String -> println("The city is: $city")}
    cityPrint("Tijuana")

    val sum = { number1: Int, number2: Int -> number1 + number2}
    println(sum(10,9))

    println("===Challenge 3===")
    val isEven = { number1: Int -> number1 % 2 == 0}

    val result1 = isEven(4)
    val result2 = isEven(7)

    println("Is 4 even? $result1")
    println("Is 7 even? $result2")

    // CLASSES AND OBJECTS
    println("===Clases and objects===")
    val student1 = Student("Samuel", "MDI2", true)
    val student2 = Student("Reggie", "MDI2", true)

    println("===Student 1===")
    println("Name: ${student1.name}")
    println("Program: ${student1.program}")
    println("Is an active student?: ${student1.isActive}")
    println("===Student 2===")
    println("Name: ${student2.name}")
    println("Program: ${student2.program}")
    println("Is an active student?: ${student2.isActive}")

    println("===Clases and objects with functions===")
    val user1 = User("@ana_dev", true, 1234)
    println("===SHOW USER1===")
    println(user1.showProfile())

    //Challenge 4
    println("===CHALLENGE 4===")
    val book1 = Book("Around the World in Eighty Days", "Jules Verne", 1873)
    println("===Book===")
    println(book1.showBook())

    println("===CHALLENGE 5===")
    val employee1 = Employee("Samuel", "Software Developer", 100000)
    val employee2 = Employee("Reggie", "Data Science Engineer", 140000)
    println(employee1.employeeSummary())
    println(employee2.employeeSummary())

    // Nullability
    println("===NULLABILITY EXAMPLE===")

    var nickname: String? = "Johnny"
    println(nickname?.length)

    val displayName = nickname ?: "No nickname"
    println(displayName)

    println("===Challenge 6===")
    var middleName: String? = null
    println("Middlename: ${middleName ?: "Middlename not available"}")

    val gpa: Double? = null
    println("GPA: ${gpa ?: "GPA NOT AVAILABLE"}")

    println("===CHALLENGE 7===")
    var favoriteStreamingApp: String? = null
    println("${favoriteStreamingApp ?: "No streaming app membership"}")
    favoriteStreamingApp = "Netflix"
    println("${favoriteStreamingApp ?: "No streaming app membership"}")

}

fun calculateDiscount(originalPrice: Float, discountPercentage: Float): Float{
    val discount = (originalPrice * discountPercentage) / 100
    return originalPrice - discount
}


