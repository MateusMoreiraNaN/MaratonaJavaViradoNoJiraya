package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais05Part2 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semena
        // Considerando 1 como domingo

        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                System.out.println("final de semana");
                 break;
                //para
            case 2:
                System.out.println("Segunda");
                System.out.println("dia útil");
                break;
            //stop
            case 3:
                System.out.println("Terça");
                System.out.println("dia útil");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                System.out.println("dia útil");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                System.out.println("dia útil");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                System.out.println("dia útil");
                break;
            case 7:
                System.out.println("Sabado");
                System.out.println("final de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
