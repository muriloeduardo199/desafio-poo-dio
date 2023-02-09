import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso() ;
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso() ;
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());



//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp java develop");
        bootcamp.setDescricao("descricaro bootcamp java develop");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devmurilo = new Dev();
        devmurilo.setNome("murilo");
        devmurilo.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos de murilo" + devmurilo.getConteudoInscritos());

        devmurilo.progredir();
        devmurilo.progredir();

        System.out.println("---------------------------------");
        System.out.println("conteudos inscritos de murilo" + devmurilo.getConteudoInscritos());
        System.out.println("conteudos concluido de murilo" + devmurilo.getConteudoConcluidos());
        System.out.println("XP: " + devmurilo.calcularTotalXp());

        System.out.println("---------------------------------");
        Dev devjoao = new Dev();
        devjoao.setNome("joao");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos joao " + devjoao.getConteudoInscritos()) ;
        devjoao.progredir();


        System.out.println("conteudos inscritos joao " + devjoao.getConteudoInscritos()) ;
        System.out.println("conteudos concluido de joao" + devjoao.getConteudoConcluidos());
        System.out.println("XP: " + devjoao.calcularTotalXp());
    }
}