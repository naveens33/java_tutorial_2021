Class is a blueprint or a template that defines the structure and behavior of objects. It serves as a fundamental building block of object-oriented programming (OOP) in Java. When you create an object from a class, you are creating an instance of that class.

Here's the basic syntax for defining a class in Java:

```java
accessModifier class ClassName {
    // Fields (instance variables)
    // Constructors
    // Methods (functions)
}
```

Let's break down the components of a Java class:

1. Access modifier: It specifies the visibility or accessibility of the class to other classes. Common access modifiers are `public`, `private`, `protected`, and package-private (no explicit modifier).

2. Class name: It is the identifier for the class and should start with an uppercase letter, following the camelCase convention.

3. Fields (instance variables): These are the data members of the class that hold the state or characteristics of the objects created from the class. Fields are declared within the class but outside of any method.

4. Constructors: A constructor is a special method used to initialize the state of an object when it is created. It has the same name as the class and doesn't have a return type.

5. Methods: Methods are functions defined within the class that perform specific actions or operations on the object's data. They are declared within the class and can be accessed using objects of the class.

Here's a simple example of a Java class:

```java
public class Student {
    // Fields
    private String name;
    private int age;
    private String rollNumber;

    // Constructor
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Method to get student's name
    public String getName() {
        return name;
    }

    // Method to set student's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get student's age
    public int getAge() {
        return age;
    }

    // Method to set student's age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to get student's roll number
    public String getRollNumber() {
        return rollNumber;
    }

    // Method to set student's roll number
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
    public static void main(String[] args) {
        Student student1 = new Student("John Smith", 20, "12345");
        Student student2 = new Student("Jane Doe", 19, "67890");

        student1.displayInfo();
        // Output:
        // Name: John Smith
        // Age: 20
        // Roll Number: 12345

        student2.setAge(20);
        System.out.println("Updated Age: " + student2.getAge());
        // Output: Updated Age: 20
    }
}
```

In this example, we have defined a `Student` class with fields `name`, `age`, and `rollNumber`. It has a constructor to initialize the object's state, and several getter and setter methods to access and modify the student's information. Additionally, there is a method `displayInfo()` to print the student's details.

In this example, we created two `Student` objects, `student1` and `student2`, and displayed their information using the `displayInfo()` method. We also updated the age of `student2` using the `setAge()` method and then retrieved the updated age using the `getAge()` method.