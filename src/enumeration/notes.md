An enumeration (enum) in Java is a special data type that allows for a variable to be a set of predefined constants. These constants are typically defined as a list of named values, and they can be used to represent a fixed set of possible states or options. Enums provide type safety, which means that the compiler will catch any type mismatches at compile time.

Here's an example of how to define and use an enum in Java:

```java
// Define an enum called DayOfWeek
public enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Declare a variable of type DayOfWeek
        DayOfWeek today = DayOfWeek.FRIDAY;

        // Use the switch statement to perform different actions based on the day of the week
        switch (today) {
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
        }
    }
}
```

In this example, we define an enum called `DayOfWeek`, which consists of seven constants representing the days of the week. We then declare a variable called `today` of type `DayOfWeek` and assign it the value `FRIDAY`. We use a switch statement to print a message based on the value of `today`.

Enums can also have fields, constructors, and methods, just like regular classes. Here's an example that demonstrates this:

```java
public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class CoinExample {
    public static void main(String[] args) {
        // Use the values() method to get an array of all the constants in the enum
        Coin[] coins = Coin.values();

        // Print the value of each coin
        for (Coin coin : coins) {
            System.out.println(coin + ": " + coin.getValue() + " cents");
        }
    }
}
```

In this example, we define an enum called `Coin`, which consists of four constants representing different types of coins. We also define a field called `value` and a constructor that takes an `int` parameter and initializes the `value` field. We then define a method called `getValue()` that returns the `value` field.

In the `CoinExample` class, we use the `values()` method to get an array of all the constants in the `Coin` enum, and then we use a for-each loop to print the value of each coin.