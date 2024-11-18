[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17201400)
# unit-4-5-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since the shape classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Problem 1 - PrintNTimes

Write code that takes a user input of a String and an integer. The code should print each letter of the String the n number of times, where n is the integer input from the user.

**Sample run:**
```
printNTimes("code", 3) results in
cccooodddeee
```

# Problem 2 - PrintNums

Write code which prints every number from 10 to 1 a number of times equal to the number itself (e.g. ten 10’s, nine 9's...). Every individual number printed should be separated by a space, and there should be a new line each time the number changes. You should use nested loops to produce your output (it will result in far less code).

**Partial sample run:**
```
10 10 10 10 10 10 10 10 10 10
9 9 9 9 9 9 9 9 9
8 8 8 8 8 8 8 8
........
```

# Problem 3 - UprightNumberTriangle
In this program, ask the user to enter a number.
Print an upright number tree from 1 to the number the user inputted.

**Sample Run**
```
Input a number: 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

# Problem 4 - StarTree
In this program, you need to make an upside-down tree that contains stars *. After all, in computer science, trees have the root at the top and leaves at the bottom!

Your output should look like:
```
* * * * * * * * * 
 * * * * * * * * 
  * * * * * * * 
   * * * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 
```
**Hint:** You will need to create a variable that controls how far the * is from edge of the console. That variable should change size each iteration through the outer loop!

**Challenge:** Modify your program so that it asks for the height of your tree
and prints a tree of that height.

# Problem 5 - MultTable
In this program, you need to make a multiplication table. Your output should look like:
```
1  2  3  4  5  6  7  8  9  10  
2  4  6  8  10  12  14  16  18  20  
3  6  9  12  15  18  21  24  27  30  
4  8  12  16  20  24  28  32  36  40  
5  10  15  20  25  30  35  40  45  50  
6  12  18  24  30  36  42  48  54  60  
7  14  21  28  35  42  49  56  63  70  
8  16  24  32  40  48  56  64  72  80  
9  18  27  36  45  54  63  72  81  90  
10  20  30  40  50  60  70  80  90  100
```

## Sample Solutions
```java
public static void printNTimes(String word, int N)
{
  for (int curr_index = 0; curr_index < word.length(); curr_index++)
  {
    for (int curr_print = 0; curr_print < N; curr_print++)
    {
      String letter = word.substring(curr_index, curr_index+1);
      System.out.print(letter);
    }
  }
}

public static void printNums()
{
  for (int curr_num = 10; curr_num > 0; curr_num--)
  {
    for (int print_num = 0; print_num < curr_num; print_num++)
    {
      System.out.print(curr_num + " ");
    }
    System.out.println();
  }
}

public static void uprightNumberTriangle(int N)
{
  for (int row = 1; row <= N; row++)
  {
    for (int curr_num = 1; curr_num <= row; curr_num++)
    {
      System.out.print(curr_num + " ");
    }
    System.out.println();
  }
}

public static void starTree()
{
  for (int row = 0; row < 9; row++)
  {
    for (int space_count = 0; space_count < row; space_count++)
    {
      System.out.print(" ");
    }

    for (int star_count = row; star_count < 9; star_count++)
    {
      System.out.print("* ");
    }
    System.out.println();
  }
}

```
