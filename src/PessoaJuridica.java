public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String ie;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return this.ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public double calcularMensalidadeComDesconto() {
        double valorDesconto = (getValorMensalidade() * 25) / 100;

        return (getValorMensalidade() - valorDesconto);
    }
    
}
