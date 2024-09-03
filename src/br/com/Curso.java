package br.com;

public class Curso {

    //Atributos para classe
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    //Gets e Setts
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
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Print automaticos
    @Override
    public String toString() {
        return "Curso: Titulo = " + titulo + ", Descrição = " + descricao + ", Carga Horária = " + cargaHoraria + ".";
    }
    

}
