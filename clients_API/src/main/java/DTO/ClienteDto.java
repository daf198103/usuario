package DTO;

import model.Cliente;

import java.util.Date;

public class ClienteDto {

    private Long id ;
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataNascto;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int idade;


    public ClienteDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascto() {
        return dataNascto;
    }

    public void setDataNascto(Date dataNascto) {
        this.dataNascto = dataNascto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascto=" + dataNascto +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", idade=" + idade +
                '}';
    }

    public ClienteDto parseClienteDto(Cliente cli) {
        ClienteDto cliDto = new ClienteDto();
        cliDto.setId(cli.getId());
        cliDto.setNome(cli.getNome());
        cliDto.setSobrenome(cli.getSobrenome());
        cliDto.setTelefone(cli.getTelefone());
        cliDto.setDataNascto(cli.getDataNascto());
        cliDto.setEndereco(cli.getEndereco());
        cliDto.setBairro(cli.getBairro());
        cliDto.setCidade(cli.getCidade());
        cliDto.setEstado(cli.getEstado());
        cliDto.setCep(cli.getCep());
        return cliDto;
    }

}
