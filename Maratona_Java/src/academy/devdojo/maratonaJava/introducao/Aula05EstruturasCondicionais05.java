package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        int dia = 4;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
                //para
            case 2:
                System.out.println("Segunda");
                break;
                //stop
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println(" ");

        char sexo = 'M';

        switch(sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println(" ");

        int jogos = 75;

        System.out.println(" ");

        switch(jogos){
            case 75:
                System.out.println("Jogo lamçamento");
                break;
            case 35:
                System.out.println("Jogo antigo");
                break;
            default:
                System.out.println("Preços variados");
        }

    }
}
