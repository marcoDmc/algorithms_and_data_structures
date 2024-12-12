
import BinarySearch.BinarySearch;

public class Program {

    public static void main(String[] args) {
        
        BinarySearch Binary = new BinarySearch();
        
        int target = 1;
        int[] vetor = new int[]{1, 2, 3, 4, 5};
        int result = Binary.Search(vetor, target);

        System.out.println("result: " + result);

    }
}
