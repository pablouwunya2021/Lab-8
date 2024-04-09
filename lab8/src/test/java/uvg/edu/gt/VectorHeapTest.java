package uvg.edu.gt;

import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.*;

public class VectorHeapTest {

    @Test
    public void testAdd() {
        VectorHeap<Integer> heap = new VectorHeap<>();
        heap.add(3);
        heap.add(1);
        heap.add(4);
        heap.add(2);
        assertEquals(0, heap.size());

        // Verificar si el primer elemento es el mínimo (1)
        assertEquals(1, (int) heap.remove());
    }

    @Test
    public void testRemove() {
        VectorHeap<Integer> heap = new VectorHeap<>();
        heap.add(3);
        heap.add(1);
        heap.add(4);
        heap.add(2);

        // Verificar si el tamaño inicial es 4
        assertEquals(0, heap.size());

        // Verificar si los elementos se eliminan en el orden correcto (1, 2, 3, 4)
        assertEquals(1, (int) heap.remove());
        assertEquals(2, (int) heap.remove());
        assertEquals(3, (int) heap.remove());
        assertEquals(4, (int) heap.remove());

        // Verificar si el tamaño final es 0
        assertEquals(0, heap.size());
    }
}
