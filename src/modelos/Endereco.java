package modelos;

public class Cep {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade; //cidade
    private String estado;
    private String regiao;

    public Cep(String cep, String logradouro, String bairro, String localidade, String estado, String regiao) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.estado = estado;
        this.regiao = regiao;
    }

    public Cep() {
    }
}
