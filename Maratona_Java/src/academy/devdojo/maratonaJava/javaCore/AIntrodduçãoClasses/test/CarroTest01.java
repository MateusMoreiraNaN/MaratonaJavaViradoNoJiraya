package academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.test;

import academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.Nome = "Tesla";
        carro.Modelo = "Model 3";
        carro.Ano = 2019;

        System.out.println("Nome: " + carro.Nome);
        System.out.println("Modelo: " + carro.Modelo);
        System.out.println("Ano: " + carro.Ano);
    }
}
