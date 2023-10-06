/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certifico_quiz_3;

/**
 *
 * @author khian
 */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Node1 {
    int data;
    Node next;
    Node prev;

    public Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class nNode1 {
    Node front;
    Node rear;

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    
    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int deleteFront() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1; 
            int data = front.data;
            front = front.next;
            if (front != null) {
                front.prev = null;
            } else {
                rear = null; 
            }
            return data;
        }
    }


    public int deleteRear() {
        if (rear == null) {
            System.out.println("Queue is empty.");
            return -1; 
        } else {
            int data = rear.data;
            rear = rear.prev;
            if (rear != null) {
                rear.next = null;
            } else {
                front = null;
            }
            return data;
        }
    }


    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Certifico_Quiz_3 {      
    public static void main(String[] args) throws Exception {
        
        Certifico_Quiz_3 list = new Certifico_Quiz_3();
            Scanner scn = new Scanner(System.in);
                boolean start = true;
                
                while(start){
                    System.out.println("MENU");
                        System.out.println("[1] Number 1 ");
                            System.out.println("[2] Number 2");
                                System.out.println("[3] Exit");
                                
                int choice = scn.nextInt();
                
                switch (choice){
                    case 1:
                     Queue<Integer> number1 = new LinkedList<>();
                          for(int i = 1; i <= 9; i++){
                                number1.offer(i);
                    }
                            System.out.println("-----------------------------------------------------------------");
                                System.out.println("Write a program to create a linear queue containing nine elements");
                                    System.out.println("-----------------------------------------------------------------");
        
                                while (!number1.isEmpty()) {            
                                    int Element = number1.poll();
                                        System.out.println(Element + " ");
                    break;
                    }       
                    case 2:
                            nNode deque = new nNode();
                           Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
                System.out.println("1. Insert at front");
                    System.out.println("2. Insert at rear");
                        System.out.println("3. Delete from front");
                            System.out.println("4. Delete from rear");
                                System.out.println("5. Display");
                                    System.out.println("6. Exit");

            int choice1 = scanner.nextInt();

            switch (choice1) {
                case 1:
                    System.out.print("Enter element to insert at front: ");
                        int frontElement = scanner.nextInt();
                            deque.insertFront(frontElement);
                    break;
                case 2:
                    System.out.print("Enter element to insert at rear: ");
                        int rearElement = scanner.nextInt();
                            deque.insertRear(rearElement);
                    break;
                case 3:
                    int frontDeleted = deque.deleteFront();
                        System.out.println("Front element deleted: " + frontDeleted);
                    break;
                case 4:
                    int rearDeleted = deque.deleteRear();
                        System.out.println("Rear element deleted: " + rearDeleted);
                    break;
                case 5:
                    System.out.print("Queue: ");
                        deque.display();
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Thak you Sir");
                        System.exit(0);
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
                    case 3:
                    scn.close();
                        System.out.println("Thank you Sir");
                            System.exit(0);

                    break;
                    default:
                        System.out.println("Try Again");

                }
                }
}
}
