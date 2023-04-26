import java.sql.Date;

public class ClassTeste {
    public static void main(String[] args) throws Exception {
        Alimentos teste1 = new Alimentos(true, true, "Rafael", 2, 10, "Seara", new Date(2007, 1, 1));
        Alimentos teste2 = new Alimentos(false, true, "Carlos", 2, 10, "Seara", new Date(2002, 1, 1));
        System.out.println("O valor de desconto retornado depois de verificar se é enlatado é: "+teste1.aplicarDesconto());
        System.out.println("O valor de desconto retornado depois de verificar se é uma empresa do grupo e se é carne é: "+teste1.validarEmpresasDoGrupo(new String[]{"Seara", "Flora", "Friboi"}, true));

        throw new Exception("Erro normal");
    }

}
