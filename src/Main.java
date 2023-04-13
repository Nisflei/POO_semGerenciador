import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alimentos teste1 = new Alimentos(true, true, "Rafael", 2, 10, "Seara", new Date(2007, 1, 1));
        Alimentos teste2 = new Alimentos(false, true, "Carlos", 2, 10, "Seara", new Date(2002, 1, 1));
        System.out.println("O valor de desconto retornado depois de verificar se é enlatado é: "+teste1.aplicarDesconto());
        System.out.println("O valor de desconto retornado depois de verificar se é uma empresa do grupo e se é carne é: "+teste1.validarEmpresasDoGrupo(new String[]{"Seara", "Flora", "Friboi"}, true));

        List<Item> itens = new ArrayList<Item>();
        itens.add(teste1);
        itens.add(teste2);

        Carrinho carr = new Carrinho(
                itens
        );

        System.out.println(carr.calculaValorFinal());

        System.out.println("Testes clientes físicos:");
        ClienteFisico ct1 = new ClienteFisico("feliz", "20-12-2006", carr, 123456789L, "periles");
        System.out.println(ct1);
        System.out.println(ct1.getCarrinho().getItens());
        System.out.println(ct1.validarCPF("52741631816"));

        System.out.println("Testes clientes juridicos:");
        ClienteJuridico ct2 = new ClienteJuridico("Coca", "20-12-2005", carr, 4599741800153L,"Coca-Cola", true);
        System.out.println(ct2);
        System.out.println(ct2.getCarrinho().getItens());

        Higiene higiene = new Higiene("Coca", 1,120, "JBS", new Date(2007, 1, 1), "vermelho", true);
        System.out.println(higiene.aplicarDesconto());
        System.out.println(higiene.verificarEmpresasDoGrupo());
    }
}