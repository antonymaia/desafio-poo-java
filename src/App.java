import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();
        produto.setDescricao("Biscoito Treloso");
        produto.setPreco(1.50);

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf("32112343219");
        pessoaFisica.setNome("Laura Maia");
        pessoaFisica.setRg("38277465");
        pessoaFisica.setValorMensalidade(150);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("MERCADINHO PADARAIA CEU AZUL");
        pessoaJuridica.setValorMensalidade(450);
        pessoaJuridica.setCnpj("11349239000132");
        pessoaJuridica.setIe("12341422");

        Pedido pedido1 = new Pedido();
        pedido1.setCliente(pessoaFisica);
        pedido1.adicionarProduto(produto);

        Pedido pedido2 = new Pedido();
        pedido2.setCliente(pessoaJuridica);
        pedido2.adicionarProduto(produto);
        pedido2.adicionarProduto(produto);

        System.out.println("Pedido 1 " + pedido1.getProdutos());
        System.out.println();
        System.out.println("Pedido 2 " + pedido2.getProdutos());
    }
}
