

public class PessoaFisica extends Cliente {
    private String cpf;
    private String rg;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double calcularMensalidadeComDesconto() {
        double valorDesconto = (getValorMensalidade() * 10) / 100;
        return (getValorMensalidade() - valorDesconto);
    }
}
