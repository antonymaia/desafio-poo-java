import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private List<Produto> produtos = new ArrayList();

    public String getProdutos(){
        String produtosString = "";

        for( int i = 0; i < produtos.size(); i++){
            produtosString = produtosString + produtos.get(i).toString();
        }

        
        return ("[\n" + produtosString + "\n]");
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
}
