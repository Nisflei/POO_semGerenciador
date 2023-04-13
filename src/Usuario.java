import java.time.LocalDate;

public class Usuario {
    //Atributos
    private String nome;
    private String data_cadastro;
    private Carrinho carrinho;

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", data_cadastro='" + data_cadastro + '\'' +
                ", carrinho=" + carrinho +
                '}';
    }

    //Constructor
    public Usuario(String nome, String data_cadastro, Carrinho carrinho) {
        this.nome = nome;
        this.data_cadastro = data_cadastro;
        this.carrinho = carrinho;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos
    public double verificarDesconto(){
        String[] data = data_cadastro.split("-");
        int tempoCadastro =  LocalDate.parse(LocalDate.now().toString()).getYear() - Integer.parseInt(data[2]);
        if(tempoCadastro >= 5){
            return carrinho.getValorFinal() * 0.5;
        } else {
            return carrinho.getValorFinal() * 0.2;
        }
    }
}
