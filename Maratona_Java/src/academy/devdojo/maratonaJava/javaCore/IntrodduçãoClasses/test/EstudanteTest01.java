package academy.devdojo.maratonaJava.javaCore.IntrodduçãoClasses.test;

import academy.devdojo.maratonaJava.javaCore.IntrodduçãoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Luffy";
        estudante.idade = 12;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
