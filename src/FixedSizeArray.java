import java.util.ArrayList;

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

public class FixedSizeArray<E> {

    ArrayList<E> array;

    private int size;

    public FixedSizeArray() {
        this.array = new ArrayList(16);
        this.size = 16;
    }

    public FixedSizeArray(int size) {
        this.array = new ArrayList(size);
        this.size = size;
    }

    public boolean add(E value) {
        array.add(value);

        if (array.size() > this.size) {
            array.remove(1);
        }
        return true;
    }

    @Override
    public String toString() {
        return array.toString();
    }

    public int size() {
        return array.size();
    }
}
