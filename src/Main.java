import java.time.LocalDate;

import br.com.Curso;
import br.com.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        
        //criar cursos dentro da classe
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de formação de desenvolvedores em JAVA");
        curso1.setCargaHoraria(20);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso de formação de desenvolvedores em JavaScript");
        curso2.setCargaHoraria(15);

        //criar mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("Aulas para formação de desenvolvedores em Java");
        mentoria1.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
