import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPeterson = new Dev();
        devPeterson.setNome("Peterson");
        devPeterson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Peterson: " + devPeterson.getConteudosInscritos());
        devPeterson.progredir();
        devPeterson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Peterson: " + devPeterson.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Peterson: " + devPeterson.getConteudoConcluidos());
        System.out.println("XP:" + devPeterson.calcularTotalXp());

        System.out.println("-----------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos João: " + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devPeterson.calcularTotalXp());


    }
}