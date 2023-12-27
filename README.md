# Java Stack and Queue Simulator

## Overview
This Java application is designed to simulate the operations of a stack and a queue using a custom linked list implementation. The project is based on the `LinkedList206` class structure from the CIS 206 class taught by [Geoffrey Draper](https://about.byuh.edu/geoffrey-draper) and is intended for educational purposes to demonstrate the manipulation and improvement of existing code.

## Features
- **Custom Stack Implementation**: Utilizes a custom linked list to simulate stack operations such as push, pop, clear, and print.
- **Custom Queue Implementation**: Adapts the linked list to function as a queue with enqueue, dequeue, clear, and print operations.
- **Standard Input Parsing**: Parses commands and data from standard input (System.in).

## How to Use
### Stack Operations:
- `PUSH n`: Pushes "n" onto the top of the stack.
- `POP`: Removes and prints the top item of the stack. Prints "empty" if the stack is empty.
- `CLEAR`: Clears the stack.
- `PRINT`: Prints the current stack contents.

### Queue Operations:
- `ENQUEUE n`: Adds "n" to the tail of the queue.
- `DEQUEUE`: Removes and prints the item from the head of the queue. Prints "empty" if the queue is empty.
- `CLEAR`: Clears the queue.
- `PRINT`: Prints the current queue contents.

### Ending Input:
- Input ends with a line containing three asterisks `***`.

## Example for Stacks
Input:  
>PUSH 5  
>PUSH 10  
>PUSH 7  
>PUSH 90  
>POP  
>POP  
>PRINT  
>CLEAR  
>POP  
>PUSH 3  
>PUSH 67  
>POP  
>PUSH 22  
>POP  
>POP  
>POP  
>***  

Output:  
>90  
>7  
>5  
>10  
>empty  
>67  
>22  
>3  
>empty  

Sample input files (`stack1.txt`, `stack2.txt`, `stack3.txt`) and their expected outputs are available for testing.

## Example for Queues
Input:  
ENQUEUE 5  
ENQUEUE 10  
ENQUEUE 7  
ENQUEUE 90  
DEQUEUE  
DEQUEUE  
PRINT  
CLEAR  
DEQUEUE  
ENQUEUE 3  
ENQUEUE 67  
DEQUEUE  
ENQUEUE 22  
DEQUEUE  
DEQUEUE  
DEQUEUE  
***  

Output:  
5  
10  
7  
90  
empty  
3  
67  
22  
empty  

Sample input files (`queue1.txt`, `queue2.txt`, `queue3.txt`...) and their expected outputs are available for testing.

## Classes and Methods
- `Stack<T>`: Generic stack class with methods for stack operations.
- `Queue<T>`: Generic queue class with methods for queue operations.
- `CustomLinkedList<T>`: Custom implementation of a singly linked list used by both stack and queue.
- `Node<T>`: Represents a single element in the linked list.

## Contributing
Contributions to improve the code or add new features are welcome. Please ensure to follow the existing coding style.
