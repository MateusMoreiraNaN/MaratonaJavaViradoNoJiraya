package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 8000;
        //String mensagemDoar = "eu vou doar 500 pro DevDojo";
        //String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? "eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!"; // (condição) ? verdadeiro : falso;
        /*
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        */
        System.out.println(resultado);



    }
}
