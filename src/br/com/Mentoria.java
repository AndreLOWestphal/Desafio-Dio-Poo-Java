package br.com;

import java.time.LocalDate;

public class Mentoria {

    //Atributos para classe
    String titulo;
    String descricao;
    LocalDate data;

    //Gets e Sets
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    //impressão
    @Override
    public String toString() {
        return "Mentoria: Titulo = " + titulo + ", descrição = " + descricao + ", data = " + data + ".";
    }
    
}
