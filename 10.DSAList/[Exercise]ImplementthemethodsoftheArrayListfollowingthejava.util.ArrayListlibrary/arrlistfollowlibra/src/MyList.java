import java.util.Arrays;
import java.util.PrimitiveIterator;

public class MyList<Elemnets> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Elemnets[] data;

    public MyList() {
        data = (Elemnets[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        data = (Elemnets[]) new Object[size];
    }

    private void ensureCapacity() {
        if (size > data.length) {
            int biggerSize = size * 2 + 1;
            data = Arrays.copyOf(data, biggerSize);
        }
    }

    public void add(Elemnets elemnets) {
        size += 1;
        ensureCapacity();
        data[size - 1] = elemnets;
    }

    public boolean add(Elemnets elemnets, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapacity();
            for (int i = size -2; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = elemnets;
            return true;
        }
        return false;
    }

    public Elemnets get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    @Override
    public MyList clone() {
        MyList<Elemnets> clone = new MyList<>(data.length);
        for (Elemnets x : data) {
            clone.add(x);
        }
        return clone;
    }

    public Elemnets[] getData() {
        return this.data;
    }

    public int size() {
        return size;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    public void clear() {
        data = (Elemnets[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(Elemnets elemnets) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(elemnets)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Elemnets elemnets) {
        for (Elemnets x : data) {
            if (elemnets.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
