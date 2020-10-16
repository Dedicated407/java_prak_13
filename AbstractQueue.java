package ikbo.prak13;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected java.util.Queue<E> linkedQueue;

    AbstractQueue() {
        linkedQueue = new java.util.LinkedList<>();
    }

    public E element() {
        return linkedQueue.element();
    }

    public E peek() {
        return linkedQueue.peek();
    }

    public E remove() {
        return linkedQueue.remove();
    }

}
/*6	Выделите общие части классов LinkedQueue и ArrayQueue в базовый класс AbstractQueue.*/