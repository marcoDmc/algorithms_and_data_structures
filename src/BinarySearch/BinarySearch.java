package BinarySearch;

public class BinarySearch {

    public int Search(int[] vetor, int target) {
        int head = 0;
        int tail = vetor.length - 1;
        while (tail >= head) {
            int middle = head + (tail - head) / 2;
            int valueMiddle = vetor[middle];

            if (valueMiddle == target) {
                return middle;
            } else if (valueMiddle > target) {
                tail = middle - 1;
            } else {
                head = middle + 1;
            }
        }

        return -1;
    }

}
