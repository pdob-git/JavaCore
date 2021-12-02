public class ArraySorter {

    public static void main(String[] args) {
        int[] array = {6, 30, 40, 100, 300, 235, 90 ,214, 1};

        printArray(array);
        System.out.println();

        Sortable sortable = new Sortable() {
            @Override
            public void sort(int[] array) {

                for (int i = 0; i < array.length; i++) {
                    for (int j = 1; j < array.length - i; j++) {
                        if (array[j-1] > array[j]) {
                            int temp = array[j];
                            array[j] = array[j-1];
                            array[j-1] = temp;
                        }
                    }
                }

            }
        };

        sortable.sort(array);
        printArray(array);

    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
