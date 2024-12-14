package BubbleSort;

public class BubbleSort {

    public int[] Bubble(int[] vetor) {

        int aux;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }

        }
        return vetor;
    }
}
