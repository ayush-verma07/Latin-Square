# Latin-Square

This question involves reasoning about arrays of integers. You will write four static methods, all of which are in a class named ArrayTester.

**Part A:
**
Write a static method getColumn, which returns a one-dimensional array containing the elements of a single column in a two-dimensional array. The elements in the returned array should be in the same order as they appear in the given column. The notation arr2D[r][c] represents the array element at row r and column c.

The following code segment initializes an array and calls the getColumn method.

int, open bracket, close bracket, open bracket, close bracket, a r r 2 D equals left brace, left brace, 0, comma 1, comma 2, right brace, comma left brace, 3, comma 4, comma 5, right brace, comma left brace, 6, comma 7 , comma 8, right brace, comma left brace, 9, comma 5, comma 3, right brace, right brace, semicolon int, open bracket, close bracket, result equals Array Tester dot get Column, open parenthesis, a r r 2 D comma 1, close parenthesis, semicolon

When the code segment has completed execution, the variable result will have the following contents.

result, colon, left brace, 1, comma 4, comma 7, comma 5, right brace

**Part B:**

Complete the static method hasAllValues that will compare 2 arrays.  It will return true if and only if every value in one array is in the second array.  The arrays are the same length.

Example 1

int[] arr1 = {1, 2, 3}

int[] arr2 = {2, 3, 1}

System.out.println(ArrayTester.hasAllValues(arr1, arr2);

Output: true

Example 2

int[] arr1 = {1, 2, 3}

int[] arr2 = {2, 1, 1}

System.out.println(ArrayTester.hasAllValues(arr1, arr2));

Output: false

**Part C:**

Complete the static method containsDuplicates. This method will return true if the array has duplicate values.

Example 1:

int[] arr = {1, 2, 3};

System.out.println(ArrayTester.containsDuplicates(arr));

Output: false

Example 2

int[] arr = {1, 1, 3};

System.out.println(ArrayTester.containsDuplicates(arr));

Output: true

**Part D**

Write the static method isLatin, which returns true if a given two-dimensional square array is a Latin square, and otherwise, returns false.

You may utilize methods written in this class.

A two-dimensional square array of integers is a Latin square if the following conditions are true.

• The first row has no duplicate values.

• All values in the first row of the square appear in each row of the square.

• All values in the first row of the square appear in each column of the square.

