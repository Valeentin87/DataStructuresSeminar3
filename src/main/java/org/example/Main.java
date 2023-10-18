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

    public class BinaryRedBlackTree {

        private static Node root = null;

        // Функция для поворота узла против часовой стрелки.
        Node rotateLeft(Node myNode) {
            System.out.printf("поворот влево!!\n");
            Node child = myNode.right;
            Node childLeft = child.left;

            child.left = myNode;
            myNode.right = childLeft;

            return child;
        }

        // Функция для поворота узла по часовой стрелке.
        Node rotateRight(Node myNode) {
            System.out.printf("вращение вправо\n");
            Node child = myNode.left;
            Node childRight = child.right;

            child.right = myNode;
            myNode.left = childRight;

            return child;
        }

        public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}