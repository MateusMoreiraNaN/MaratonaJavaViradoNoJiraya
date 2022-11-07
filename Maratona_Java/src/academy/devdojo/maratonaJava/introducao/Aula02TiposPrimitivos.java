package academy.devdojo.maratonaJava.introducao;

public class Aula02TiposPrimitivos {
    //psvm
    public static void main(String[] args) {
        /* int,
           double,
           floot,
           har,
           byte,
           short,
           long
        */

        int age = (int) 100000000000L;
        //---------------------------------------
        long stortAntal = (long) 155.23;
        double salaryDouble = 2000.0D;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean true0 = true;
        boolean false0 = false;
        char character = 'M';


        System.out.println("the age is "+age);
        System.out.println("age is "+ageByte+" years");
        System.out.println(stortAntal);
        System.out.println(salaryDouble);
        System.out.println(salaryFloat);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(true0);
        System.out.println(false0);
        System.out.println(character);
        //ctrl+d

        String name = "my name is Mateus";
        //sout + tab
        System.out.println(name);
        String lorem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, " +
                "but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including versions of " +
                "Lorem Ipsum.";

        System.out.println(lorem);

        //var nome2 "Vegeta";
    }
}
