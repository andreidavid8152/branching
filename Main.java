public class Main{
    public static void main(String[] args){

        // Logotipo
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");

        // Saludo
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo", "en"));
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("Mundo", "fr"));

        // Despedida
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));        
    }
}