# ✦ Notes — Number of Senior Citizens

## ✦ Problem Understanding

Each passenger's information is stored in a String of length 15.

The format is:

```text
XXXXXXXXXX G AA SS
│          │ │  │
│          │ │  └── Seat number
│          │ └───── Age
│          └─────── Gender
└────────────────── Phone number
```

The age is stored at indices 11 and 12.
✦ Important Concept 1 — substring()
In Java:
str.substring(start, end)
extracts characters from start up to end - 1.
The end index is exclusive.
Example:
String str = "HelloWorld";

str.substring(0, 5);
Result:
Hello
Because indices 0, 1, 2, 3, 4 are included.
For this problem:
str.substring(11, 13)
extracts:
Index:  11  12
         ↓   ↓
        [7] [5]
Result:
"75"
✦ Important Concept 2 — String to int
substring() gives us a String, but we need an integer to compare the age.
Java provides:
Integer.parseInt()
Example:
String ageString = "75";

int age = Integer.parseInt(ageString);
Now:
"75"  →  75
String   int
✦ Combining Both Concepts
We can extract the age and convert it to an integer in one line:
int age = Integer.parseInt(str.substring(11, 13));
This performs two operations:
String
  ↓
substring(11, 13)
  ↓
"75"
  ↓
Integer.parseInt()
  ↓
75
✦ Algorithm
1. Initialize count to 0.
2. Traverse every passenger in details.
3. Extract the age using substring(11, 13).
4. Convert the extracted String into an integer.
5. Check whether the age is greater than 60.
6. If yes, increment count.
7. Return count.
   
✦ Key Learning
This problem teaches a very useful pattern:
Extract → Convert → Compare → Count
It is especially useful when working with fixed-format Strings.

✦ Java Syntax to Remember
Extract part of a String
str.substring(start, end);
Convert String to int
Integer.parseInt(str);
Convert and extract together
Integer.parseInt(str.substring(11, 13));

✦ Complexity
Let n be the number of passengers.
Time Complexity: O(n)
We examine each passenger once.
Space Complexity: O(1)
Only a constant amount of extra space is used.

✦ Final Takeaway
A seemingly simple problem can teach useful fundamentals.
The most important line from today's problem:
int age = Integer.parseInt(str.substring(11, 13));

✦ substring() → extracts the required characters.
✦ Integer.parseInt() → converts the String into an integer.
✦ Together → we can directly process structured String data.
Small concept. Real problem. One more brick in the DSA foundation. ✦
