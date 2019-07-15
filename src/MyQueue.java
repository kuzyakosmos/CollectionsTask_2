import java.util.ArrayDeque;

/**
 * Необходимо реализовать коллекцию, которая имеет фиксированный размер. Размер задаётся:
 * - По умолчанию 16
 * - По указанию пользователя.
 * Размер коллекции после инициализации меняться не может.
 * Каждый новый элемент добавляется в конец.
 * После того, как количество элементов достигло максимума -
 * при добавлении нового элемента коллекция "сдвигается" влево.
 * 1-й элемент удаляется, а каждый следующий смещается на один элемент влево.
 */

public class MyQueue<E> {

    ArrayDeque<E> queue;

    private int size;

    public MyQueue() {
        this.queue = new ArrayDeque<>(16);
        this.size = 16;
    }

    public MyQueue(int size) {
        this.queue = new ArrayDeque<>(size);
        this.size = size;
    }

    public boolean add(E value) {
        queue.add(value);
        return true;
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public int size() {
        return queue.size();
    }
}
