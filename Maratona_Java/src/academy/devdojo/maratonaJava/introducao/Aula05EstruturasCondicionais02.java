package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 && idade < 55 categoria adulto
        // idade > 55 && idade < 106 categoria 3 idade
        int idade = 18;

        if(idade <= 0 || idade > 106){
            System.out.println("Idade invalida");
        }else if(idade < 15){
            System.out.println("Categoria: Infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria: juvenil");
        }else if(idade >= 18 && idade < 55){
            System.out.println("Categoria: adulto");
        }else if(idade >= 55 && idade < 106){
            System.out.println("Categoria: Terceira idade");
        }
    }
}
