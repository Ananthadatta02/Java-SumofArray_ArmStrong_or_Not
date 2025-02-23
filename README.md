# Sum of Array & Armstrong Number Checker

## Description
This Java program performs two main functions:
1. It calculates the sum of elements in an array entered by the user.
2. It checks whether the sum of the array is an Armstrong number.

An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because:
```
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
```

## How the Program Works
1. The program takes user input for the size of the array.
2. It asks the user to input the array elements.
3. It calculates the sum of all elements in the array.
4. It checks whether the sum is an Armstrong number by:
   - Counting the number of digits in the sum.
   - Raising each digit to the power of the number of digits.
   - Summing the results and comparing them with the original sum.
5. It prints whether the sum is an Armstrong number or not.

## Code Explanation

### Variables Used:
- **size**: Stores the number of elements in the array.
- **arr[]**: Stores the array elements entered by the user.
- **sum**: Stores the sum of all elements in the array.
- **temp**: A temporary variable used to count the number of digits in the sum.
- **temp2**: A copy of the sum used to check for the Armstrong number condition.
- **count**: Stores the number of digits in the sum.
- **value**: Stores the computed sum when checking for an Armstrong number.

### For Loops:
- The first `for` loop reads input elements into the array.
- The second `for` loop calculates the sum of the array elements.
- The `for` loop in the `power()` method calculates exponentiation.

### While Loops:
- The first `while` loop counts the number of digits in `sum`.
- The second `while` loop extracts each digit, raises it to the power of `count`, and accumulates the sum to check if it's an Armstrong number.

### If Condition:
- If the computed sum (`value`) is equal to the original sum, it prints "Armstrong Number"; otherwise, it prints "Not Armstrong Number".

### `power()` Method:
This method calculates the exponentiation of a number using a loop instead of `Math.pow()`. It multiplies `base` by itself `power` times.

## Sample Input/Output
### Example 1:
**Input:**
```
Enter the Array Size: 3
Enter the Elements: 1 5 3
```
**Processing:**
```
Sum of Array: 9
9 has 1 digit
9^1 = 9
9 == 9 → Armstrong Number
```
**Output:**
```
Sum of Array: 9
Armstrong Number
```

### Example 2:
**Input:**
```
Enter the Array Size: 4
Enter the Elements: 1 2 3 4
```
**Processing:**
```
Sum of Array: 10
10 has 2 digits
1^2 + 0^2 = 1 + 0 = 1
1 != 10 → Not Armstrong Number
```
**Output:**
```
Sum of Array: 10
Not Armstrong Number
```

## How to Run the Program
1. Clone the repository:
   ```sh
   git clone https://github.com/Ananthadatta02/Java-SumofArray_ArmStrong_or_Not.git
   ```
