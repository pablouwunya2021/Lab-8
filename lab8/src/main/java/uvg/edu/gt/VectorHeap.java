package uvg.edu.gt;

import java.util.PriorityQueue;

class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E> {
    private E[] data;
    private int size;

    public VectorHeap() {

        data = (E[]) new Comparable[10];
        size = 0;
    }

    @Override
    public boolean add(E item) {
        if (size >= data.length) {
            resize();
        }
        data[size] = item;
        percolateUp(size);
        size++;
        return true;
    }

    private void resize() {
        E[] newData = (E[]) new Comparable[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (data[index].compareTo(data[parent]) < 0) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    @Override
    public E remove() {
        if (size == 0) {
            System.out.println("No hay pacientes en la cola para atender.");
            throw new IllegalStateException("Heap is empty");
        }
        E removed = data[0];
        data[0] = data[size - 1];
        data[size - 1] = null; // Limpiar el elemento eliminado
        size--;
        if (size > 0) {
            percolateDown(0);
        }
        return removed;
    }


    private void percolateDown(int index) {
        int child;
        E temp = data[index];
        while (2 * index + 1 < size) {
            child = 2 * index + 1;
            if (child < size - 1 && data[child].compareTo(data[child + 1]) > 0) {
                child++;
            }
            if (temp.compareTo(data[child]) > 0) {
                data[index] = data[child];
            } else {
                break;
            }
            index = child;
        }
        data[index] = temp;
    }

    // Métodos no implementados
    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}

