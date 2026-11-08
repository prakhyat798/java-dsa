public class QueueUsingArray {
    int[] queue = new int[5];
    int front = 0, rear = 0, size = 0;

    void add(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
    }

    void remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.add(5);
        q.add(10);
        q.add(15);
        q.display();
        q.remove();
        q.add(20);
        q.display();
    }
}
