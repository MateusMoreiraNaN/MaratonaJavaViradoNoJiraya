package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int count = 0;

        while(count <= 10){
            System.out.println(count);
            //count = count + 1;
            count++;
        }

        int con = 0;

        System.out.println(" ");

        do{
            System.out.println("Dentro do do-while");
            con++;
        }while (con < 10);

        System.out.println(" ");



        for(int i=0; i <= 10; i++){
            System.out.println("For " +i);
        }

        System.out.println(" ");

        int soma = 0;

        for(soma=0; soma <= 10; soma++){
            System.out.println("For2: " +soma);
        }
    }
}
