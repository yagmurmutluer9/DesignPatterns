public class Demo {

    public static void main(String[] args) {

        String[][] items = {{"item1", "item2", "item3", "item4"},
                {"item5", "item6"},
                {"item7", "item8", "item9"}};

        Integer[][] items_int = {{1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}};

        ItemRepository<String> itemIterator = new ItemRepository(items);
        ItemRepository<Integer> intIterator = new ItemRepository(items_int);

        System.out.println("Displaying String Items:");
        itemIterator.display(itemIterator);
        System.out.println();
        System.out.println("Displaying Integer Items:");
        intIterator.display(intIterator);


    }
}