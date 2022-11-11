package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        double Carro = 50000;

        for(int parcela = 1; parcela <= Carro; parcela++){
                double valorPacela = Carro / parcela;
                if(valorPacela < 1000){
                    break;
                }
                if(valorPacela >= 1000){
                    System.out.println("Pacela: " + parcela + " R$ "+valorPacela);
                }else{
                    break;
                }

                //System.out.println("Fora do if, mas dentro do for" + parcela);


        }
    }
}
