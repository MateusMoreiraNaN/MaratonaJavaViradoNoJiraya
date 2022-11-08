package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais03TabelaVerdade {
    public static void main(String[] args) {

        System.out.println("-----------------------");
        System.out.println("TAXES UNITED KINGDOM 2021");
        System.out.println("-----------------------");
        System.out.println(" ");

        System.out.println("Personal Allowance\t |  Up to £12,570\t |  0%");
        System.out.println("Basic rate\t     |    £12,571 to £50,270\t | 20%");
        System.out.println("Higher rate\t   |   £50,271 to £150,000\t  | 40%");
        System.out.println("Additional rate\t  |  over £150,000\t  | 45%");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");



        double salary = 64215;

        if(salary <= 12570){
            System.out.println("My salary: " + salary);
            System.out.println("0% TAXES");
        }else if(salary >= 12571  && salary <= 50270){
            System.out.println("My salary: " + salary);
            System.out.println("20% TAXES");
        }else if(salary >= 50271 && salary <= 150000){
            System.out.println("My salary: " + salary);
            System.out.println("40% TAXES");
        }else{
            System.out.println("My salary: " + salary);
            System.out.println("45% TAXES");
        }
    }
}
