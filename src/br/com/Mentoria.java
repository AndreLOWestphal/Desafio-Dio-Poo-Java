package br.com;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    //Atributos para classe
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    //Gets e Sets
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    //impressão
    @Override
    public String toString() {
        return "Mentoria: Titulo = " + getTitulo() + ", descrição = " + getDescricao() + ", data = " + data + ".";
    }
    
    
}
