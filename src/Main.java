import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cur1 = new Curso();
        cur1.setTitulo("cuso Html");
        cur1.setDescricao("Aprenda os primeros passos no Html");
        cur1.setCargaHoraria(40);

        Curso cur2 = new Curso();
        cur2.setTitulo("cuso Css");
        cur2.setDescricao("Aprenda os primeros passos no Css");
        cur2.setCargaHoraria(40);

        Mentoria ment1 = new Mentoria();
        ment1.setTitulo("Java");
        ment1.setDescricao("Semana do Java");
        ment1.setData(LocalDate.now());

        Bootcamp boot = new Bootcamp();
        boot.setNome("Bootcamp java Developer");
        boot.setDescricao("Bootcamp java Developer para iniciantes");
        boot.getConteudos().add(cur1);
        boot.getConteudos().add(cur2);
        boot.getConteudos().add(ment1);

        Dev dev = new Dev();
        dev.setNome("Ana ");
        dev.inscreverBootcamp(boot);
        System.out.println("Conteúdos Inscritos Ana" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana" + dev.getConteudosConcluidos());
        System.out.println("XP" + dev.calcularTotalXp());

        System.out.println("-------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Bruno ");
        dev2.inscreverBootcamp(boot);
        System.out.println("Conteúdos Inscritos Bruno" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruno" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bruno" + dev2.getConteudosConcluidos());
        System.out.println("XP" + dev2.calcularTotalXp());


    }
}