package LinkedList.Elemento;

public class Elemento {

    private Elemento proximo;
    private String valor;

    public Elemento(String valor, Elemento proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
