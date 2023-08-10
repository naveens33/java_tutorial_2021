Lambda expressions provide a concise way to express instances of functional interfaces (interfaces that have a single abstract method) using a compact syntax. Lambda expressions are often used to define inline implementation of a functional interface directly in the body of a method.

Here's a brief overview of how lambda expressions work and their syntax:

**Lambda Expression Syntax:**
A lambda expression consists of parameters, an arrow `->`, and a body. The parameters are enclosed in parentheses, and the body can be an expression or a block of code.

Syntax:
```
(parameters) -> expression
(parameters) -> { statements; }
```

**Example:**
Suppose you have a functional interface `MyFunctionalInterface` with a single abstract method `void myMethod(String str);`. You can use a lambda expression to implement this interface as follows:

```java
MyFunctionalInterface myLambda = (str) -> System.out.println(str);
myLambda.myMethod("Hello, Lambda!");
```

In this example:
- `(str)` is the parameter list.
- `->` separates the parameters from the body.
- `System.out.println(str);` is the body of the lambda expression.

Lambda expressions are commonly used with functional interfaces and Java stream operations to write more concise and readable code. Here's an example using a lambda expression with the `map` operation of a Java stream:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
List<Integer> nameLengths = names.stream()
    .map(name -> name.length())
    .collect(Collectors.toList());
```

In this example, the lambda expression `name -> name.length()` is used to transform each element of the stream (a name) into its length.
