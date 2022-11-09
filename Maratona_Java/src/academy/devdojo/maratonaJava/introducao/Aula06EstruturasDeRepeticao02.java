package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    // Imprima todos os numero pares de 0 até 100000

    public static void main(String[] args) {
        //int pares = 2;

        for(int i = 1; i <= 100000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}
