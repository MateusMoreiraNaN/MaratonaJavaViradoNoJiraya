package academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.test;

import academy.devdojo.maratonaJava.javaCore.AIntrodduçãoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.Nome = "Tesla";
        carro.Modelo = "Model 3";
        carro.Ano = 2019;

        carro2.Nome = "Fusca";
        carro2.Modelo = "Fusca Bala";
        carro2.Ano = 1984;

        carro = carro2;

        System.out.println("Nome: " + carro.Nome);
        System.out.println("Modelo: " + carro.Modelo);
        System.out.println("Ano: " + carro.Ano);
    }
}
