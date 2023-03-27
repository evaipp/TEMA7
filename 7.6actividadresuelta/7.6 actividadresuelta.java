import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora Hora = new Hora();
        System.out.println("Hora");
        int valor = sc.nextInt();
        h.setHora(valor);
        System.out.println("Minuto");
        valor = sc.nextInt();
        h.setMinuto(valor);
        System.out.println("Segundo");
        valor = sc.nextInt();
        h.setSegundo(valor);
        System.out.println("Cuántos segundos quiere mostrar:");
        int numsegundos = sc.nextInt();
        for (int i = 0; i <= numSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementarSegundo();

        }
    }
}
