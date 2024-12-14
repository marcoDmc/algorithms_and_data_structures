
import BinarySearch.BinarySearch;
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
    }
}
