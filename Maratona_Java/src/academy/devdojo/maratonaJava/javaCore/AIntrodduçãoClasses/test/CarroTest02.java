package academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.test;

import academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.Nome = "Porsche";
        carro.Modelo = "Carrera GT";
        carro.Ano = 2004;

        System.out.println("Nome: " + carro.Nome);
        System.out.println("Modelo: " + carro.Modelo);
        System.out.println("Ano: " + carro.Ano);
    }


}
