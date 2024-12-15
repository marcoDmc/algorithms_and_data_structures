
import BinarySearch.BinarySearch;
import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import LinkedList.Lista.ListaLigada;

public class Program {

    public static void main(String[] args) {
        // LINKED LIST
        ListaLigada Lista = new ListaLigada();
        Lista.adicionar("flamengo");
        Lista.adicionar("vasco");
        Lista.adicionar("fluminense");
        Lista.adicionar("botafogo");

        String primeiro = Lista.getComeco();
        String ultimo = Lista.getFinals();

        System.out.println("Primeiro: " + primeiro);
        System.out.println("��ltimo: " + ultimo);
        System.out.println("tamanho: " + Lista.getTamanho());
        // ############################################################
        // BINARY SEARCH

        BinarySearch Binary = new BinarySearch();
        int target = 1;
        int[] vetor = new int[]{1, 2, 3, 4, 5};
        int result = Binary.Search(vetor, target);
        System.out.println("result: " + result);

        // ###########################################################
        // BUBBLE SORT
        BubbleSort bubble = new BubbleSort();
        int[] arra = {64, 34, 25, 12, 22, 11, 90};
        int[] array = bubble.Bubble(arra);
        System.out.println("Array sorted in ascending order:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // ##########################################################
        // INSERTION SORT
        InsertionSort insertion = new InsertionSort();
        int[] ins = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] res = insertion.insertionSort(ins);

        for (int i = 0; i < res.length; i++) {
            System.out.println(i);

        }

    }

}
