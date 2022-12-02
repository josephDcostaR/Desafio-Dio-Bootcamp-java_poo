import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(cur1);
        System.out.println(cur2);
    }
}