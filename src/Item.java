import java.time.LocalDate;
import java.util.Date;

/**
 * Criação de Itens no Sistema de Reserva de Itens.
 * Essa classe é a super classe das classes Higiene e Alimentos.
 * @author Rafael Ferraz
 * @version 1.0
 */
public class Item {
    // Atributos
    private String nome;
    private int quantidade;
    private double preco;
    private String marca;
    private Date validade;

    // Construtores
    public Item(){}
    public Item(String nome, int quantidade, double preco, String marca, Date validade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.marca = marca;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Date getValidade() {
        return this.validade;
    }
// Métodos

    /**
     * O método verifica se a marca do protuto se encaixa nas marcas dos parâmetro.
     * @param marcas
     * @return boolean
     */
    public boolean verificarEmpresasDoGrupo(String[] marcas){
        if(marcas == null){
            throw new NullPointerException();
        }
        for(String marca: marcas) {
            if(this.marca.equals(marca)){
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se a validade termina no dia atual e aplica um desconto no valor final
     * @return double
     */
    public double aplicarDesconto(){
        if(this.validade.equals(LocalDate.now().toString())){
            return this.preco * 0.02;
        }
        return this.preco;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", validade=" + validade +
                '}';
    }
}