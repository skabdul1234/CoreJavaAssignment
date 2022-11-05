package com.jala.loops;

/* The Java do-while loop is used to iterate a part of
    the program repeatedly, until the specified condition is true. */
public class PrintingNumbersDoWhile {
    public static void main(String[] args) {

        int i = 1;
        /* The Java do-while loop is executed at least once because
        condition is checked after loop body. */
        do {
            System.out.print(i + " ");
            i++;
        }
        /* Therefore, unlike while loop and for loop, the do-while
        checks the condition at the end of loop body */
        while (i <= 10);
    }
}