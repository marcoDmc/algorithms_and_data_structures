package LinkedList.Lista;

import LinkedList.Elemento.Elemento;

public class ListaLigada {

    private Elemento comeco;
    private Elemento finals;
    private int tamanho;

    public void adicionar(String valor) {
        Elemento novo = new Elemento(valor, null);

        if (comeco == null) {
            comeco = novo;
            finals = novo;
        } else {
            finals.setProximo(novo);
            finals = novo;
        }
        this.tamanho++;
    }

    public String getFinals() {
        return finals.getValor();
    }

    public void setFinals(Elemento finals) {
        this.finals = finals;
    }

    public String getComeco() {
        return comeco.getValor();
    }

    public void setComeco(Elemento comeco) {
        this.comeco = comeco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public ListaLigada() {
    }

    public ListaLigada(Elemento comeco, Elemento finals, int tamanho) {
        this.comeco = comeco;
        this.finals = finals;
        this.tamanho = tamanho;
    }
}
