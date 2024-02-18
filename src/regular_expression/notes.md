
| **Component**     | **Description**                                                                     | **Example**               |
|-------------------|-------------------------------------------------------------------------------------|---------------------------|
| **Character Classes**  |                                                                                  |                           |
| `. `              | Matches any single character except newline                                          | `h.t`                     |
| `[...]`           | Matches any single character in brackets                                              | `[aeiou]`                 |
| `[^...]`          | Matches any single character not in brackets                                          | `[^aeiou]`                |
| `\d`              | Matches any digit (0-9)                                                               | `\d{3}`                   |
| `\D`              | Matches any non-digit character                                                       | `\D{3}`                   |
| `\w`              | Matches any word character (alphanumeric and underscore)                              | `\w+`                     |
| `\W`              | Matches any non-word character                                                        | `\W+`                     |
| `\s`              | Matches any whitespace character                                                      | `\s+`                     |
| `\S`              | Matches any non-whitespace character                                                  | `\S+`                     |
| `\b`              | Matches a word boundary                                                               | `\bword\b`                |
| `\B`              | Matches a non-word boundary                                                           | `\Bword\B`                |
| `^`               | Matches the start of a string                                                         | `^hello`                  |
| `$`               | Matches the end of a string                                                           | `world$`                  |
| **Quantifiers**       |                                                                                  |                           |
| `*`               | Matches zero or more of the preceding element                                         | `ab*c`                    |
| `+`               | Matches one or more of the preceding element                                          | `ab+c`                    |
| `?`               | Matches zero or one of the preceding element                                          | `ab?c`                    |
| `{n}`             | Matches exactly n of the preceding element                                            | `a{3}`                    |
| `{n,}`            | Matches n or more of the preceding element                                            | `a{3,}`                   |
| `{n,m}`           | Matches at least n and at most m of the preceding element                             | `a{3,5}`                  |
| **Grouping and Capturing** |                                                                                  |                           |
| `(...)`           | Groups a series of pattern elements to form a single element                          | `(abc)+`                  |
| `(?:...)`         | Groups a series of pattern elements without capturing                                 | `(?:abc)+`                |
| `(?P<name>...)`  | Captures the match of the enclosed pattern into the named group "name"               | `(?P<name>[0-9])`         |
| `(?P=name)`      | Matches the text that was matched by the named group "name"                           | `(a)(?P=a)`               |
| **Alternation**        |                                                                                  |                           |
| `|`               | Alternation, matches either the expression before or after it                         | `foo|bar`                 |
| **Anchors**            |                                                                                  |                           |
| `\b`              | Matches a word boundary                                                               | `\bword\b`                |
| `\B`              | Matches a non-word boundary                                                           | `\Bword\B`                |
| `^`               | Matches the start of a string                                                         | `^hello`                  |
| `$`               | Matches the end of a string                                                           | `world$`                  |
| **Lookarounds**        |                                                                                  |                           |
| `(?=...)`         | Positive lookahead, matches if the pattern inside it is followed by the pattern inside the parentheses | `q(?=u)` |
| `(?!...)`         | Negative lookahead, matches if the pattern inside it is not followed by the pattern inside the parentheses | `q(?!u)` |
| `(?<=...)`        | Positive lookbehind, matches if the pattern inside it is preceded by the pattern inside the parentheses | `(?<=q)u` |
| `(?<!...)`        | Negative lookbehind, matches if the pattern inside it is not preceded by the pattern inside the parentheses | `(?<!q)u` |
| **Greedy vs. Lazy Matching** |                                                                                  |                           |
| `*?`              | Lazy quantifier, matches as few characters as possible                                | `a*?`                     |
| `+?`              | Lazy quantifier, matches as few characters as possible                                | `a+?`                     |
| `??`              | Lazy quantifier, matches as few characters as possible                                | `a??`                     |
| `{n}?`            | Lazy quantifier, matches as few characters as possible                                | `a{n}?`                   |
| `{n,m}?`          | Lazy quantifier, matches as few characters as possible                                | `a{n,m}?`                 |
| **Escaping Special Characters** |                                                                               |                           |
| `\`               | Escapes a special character, turning it into a literal character                      | `\*`                      |
| **Flags**              |                                                                                  |                           |
| `i`               | Case-insensitive matching                                                            | `/pattern/i`              |
| `g`               | Global matching (find all matches)                                                   | `/pattern/g`              |
| `m`               | Multiline matching                                                                   | `/pattern/m`              |
| **Examples**           |                                                                                  |                           |
| `\d{3}-\d{3}-\d{4}` | Matches a phone number in the format XXX-XXX-XXXX                                    |                           |
| `\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}` | Matches an IP address in the format XXX.XXX.XXX.XXX                          |                           |
| `([A-Z]{3})`      | Matches three consecutive uppercase letters                                           |                           |
| `(\d{1,2})-(\d{1,2})-(\d{4})` | Matches a date in the format MM-DD-YYYY and captures the month, day, and year separately |                           |
| `\b\d{5}\b`       | Matches a 5-digit number surrounded by word boundaries                               |                           |
