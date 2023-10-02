public class MyArrayList {
    public int[] getData() {
        return data;
    }

    private int[] data;
    private int size=0;


    public MyArrayList() {
        data = new int[10];
    }

    public MyArrayList(int[]array) {

    }
    public MyArrayList(int initialCapacity) {
        data = new int[initialCapacity];
    }



//карочь тут проверка на хватку места  для добавление новых элементов
    // Если массив полон,то он размер удваивает
    private void ensureCapacity() {
        if (size == data.length) {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }


    public void add(int value) {
        ensureCapacity();
        data[size++] = value;
    }

    public void add(int value,int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        ensureCapacity();
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = value;
        size++;
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }


    public int size() {
        return size;
    }

// Сами это просили добавить
    public int get(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("Index: " + index);
//        }
        return data[index];
    }
    public void clear() {
        size = 0;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        data[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("["); //начало масива
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]"); // конец масива string builder
        return sb.toString();
    }
}
