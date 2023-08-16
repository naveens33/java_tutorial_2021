**Inheritance in Java:**

Inheritance is a core concept of object-oriented programming that allows one class to inherit the properties and behaviors of another class. The class from which properties and behaviors are inherited is called the superclass or parent class, while the class inheriting those properties and behaviors is called the subclass or child class.

**Types of Inheritance:**

**1. Single Inheritance:**
- Single inheritance involves a subclass inheriting properties and behaviors from a single superclass.
- Java supports single inheritance, where a class can extend only one superclass.

**2. Multilevel Inheritance:**
- Multilevel inheritance involves creating a chain of classes where each class acts as a superclass for the class below it.
- This forms a hierarchical structure, and properties and behaviors are inherited through multiple levels.

**3. Hierarchical Inheritance:**
- Hierarchical inheritance involves multiple subclasses inheriting from a single superclass.
- Each subclass can have its own additional properties and behaviors while sharing common ones from the superclass.

**4. Multiple Inheritance (Not Supported in Java):**
- Multiple inheritance involves a subclass inheriting properties and behaviors from two or more superclasses.
- Java does not support multiple inheritance to avoid complexities and ambiguities.
- Java does not support multiple inheritance due to a design choice made to simplify the language and avoid certain complexities and ambiguities that can arise when dealing with multiple inheritance. 
- Major reasons behind this decision:
  - **Diamond Problem:** One of the main issues with multiple inheritance arises from the "diamond problem." This occurs when a class inherits from two classes that share a common superclass. If both parent classes have a method with the same name, the subclass wouldn't know which method to inherit, leading to **ambiguity**. Resolving this ambiguity requires careful rules and design decisions.

**5. Hybrid Inheritance:**
- Hybrid inheritance is a combination of any of the above types.
- It involves a mixture of single, multilevel, and hierarchical inheritance.