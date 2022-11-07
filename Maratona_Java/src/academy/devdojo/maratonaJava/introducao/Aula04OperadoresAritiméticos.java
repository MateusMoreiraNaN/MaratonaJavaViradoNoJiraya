package academy.devdojo.maratonaJava.introducao;

public class Aula04OperadoresAritiméticos {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        int resuldado = numero1+numero2;
        System.out.println(numero2+numero1+" Valor: "+numero2+numero1);
        System.out.println(numero2+numero1+" Valor: "+resuldado);
        System.out.println(numero1-numero2);
        System.out.println(numero2+numero1+" Valor: "+numero2*numero1);
        System.out.println(numero2+numero1+" Valor: "+numero2/numero1);
        System.out.println("---------------------------------");
        // %
        int resto = 10 % 2;
        System.out.println(resto);

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        boolean isDezMaiorQuevinte = 10 >= 20;
        boolean isDezMenorQuevinte = 10 <= 20;
        boolean isDezIgualQuevinte = 10 == 20;
        boolean isDezDiferenteQuevinte = 10 != 20;
        System.out.println("isDezMaiorQuevinte: "+isDezMaiorQuevinte);
        System.out.println("isDezMenorQuevinte: "+isDezMenorQuevinte);
        System.out.println("isDezIgualQuevinte: "+isDezIgualQuevinte);
        System.out.println("isDezDiferenteQuevinte: "+isDezDiferenteQuevinte);

        // && (and) || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("  ");
        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);
        System.out.println("  ");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationcincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationcincoCompravel: "+isPlaystationcincoCompravel);

        //Atribuição
        // = += -= *= /= %=

        double bonus = 1000;

        bonus += 1000;

        System.out.println(bonus);


    }
}
