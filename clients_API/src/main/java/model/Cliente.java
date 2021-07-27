package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name="CLI_CLIENTE")
public class Cliente implements Serializable {

    @Id
    private Long id ;
    @Column(name="nome", length=50)
    private String nome;
    @Column(name="sobrenome", length=150)
    private String sobrenome;
    @Column(name="telefone", length=15)
    private String telefone;
    @Column(name="dataNascto")
    private Date dataNascto;
    @Column(name="endereco", length=50)
    private String endereco;
    @Column(name="bairro", length=50)
    private String bairro;
    @Column(name="cidade", length=50)
    private String cidade;
    @Column(name="endereco", length=2)
    private String estado;
    @Column(name="cep", length=8)
    private String cep;


    public Cliente() {
    }

    public Cliente(Long id, String nome, String sobrenome, String telefone, Date dataNascto, String endereco, String bairro, String cidade, String estado, String cep) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.dataNascto = dataNascto;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id) &&
                nome.equals(cliente.nome) &&
                sobrenome.equals(cliente.sobrenome) &&
                telefone.equals(cliente.telefone) &&
                dataNascto.equals(cliente.dataNascto) &&
                endereco.equals(cliente.endereco) &&
                bairro.equals(cliente.bairro) &&
                cidade.equals(cliente.cidade) &&
                estado.equals(cliente.estado) &&
                cep.equals(cliente.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sobrenome, telefone, dataNascto, endereco, bairro, cidade, estado, cep);
    }

    @Override
    public String toString() {
        return "Cliente{" +
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
                '}';
    }
}
