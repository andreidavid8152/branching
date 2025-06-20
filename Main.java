public class Main{
    public static void main(String[] args){

        // Logotipo
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");

        // Saludo
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Grupo"));
        System.out.println("Version certificada v1.0.0");

        // Despedida
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}