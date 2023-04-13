public class ClienteJuridico extends Usuario{
    private long cnpj;
    private String nomeFantasia;
    private boolean franquiado;

    // To string
    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "cnpj=" + cnpj +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", franquiado=" + franquiado +
                '}';
    }

    // Constructor

    public ClienteJuridico(String nome, String data_cadastro, Carrinho carrinho, long cnpj, String nomeFantasia, boolean franquiado) {
        super(nome, data_cadastro, carrinho);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.franquiado = franquiado;
    }

    // Getters e Setters
    public long getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public boolean isFranquiado() {
        return franquiado;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setFranquiado(boolean franquiado) {
        this.franquiado = franquiado;
    }

    // Função que verifica o desconto com base no fator franquiado
    public double verificarDesconto(){
        if (this.franquiado){
            return super.getCarrinho().getValorFinal() * 0.10;
        }
        return 0.0;
    }
}