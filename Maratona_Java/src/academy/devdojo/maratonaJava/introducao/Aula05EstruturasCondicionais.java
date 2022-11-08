package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        if(false){
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

        int idade = 145;

        if(idade <= 0 || idade > 102){
            System.out.println("Idade Invalida");
        }else if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else if(idade < 18){
            System.out.println("Negado");
        }

        int idade2 = 13;

        boolean isAutorizadoComprarBebida = idade2 >= 18;

        System.out.println(" ");
        System.out.println("Teste2");
        if (isAutorizadoComprarBebida){
            System.out.println("Part2");
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Part2");
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        boolean c = false;

        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        //if tem que retonar um boolean
    }
}
