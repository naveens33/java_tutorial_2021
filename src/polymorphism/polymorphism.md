**Polymorphism:**

Polymorphism is a core concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. This enables the flexibility to work with various types of objects in a unified manner.

**1. Method Overloading:**
- Method overloading refers to defining multiple methods in a class with the same name but different parameter lists.
- The methods must have different parameter types or a different number of parameters.
- Java decides which method to call based on the arguments passed during the method call.
- Overloading helps provide multiple ways to perform the same operation with different input.

Example:
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

**2. Method Overriding:**
- Method overriding occurs when a subclass provides a specific implementation for a method that's already defined in its superclass.
- The overridden method in the subclass must have the same method signature (name, parameters, and return type).
- The `@Override` annotation is often used to indicate that a method is intended to override a superclass method.
- Overriding enables customizing behavior for specific subclasses.

Example:
```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
```

**3. Runtime Polymorphism (Dynamic Method Dispatch):**
- Runtime polymorphism, also known as dynamic method dispatch, allows the JVM to determine the appropriate method to execute at runtime.
- This occurs when a method is overridden in a subclass and called using a reference of the superclass.
- The actual method to be invoked is decided based on the actual type of the object, not the reference type.
- This enables flexible and extensible code where behavior can be modified by changing subclass implementations.

Example:
```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Upcasting
        myAnimal.makeSound();  // Calls Dog's makeSound at runtime
    }
}
```

Polymorphism enables code to be more modular and adaptable to changes, making it a fundamental principle in building object-oriented systems.

### Frequently debated topic 
**Method Overriding vs Runtime Polymorphism()(Dynamic Method Dispatch)**
method overriding and runtime polymorphism are related concepts, but they refer to different aspects of object-oriented programming.

**Method Overriding:**
Method overriding is a concept in which a subclass provides a specific implementation for a method that's already defined in its superclass. The method in the subclass must have the same name, parameters, and return type as the method in the superclass. This allows the subclass to customize or extend the behavior of the inherited method. The `@Override` annotation is often used to indicate that a method is intended to override a superclass method. Method overriding occurs at the time of writing the code and compiling it.

**Runtime Polymorphism (Dynamic Method Dispatch):**
Runtime polymorphism, also known as dynamic method dispatch, is a feature that allows the JVM to determine which method to invoke at runtime. It's closely related to method overriding. When a subclass overrides a method of its superclass and an object of the subclass is referred to by a reference of the superclass, the actual method to be executed is determined by the type of the object, not the reference type. This decision is made dynamically at runtime based on the actual type of the object and is known as runtime polymorphism. Runtime polymorphism occurs when the program is executed.

In simpler terms, method overriding is the mechanism that enables runtime polymorphism. The subclass's overridden method is selected for execution at runtime based on the actual type of the object being referred to by a superclass reference.

Example:
```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Upcasting
        myAnimal.makeSound();  // Calls Dog's makeSound at runtime (runtime polymorphism)
    }
}
```

In this example, method overriding (the `makeSound` method in `Dog` class) enables runtime polymorphism, where the actual method executed depends on the actual type of the object (`Dog` in this case).