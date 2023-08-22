Some key points and notes about abstract classes in Java:

1. **Definition:** An abstract class is a class that cannot be instantiated on its own and is meant to be a base for other classes. It can contain both abstract methods (methods without a body) and regular methods with a defined implementation.

2. **Usage:** Abstract classes provide a way to define a common interface for a group of related classes. They allow you to establish a blueprint for subclasses to follow while enforcing certain behavior and structure.

3. **Abstract Methods:** Abstract classes can have abstract methods, which are declared without an implementation in the abstract class. Subclasses of an abstract class must provide concrete implementations for all inherited abstract methods.

4. **Concrete Methods:** Abstract classes can also have concrete methods, which are methods with an implementation. Subclasses can inherit these methods and use them directly without overriding, although they can be overridden if needed.

5. **Instance Creation:** You cannot create an instance of an abstract class using the `new` keyword. Abstract classes are meant to be extended by subclasses, and instances of those subclasses can be created.

6. **Subclassing:** To create a subclass of an abstract class, you use the `extends` keyword. The subclass must provide implementations for all inherited abstract methods, or else the subclass will also be marked as abstract.

7. **Overriding Abstract Methods:** When a subclass extends an abstract class, it must provide implementations for all inherited abstract methods using the `@Override` annotation. If any abstract method remains unimplemented, the subclass must be marked as abstract as well.

8. **Constructors:** Abstract classes can have constructors, which are used to initialize the common fields and behaviors. Subclasses should call the constructor of the abstract superclass using the `super()` keyword in their constructors.

9. **Fields:** Abstract classes can have instance variables (fields) just like any other class. Subclasses can access these fields if they are declared with appropriate access modifiers.

10. **Object Inheritance:** Abstract classes extend the concept of inheritance in Java. A subclass of an abstract class is both a subclass of the abstract class and a superclass for any further subclasses that might extend the concrete subclass.

11. **Polymorphism:** Abstract classes facilitate polymorphism, allowing you to create a reference of the abstract class type and assign it to an instance of a concrete subclass. This is useful for creating more flexible and maintainable code.

12. **Examples:** Abstract classes are used in scenarios where you want to define a common interface for a group of related classes. Classic examples include geometric shapes (like `Shape` with subclasses `Circle`, `Rectangle`, etc.) or vehicles (like `Vehicle` with subclasses `Car`, `Bus`, etc.).

Remember that abstract classes are a fundamental concept in Java's object-oriented programming paradigm. They help in designing reusable and structured class hierarchies while enforcing certain behaviors and methods across related classes.

Here's an example of an abstract class `Person` and a concrete subclass `Student`:

```java
// Abstract class Person
abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void introduceYourself();
    
    // Concrete method
    public void commonMethod() {
        System.out.println("This is a common method.");
    }
}

// Concrete subclass Student
class Student extends Person {
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    // Implementing the abstract method
    @Override
    public void introduceYourself() {
        System.out.println("I am a student. My name is " + name + " and my student ID is " + studentId + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // You cannot create an instance of an abstract class
        // Person person = new Person("John"); // This will result in an error
        
        // Creating an instance of the concrete subclass
        Student student = new Student("Alice", 12345);
        
        // Calling methods
        student.introduceYourself(); // Calls the overridden method in Student class
        student.commonMethod();      // Calls the method from the abstract class
    }
}
```

In this example:

- The `Person` class is an abstract class with an abstract method `introduceYourself()` and a concrete method `commonMethod()`.
- The `Student` class is a concrete subclass of `Person`. It provides an implementation for the abstract method `introduceYourself()`.
- The `main` method demonstrates how to create an instance of the `Student` class and call its methods.

Remember that abstract classes cannot be instantiated directly, but they can be subclassed, and their abstract methods must be overridden by the concrete subclasses.