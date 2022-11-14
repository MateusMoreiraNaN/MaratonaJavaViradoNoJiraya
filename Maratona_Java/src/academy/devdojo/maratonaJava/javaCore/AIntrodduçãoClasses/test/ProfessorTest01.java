package academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.test;

import academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Kami";
        professor.idade = 32;
        professor.sexo = 'M';
        professor.experiencia = 8;

        System.out.println("meu nome é " + professor.nome + " tenho " + professor.idade + " anos " + " sexo:" + professor.sexo + " | anos de experiencia:" + professor.experiencia);
    }
}
