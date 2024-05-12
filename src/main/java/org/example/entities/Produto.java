package org.example.entities;

public class Produto {
    private static int contadorIds = 0;
    private Integer id;
    private String marca;
    private String modelo;
    private String cor;
    private Integer ano;
    private Integer quantidade;

    public Produto() {
    }
    public Produto(String marca, String modelo, String cor, Integer ano, Integer quantidade) {
        this.id = ++contadorIds;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ID: "+ id + ", Marca: " + marca + ", Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano + ", Quantidade: " + quantidade + "\n";
    }
}
