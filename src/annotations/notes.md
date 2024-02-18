In Java, annotations are a form of metadata that provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate. However, they can be used by the compiler, at runtime via reflection, or by other tools to provide additional information about classes, methods, variables, and other program elements.

## Basic Syntax

Annotations are declared using the `@` symbol followed by the annotation name, which can include optional parameters inside parentheses. Annotations can be applied to declarations of classes, methods, variables, and other program elements.

Here's a simple example of a custom annotation:

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestAnnotation {
    String value();
}
```

In this example, `TestAnnotation` is a custom annotation with a single parameter called `value` of type `String`.

## Built-in Annotations

Java also provides several built-in annotations that are commonly used for various purposes:

- `@Override`: Indicates that a method is intended to override a method in a superclass.
- `@Deprecated`: Indicates that a class, method, or variable is deprecated and should no longer be used.
- `@SuppressWarnings`: Suppresses compiler warnings for the annotated element.
- `@FunctionalInterface`: Indicates that an interface is a functional interface, which can be used with lambda expressions.
- `@SafeVarargs`: Indicates that a method does not perform potentially unsafe operations on its varargs parameter.
- `@Target`: Specifies the types of program elements to which an annotation can be applied.
- `@Retention`: Specifies how long an annotation should be retained.

## Applying Annotations

Annotations can be applied to program elements using the `@` symbol followed by the annotation name. Annotations can also include parameters, which can be specified using name-value pairs inside parentheses.

Here's an example of applying the `@TestAnnotation` custom annotation to a method:

```java
public class MyClass {
    @TestAnnotation("Hello, World!")
    public void myMethod() {
        // Method implementation
    }
}
```

In this example, the `@TestAnnotation` annotation is applied to the `myMethod` method with a parameter value of `"Hello, World!"`.

## Processing Annotations

Annotations can be processed at compile time using annotation processors or at runtime using reflection. Annotation processors are used to generate additional code, such as code for resource injection, whereas reflection can be used to access and manipulate annotations at runtime.

Here's an example of using reflection to access and print the value of the `@TestAnnotation` annotation applied to a method:

```java
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        MyClass myClass = new MyClass();
        Method method = myClass.getClass().getMethod("myMethod");
        TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
        System.out.println(annotation.value()); // Output: Hello, World!
    }
}
```

In this example, the `getAnnotation` method is used to retrieve the `@TestAnnotation` annotation applied to the `myMethod` method, and the value of the annotation is printed.
