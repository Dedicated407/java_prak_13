package ikbo.prak13;

public class LinkedQueue<E> implements Queue<E>{
    private java.util.Queue<E> linkedQueue;

    LinkedQueue() {
        linkedQueue = new java.util.LinkedList<>();
    }

    public boolean add(E e) {
        return linkedQueue.add(e);
    }

    public boolean offer(E element) { //этот метод возвращает true после успешной вставки элемента.
        return linkedQueue.offer(element);
    }

    public E remove() { // Этот метод удаляет единственный экземпляр указанного элемента из этой очереди, если он присутствует.
        return linkedQueue.remove();
    }

    public E poll() { //этот метод извлекает и удаляет заголовок этой очереди или возвращает ноль, если эта очередь пуста.
        return linkedQueue.poll();
    }

    public E element() { //Извлекает, но не удаляет, главу этой очереди. Этот метод отличается от peek только в том, что он выбрасывает исключение если эта очередь пуста.
        return linkedQueue.element();
    }

    public E peek() { // этот метод извлекает, но не удаляет заголовок этой очереди, или возвращает ноль, если эта очередь пуста
        return linkedQueue.peek();
    }


    public String toString() {
        return "LinkedQueue{" +
                "linkedQueue=" + linkedQueue +
                '}';
    }
}
