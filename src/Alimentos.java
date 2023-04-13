import java.util.Date;

public class Alimentos extends Item {
    private boolean in_natura;
    private boolean enlatado;


    public Alimentos(boolean in_natura, boolean enlatado, String nome, int quantidade, double preco, String marca, Date validade) {
        super(nome, quantidade, preco, marca, validade );
        this.in_natura = in_natura;
        this.enlatado = enlatado;
    }


    public boolean getInNatura() {
        return in_natura;
    }

    public boolean isEnlatado() {
        return enlatado;
    }

    //O método aplicarDesconto é uma sobrescrita verifica se o produto é enlatado. Se for retorna um valor de desconto.
    public double aplicarDesconto(){
        if(enlatado){
            super.setPreco(super.getPreco() - super.getPreco() * 0.045);
        }
        return super.getPreco();
    }

//O método validarEmpresasDoGrupo verifica se a marca do produto está presente no array de marcas do grupo J&F. Se sim aplica um desconto, verifica também se
//é carne se for adiciona um valor de descconto maior. Se não for uma marca do grupo não adiciona desconto.

    public double validarEmpresasDoGrupo(String[] marcas, boolean is_carne){
        for (String marca : marcas) {
            if (marca == super.getMarca()) {
                if (is_carne) {
                    super.setPreco(super.getPreco() - super.getPreco() * 0.05);
                } else {
                    super.setPreco(super.getPreco() - super.getPreco() * 0.02);
                }
            }
        }
        return super.getPreco();
    }

    @Override
    public String toString() {
        return "Alimentos{" +
                "nome='" + super.getNome() + '\'' +
                "in_natura=" + in_natura +
                ", enlatado=" + enlatado +
                ", quantidade=" + super.getQuantidade() +
                ", preco=" + super.getPreco() +
                ", marca='" + super.getMarca() + '\'' +
                ", validade=" + super.getValidade() +
                '}';
    }
}