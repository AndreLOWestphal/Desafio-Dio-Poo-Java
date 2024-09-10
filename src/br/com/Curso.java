package br.com;

public class Curso extends Conteudo{

    //Atributos para classe
    private int cargaHoraria;

    //implementando constante 
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    //Gets e Setts
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Print automaticos
    @Override
    public String toString() {
        return "Curso: Titulo = " + getTitulo() + ", Descrição = " + getDescricao() + ", Carga Horária = " + cargaHoraria + ".";
    }
    
    

}
