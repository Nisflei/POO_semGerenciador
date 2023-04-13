import java.util.Date;

public class Higiene extends Item {
    /*Atributos*/
    private String cor;
    private boolean testadoEmAnimais;

    /*Getters e Setters*/
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isTestadoEmAnimais() {
        return testadoEmAnimais;
    }
    public void setTestadoEmAnimais(boolean testadoEmAnimais) {
        this.testadoEmAnimais = testadoEmAnimais;
    }

    /*Constructor*/
    public Higiene(String nome, int quantidade, double preco, String marca, Date validade, String cor, boolean testadoEmAnimais){
        super(nome, quantidade, preco, marca, validade);
        this.cor = cor;
        this.testadoEmAnimais = testadoEmAnimais;
    }

    /*Método que aplica desconto ao produto caso ele seja testado em animais*/
    public double aplicarDesconto(){
        if(this.testadoEmAnimais){
            super.setPreco(super.getPreco() + (super.getPreco() / 100) * 20);
            return super.getPreco();
        } else{
            return super.getPreco();
        }
    }

    /*Verifica se o produto pertence ao grupo*/
    public boolean verificarEmpresasDoGrupo() {
        if(super.getMarca().toLowerCase().equals("flora")){
            super.setPreco(getPreco() - (super.getPreco() / 100) * 2);
            return true;
        }else{
            return false;
        }
    }
}