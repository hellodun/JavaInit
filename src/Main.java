import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // WHILE loop
    public static void whileLoop() {
        int num = 0;

        while(num <= 5) {
            System.out.println("Repeate count " + num );
            num++;
        }
    }

    // Exercise: User to input a number less than 10
    public static void userNum() {
        // Get user number
        Scanner newNum = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userNumber = newNum.nextInt();

        while (userNumber < 1 || userNumber > 10) {
            System.out.print(userNumber + " is not between 1 and 10. Try again");
            userNumber = newNum.nextInt();
        }
        System.out.println(userNumber + " is between 1 and 10. Thanks");
    }

    // DO WHILE Loop

    public static void doWhileLoop() {
        /*
        declare variable
        do
          statement
        while (condition)
        */

        int ten = 0;
        do {
            System.out.println("This ran " + ten + " times");
            ten++;

        } while( ten <= 10 );

        /*
        int i = 1;
        do {
            System.out.println("hello " + i);
            i++;
        } while(i <= 3);
         */
    }

    // For Loop
    public static void forLoop() {
        /*
        for(variable; condition; change) {
            // Statement
        }
         */

        for(int i = 1; i <=5; i++) {
            System.out.println("Print " + i + " times" );
        }
    }

    // Nested Loop

    public static void nestedLoop() {
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }

        /*
        Iteration 1: i = 0 j = 0
        Iteration 2: i = 0 j = 1

        Iteration 3: i = 1 j = 0
        Iteration 4: i = 1 j = 1

        Iteration 5: i = 2 j = 0
        Iteration 6: i = 2 j = 1
         */

        for(int i = 1; i <= 2; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print((j * i) + " ");
            }
            System.out.println();
        }
    }

    // Exercise 1
    public static void exercise1() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            continue;
        }
    }

    // Exercise 2
    public static void exercise2() {
        /*
        Get and store number from user
        Add number to new num from user
        check if sum > 100
        if true print "Done and stop taking nums from user
         */

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sum < 100) {
            System.out.println("Enter num...");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("Done");
    }

    // Exercise 3
    public static void exercise3() {
        /*
        X <= N/2
        if N%i = 0, i is a divisor of N
         */

        /*
        Given no. 10 ==> divisors are 5, 2, 1

        start from 1 up to N/2
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number...");

        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if(num%i == 0) {
                sum = sum + i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Sum - strict divisors= " + sum);
        System.out.println("Sum - all divisors= " + (sum + num));
    }

    // Exercise 4
    public static void exercise4() {
        /*
        N should be positive
        Output true if N is a prime number
        NB: N is a Prime Number if its divisors are only 1 and N
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive int...");
        int num = sc.nextInt();

        int sum = 0;
        if(num - (-num) == 0){
            for(int i = 1; i <= num/2; i++) {
                if(num%i == 0) {
                    sum = sum + i;
                }
            }
            if(sum == 1) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        } else {
            System.out.println("You entered a negative int...");

        }
    }

    public static void exercise4a() {
        /*
        N should be positive
        Output true if N is a prime number
        NB: N is a Prime Number if its divisors are only 1 and N
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive int...");
        int num = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <= num/2; i++) {
            if(num%i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not prime");
    }

    // Exercise 5
    public static void exercise5() {

    }


    // Arrays in JAVA
    /*
    Arrays in Java are Reference types just like Stings
     */
    public static void arrays() {
        String[] vowels = new String[5];

        vowels[0] = "a";
        vowels[1] = "e";
        vowels[2] = "i";
        vowels[3] = "o";
        vowels[4] = "u";

        String[] names = { "Dun", "Jane", "Liz", "Victor", "John"};

        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

//        System.out.println(vowels[3]);
        /*
        for (int i = 0; i < vowels.length; i++) {
            System.out.print(vowels[i] + " ");
        }
         */
    }

    public static void main(String[] args) {
        // whileLoop();
        // userNum();
        // doWhileLoop();
        // forLoop();
        // nestedLoop();
        // exercise1();
        // exercise2();
        // exercise3();
        // exercise4();
        // exercise4a();

        arrays();
    }
}