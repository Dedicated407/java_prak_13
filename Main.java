package ikbo.prak13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 4 значения: ");
        for (int i = 0; i < 4; i++) {
            linkedQueue.add(scan.nextInt());
        }
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.offer(scan.nextInt()));
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.remove());
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.poll());
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.element());
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.peek());
        System.out.println(linkedQueue);
    }
}
/*
Задание 2. Очереди
4	Определите интерфейс очереди Queue и опишите его контракт.(что такое контракт даже препод не знает, рофл)
5	Реализуйте класс LinkedQueue — очередь на связном списке.
6	Выделите общие части классов LinkedQueue и ArrayQueue в базовый класс AbstractQueue.
*/