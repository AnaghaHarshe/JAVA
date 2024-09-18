import java.util.LinkedList;
import java.util.Scanner;

interface Stack {
    void push(int item);
    int pop();
    int peek();
    boolean isEmpty();
    int size();
}

interface Queue {
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    int size();
}

class DualADT implements Stack, Queue {
    private LinkedList<Integer> stackList;
    private LinkedList<Integer> queueList;

    public DualADT() {
        stackList = new LinkedList<>();
        queueList = new LinkedList<>();
    }

    @Override
    public void push(int item) {
        stackList.addFirst(item);
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.removeFirst();
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.getFirst();
    }

    @Override
    public void enqueue(int item) {
        queueList.addLast(item);
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueList.removeFirst();
    }

     @Override
    public boolean isEmpty() {
        return stackList.isEmpty() && queueList.isEmpty();
    }

    @Override
    public int size() {
        return stackList.size() + queueList.size();
    }

    public void displayStack() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + stackList.toString());
        }
    }

    public void displayQueue() {
        if (queueList.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements: " + queueList.toString());
        }
    }

    public static void main(String[] args) {
        DualADT dualADT = new DualADT();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to use as Stack, 2 to use as Queue, or 0 to exit:");

        int choice;
        do {
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                  
                    System.out.println("Stack Operations:");
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Peek");
                    System.out.println("4. Display Stack");
                    System.out.println("0. Exit");

                    int stackChoice;
                    do {
                        System.out.print("Stack Choice: ");
                        stackChoice = scanner.nextInt();

                        switch (stackChoice) {
                            case 1:
                                System.out.print("Enter an integer to push onto the stack: ");
                                int pushValue = scanner.nextInt();
                                dualADT.push(pushValue);
                                break;

                            case 2:
                                try {
                                    int poppedValue = dualADT.pop();
                                    System.out.println("Popped value from the stack: " + poppedValue);
                                } catch (IllegalStateException e) {
                                    System.out.println("Stack is empty. Cannot pop.");
                                }
                                break;

                            case 3:
                                try {
                                    int peekedValue = dualADT.peek();
                                    System.out.println("Peeked value from the stack: " + peekedValue);
                                } catch (IllegalStateException e) {
                                    System.out.println("Stack is empty. Cannot peek.");
                                }
                                break;

                            case 4:
                                dualADT.displayStack();
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Invalid choice. Please enter 1, 2, 3, 4, or 0.");
                        }

                    } while (stackChoice != 0);
                    break;

                case 2:
                    
                    System.out.println("Queue Operations:");
                    System.out.println("1. Enqueue");
                    System.out.println("2. Dequeue");
                    System.out.println("3. Peek");
                    System.out.println("4. Display Queue");
                    System.out.println("0. Exit");

                    int queueChoice;
                    do {
                        System.out.print("Queue Choice: ");
                        queueChoice = scanner.nextInt();

                        switch (queueChoice) {
                            case 1:
                                System.out.print("Enter an integer to enqueue into the queue: ");
                                int enqueueValue = scanner.nextInt();
                                dualADT.enqueue(enqueueValue);
                                break;

                            case 2:
                                try {
                                    int dequeuedValue = dualADT.dequeue();
                                    System.out.println("Dequeued value from the queue: " + dequeuedValue);
                                } catch (IllegalStateException e) {
                                    System.out.println("Queue is empty. Cannot dequeue.");
                                }
                                break;

                            case 3:
                                try {
                                    int peekedValue = dualADT.peek();
                                    System.out.println("Peeked value from the queue: " + peekedValue);
                                } catch (IllegalStateException e) {
                                    System.out.println("Queue is empty. Cannot peek.");
                                }
                                break;

                            case 4:
                                dualADT.displayQueue();
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Invalid choice. Please enter 1, 2, 3, 4, or 0.");
                        }

                    } while (queueChoice != 0);
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 0.");
            }

        } while (choice != 0);

        scanner.close();
    }
}