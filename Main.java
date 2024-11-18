import java.util.Scanner;

public class Main
{

    public static void printNTimes(String word, int N)
    {
        for (int curr_index = 0; curr_index < word.length(); curr_index++)
        {
            for (int curr_print = 0; curr_print < N; curr_print++)
            {
                String letter = word.substring(curr_index, curr_index + 1);
                System.out.print(letter);
            }
        }
        System.out.println(); // Ensure a newline at the end.
    }

    public static void printNums()
    {
        for (int curr_num = 10; curr_num > 0; curr_num--)
        {
            for (int print_num = 0; print_num < curr_num; print_num++)
            {
                System.out.print(curr_num + " ");
            }
            System.out.println(); // Move to the next line after printing the current number.
        }
    }

    public static void uprightNumberTriangle(int N)
    {
        for (int row = 1; row <= N; row++) {
            for (int curr_num = 1; curr_num <= row; curr_num++)
            {
                System.out.print(curr_num + " ");
            }
            System.out.println(); // Move to the next line after printing the current row.
        }
    }

    public static void starTree(int height)
    {
        for (int row = 0; row < height; row++)
        {
            for (int space_count = 0; space_count < row; space_count++)
            {
                System.out.print(" "); // Print spaces to align the stars.
            }

            for (int star_count = row; star_count < height; star_count++)
            {
                System.out.print("* "); // Print stars.
            }

            System.out.println(); // Move to the next line after each row.
        }
    }

    public static void multTable()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(i * j + "\t"); // Multiply and print each value with a tab space.
            }
            System.out.println(); // Move to the next line after each row.
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Problem 1
        System.out.print("Enter a string and a number for printNTimes: ");
        String word = scanner.next();
        int n = scanner.nextInt();
        printNTimes(word, n);

        // Problem 2
        System.out.println("\nProblem 2: PrintNums");
        printNums();

        // Problem 3
        System.out.print("\nEnter a number for uprightNumberTriangle: ");
        int num = scanner.nextInt();
        uprightNumberTriangle(num);

        // Problem 4
        System.out.print("\nEnter a height for the star tree: ");
        int height = scanner.nextInt();
        starTree(height);

        // Problem 5
        System.out.println("\nProblem 5: Multiplication Table");
        multTable();
    }
}
