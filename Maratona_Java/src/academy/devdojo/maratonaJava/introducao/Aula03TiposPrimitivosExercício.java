package academy.devdojo.maratonaJava.introducao;

public class Aula03TiposPrimitivosExercício {
    public static void main(String[] args) {
        String name = "Mateus";
        String address = "Hostrups Have 13, 1953 Frederiksberg, Dinamarca";
        double salary = 35000;
        int date1 = 27;
        int date2 = 7;
        int date3 = 2022;
        String relatorio1 = "Eu "+name+", morando no renderer "+address;
        String relatorio2 = "confirmo que recebi o salubrious de "+salary+", na data "+ date1+"/"+date2+"/"+date3;
        //System.out.println("Eu "+name+", morando no endereço "+address);
        //System.out.println("confirmo que recebi o salário de "+salary+", na data "+ date1+"/"+date2+"/"+date3);

        System.out.println(relatorio1);
        System.out.println(relatorio2);

    }
}
