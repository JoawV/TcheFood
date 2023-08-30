package Model;

import java.sql.Timestamp;
import java.util.Date;

public class ModelUsuario {
    private int id;
    private String email;
    private String senha;
    private String nome;
    private Timestamp dataCriacao;
    private Timestamp dataAtualizacao;
    private String telefone;

    public void setDataCriacao(Timestamp dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataAtualizacao(Timestamp dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    private String papel;

    public Date getDataCriacao() {
        return dataCriacao;
    }



    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }



    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
