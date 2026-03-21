package com.bn.suppliers.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_fornecedor")
public class FornecedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_fantasia_fornecedor")
    private String nomeFantasia;

    @Column(name = "cnpj_fornecedor")
    private String cnpj;

    @Column(name = "contato_fornecedor")
    private String contato;

    public FornecedorModel() {}

    public Long getId() {
        return id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
