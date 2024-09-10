import java.time.LocalDate;

import br.com.BootCamp;
import br.com.Curso;
import br.com.Dev;
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



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos André: " + devAndre.getConteudoInscritos());
        devAndre.progredir();
        System.out.println("Conteúdos inscritos André: " + devAndre.getConteudoInscritos());
        System.out.println("Conteúdos concluidos André: " + devAndre.getConteudoConcluidos());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluidos Camila: " + devCamila.getConteudoConcluidos());
    }
}
