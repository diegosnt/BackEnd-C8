package clase002A;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBAS CLASE COCINERO");
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        cocineroNoVeggie.hacerPizza();

    }
}
