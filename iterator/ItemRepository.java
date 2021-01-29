import java.util.Iterator;


public class ItemRepository<T> implements Iterator<T> {

    T[][] Items;
    int currentRow = 0;
    int currentColumn = 0;

    public ItemRepository(T[][] arr) {
        Items = arr;
    }


    @Override
    public boolean hasNext() {
        if ((currentRow + 1) == Items.length) {
            return currentColumn < Items[currentRow].length;
        } else {
            return currentRow < Items.length;
        }
    }

    @Override
    public T next() {
        if (currentColumn == Items[currentRow].length) {
            currentColumn = 0;
            currentRow++;
        }

        return Items[currentRow][currentColumn++];
    }

    public void display(ItemRepository<T> itemIterator) {
        while (itemIterator.hasNext()) {
            T item = itemIterator.next();
            System.out.print(item + " ");
        }

    }
}




