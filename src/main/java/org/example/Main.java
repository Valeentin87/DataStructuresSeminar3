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
        // Функция для проверки того, является ли узел красного цвета или нет.
        boolean isRed(Node myNode) {
            if (myNode == null) {
                return false;
            }
            return (myNode.color == true);
        }
        // Функция для изменения цвета двух узлы.
        void swapColors(Node node1, Node node2) {
            boolean temp = node1.color;
            node1.color = node2.color;
            node2.color = temp;
        }
        // вставка в левостороннее Красно-черное дерево.
        Node insert(Node myNode, int data) {
// Обычный код вставки для любого двоичного файла
            if (myNode == null) {
                return new Node(data);
            }

            if (data < myNode.data) {
                myNode.left = insert(myNode.left, data);
            } else if (data > myNode.data) {
                myNode.right = insert(myNode.right, data);
            } else {
                return myNode;
            }

            public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}