import java.util.*;

public class Carrinho {
    // Atributos
    private List<Item> itens;

    private double valorFinal;

    // To string
    @Override
    public String toString() {
        return "Carrinho{" +
                "itens=" + itens +
                ", valorFinal=" + valorFinal +
                '}';
    }

    // Constructor
    public Carrinho(List<Item> itens) {
        this.itens = itens;
    }

    // Getters and Setters
    public List<Item> getItens() {
        return itens;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    // Calcula o valor final com base nos produtos do carrinho
    public double calculaValorFinal(){
        this.valorFinal = 0;

        for (Item item : itens) {
            this.valorFinal += item.getPreco() * item.getQuantidade();
        }

        return this.valorFinal;
    }

    // Adiciona um item ao carrinho após a inicialização da classe
    public void adicionaCarrinho(Item item){
        itens.add(item);
    }
}