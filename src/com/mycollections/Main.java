/**
 *  Java program to values from a list that are divisible by 3.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create a list with numbers.
        List<Integer> numbers = new ArrayList<>();

        // Adding values to a list.
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(8);

        // Printing numbers divisible by 3.
        numbers.stream()
                .filter(val -> val % 3 == 0)
                .forEach(val -> System.out.println(val));

    }
}