import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Conteudo;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

public class Main {
    public static void main(String[] args)  {
        Curso curso1 = new Curso(); //new instancia um novo objeto
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); //segundo objeto das classes
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso(); /* exemplo de polimorfismo. Instaciei um curso através da classe conteudo. 
        Tudo que tem em conteudo, tem em curso, mas não ao contrário.*/ 
       
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now()); //irá aparecer a data que a mentoria foi criada.

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Felipe" +devFelipe.getConteudosIncritos());
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("---------------");
        System.out.println("Conteúdos inscritos Felipe" +devFelipe.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Felipe" +devFelipe.getConteudosConluidos());
        System.out.println("XP" +devFelipe.calcularTotalXP());

        System.out.println("--------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João" +devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---------------");
        System.out.println("Conteúdos inscritos João" +devFelipe.getConteudosIncritos());
        System.out.println("Conteúdos concluídos João" +devJoao.getConteudosConluidos());
        System.out.println("XP" +devJoao.calcularTotalXP());




    }
}
