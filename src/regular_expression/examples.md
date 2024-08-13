### 1. **Validate an Email Address**

**Problem**: Validate if a given string is a valid email address.

**Regex Pattern**:
```regex
^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$
```

The full regular expression ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$ matches:

* Start of the string (^).
* One or more characters that can include letters, digits, dots, underscores, percent signs, plus signs, or hyphens ([a-zA-Z0-9._%+-]+).
* The @ symbol.
* One or more characters that can include letters, digits, dots, or hyphens ([a-zA-Z0-9.-]+).
* A literal dot (\.).
* A top-level domain consisting of 2 to 6 letters ([a-zA-Z]{2,6}).
* End of the string ($).

**Solution**:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("test@example.com")); // true
        System.out.println(isValidEmail("invalid-email@.com")); // false
    }
}
```

### 2. **Extract All Numbers from a String**

**Problem**: Extract all the numbers from a given string.

**Regex Pattern**:
```regex
\d+
```

The regex \d+ matches:

* A single digit (0-9).
* A sequence of one or more digits (123, 456789, etc.).

**Solution**:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers {
    public static void main(String[] args) {
        String input = "The price is 1200 and the discount is 10%";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
```

**Output**:
```
1200
10
```

### 3. **Validate a Phone Number**

**Problem**: Validate if a given string is a valid 10-digit phone number.

**Regex Pattern**:
```regex
^\d{10}$
```

The regular expression ^\d{10}$ matches:

* A string that consists entirely of exactly 10 digits.
* The string must start with a digit and end after exactly 10 digits.

**Solution**:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("9876543210")); // true
        System.out.println(isValidPhoneNumber("123-456-7890")); // false
    }
}
```

### 4. **Replace Multiple Spaces with a Single Space**

**Problem**: Replace multiple consecutive spaces in a string with a single space.

**Regex Pattern**:
```regex
\s+
```

The regex \s+ matches:

* A single whitespace character (space, tab, newline, etc.).
* A sequence of one or more whitespace characters.

**Solution**:
```java
public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "This   is  a  sentence   with   multiple spaces.";
        String output = input.replaceAll("\\s+", " ");
        System.out.println(output); // "This is a sentence with multiple spaces."
    }
}
```

### 5. **Check if a String is a Valid Date (DD/MM/YYYY)**

**Problem**: Validate if a given string is a valid date in the format `DD/MM/YYYY`.

**Regex Pattern**:
```regex
^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$
```

The regular expression ^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$ matches:

* Day: A valid day in the range 01 to 31.
* Month: A valid month in the range 01 to 12.
* Year: A valid year, consisting of exactly four digits.

**Solution**:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
    public static boolean isValidDate(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("31/12/2023")); // true
        System.out.println(isValidDate("29/02/2023")); // false (not a leap year)
    }
}
```

### 6. **Remove All Non-Alphanumeric Characters from a String**

**Problem**: Remove all characters from a string that are not letters or digits.

**Regex Pattern**:
```regex
[^a-zA-Z0-9]
```

The regex [^a-zA-Z0-9] matches:

* Any character that is not a letter (either uppercase or lowercase) or a digit.

**Solution**:
```java
public class RemoveNonAlphanumeric {
    public static void main(String[] args) {
        String input = "Hello, World! 123.";
        String output = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(output); // "HelloWorld123"
    }
}
```
### 7. **Check if a String Contains Only Letters**

**Problem**: Check if a string contains only alphabetic characters (no digits or special characters).

**Regex Pattern**:
```regex
^[a-zA-Z]+$
```

The regex ^[a-zA-Z]+$ matches:

* Strings: That consist entirely of one or more alphabetic characters.
* Conditions:
  * The string must start with an alphabetic character.
  * The string must end with an alphabetic character.
  * The string must contain only alphabetic characters, with no spaces, numbers, or special characters.


**Solution**:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersOnly {
    public static boolean isLettersOnly(String input) {
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isLettersOnly("HelloWorld")); // true
        System.out.println(isLettersOnly("Hello123"));   // false
    }
}
```

### 8. **Find Repeated Words in a String**

**Problem**: Find and print repeated words in a string.

**Regex Pattern**:
```regex
\b(\w+)\b(?=.*\b\1\b)
```

This regex is designed to find repeated words within a string. Here's how it works:

* Capture Group: (\w+) captures a word.
* Word Boundary: \b ensures that the match is a complete word.
* Lookahead: (?=.*\b\1\b) ensures that the same word captured by (\w+) appears again later in the string.

**Solution**:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.HashSet;

public class RepeatedWords {
    public static void main(String[] args) {
        String input = "This is a test. This test is simple.";
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b(?=.*\\b\\1\\b)");
        Matcher matcher = pattern.matcher(input);

        HashSet<String> repeatedWords = new HashSet<>();
        while (matcher.find()) {
            repeatedWords.add(matcher.group());
        }

        System.out.println("Repeated words: " + repeatedWords);
    }
}
```

**Output**:
```
Repeated words: [This, is, test]
```
