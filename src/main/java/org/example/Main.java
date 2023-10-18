package org.example;
import java.util.Scanner;

public class Main {



    class Node {

        Node left, right;
        int data;

        // красный ==> true, черный ==> false
        boolean color;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;

// Новый узел, который создается, является всегда красного цвета.
            color = true;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}