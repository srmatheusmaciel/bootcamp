import br.com.dominio.Bootcamp;
import br.com.dominio.Curso;
import br.com.dominio.Dev;
import br.com.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descricao curso python");
        curso2.setCargaHoraria(5);



        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria Python");
        mentoria2.setDescricao("Descricao mentoria Python");
        mentoria2.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricão Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devMatheus = new Dev();

        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito: " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        System.out.println("Conteudo Inscrito: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteudo Concluído: " + devMatheus.getConteudosConcluidos());

        System.out.println("Xp: " + devMatheus.calcularTotalXp());

        System.out.println("-----------");

        Dev devJacob = new Dev();

        devJacob.setNome("Jacob");
        devJacob.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito: " + devJacob.getConteudosInscritos());
        devJacob.progredir();
        System.out.println("Conteudo Inscrito: " + devJacob.getConteudosInscritos());
        devJacob.progredir();
        System.out.println("Conteudo Concluído: " + devJacob.getConteudosConcluidos());

        System.out.println("Xp: " + devJacob.calcularTotalXp());



    }
}