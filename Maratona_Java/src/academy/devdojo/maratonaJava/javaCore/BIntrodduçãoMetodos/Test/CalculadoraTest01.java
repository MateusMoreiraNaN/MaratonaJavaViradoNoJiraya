package academy.devdojo.maratonaJava.javaCore.BIntrodduçãoMetodos.Test;

import academy.devdojo.maratonaJava.javaCore.BIntrodduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Final");
        calculadora.subtraiDoisNumeros();
    }


}
