import java.time.LocalDate;

import Dominio.Conteudo;
import Dominio.Curso;
import Dominio.Mentoria;

public class Main {
    public static void main(String[] args)  {
        Curso curso1 = new Curso(); //new instancia um novo objeto
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); //segundo objeto das classes
        curso1.setTitulo("curso javaScript");
        curso1.setDescricao("descrição curso javaScript");
        curso1.setCargaHoraria(4);

        Conteudo conteudo = new Curso(); /* exemplo de polimorfismo. Instaciei um curso através da classe conteudo. 
        Tudo que tem em conteudo, tem em curso, mas não ao contrário.*/ 
       
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now()); //irá aparecer a data que a mentoria foi criada.

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
