public class Produto {
    private String descricao;
    private double preco;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "  {" +
                "\n    'descricao'= '" + this.descricao + '\'' +
                "\n    ,'preco'= " + this.preco +
                "\n  }";
    }
}
