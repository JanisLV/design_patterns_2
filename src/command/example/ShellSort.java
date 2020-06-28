package command.example;

public class ShellSort implements CommandInterface {
    private int[] arr;

    public ShellSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void execute() {
        long timestamp = System.currentTimeMillis();
        System.out.println("Shell Sort");
        CommandInterface.printArray(arr, "Before");
        sort();
        CommandInterface.printArray(arr, "After");
        System.out.println("Shell Sort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");

    }

    public void sort() {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
    }
}
