public class App {
    public static void main(String[] args) throws Exception {
        Compra c = new Compra();
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("-----------");
            System.out.println("La compra del supermercado");
            System.out.println();
            System.out.println("¿Cuánto ha costado la compra?");
            double precioCompra = sc.nextDouble();
            System.out.println();
            System.out.println("¿Con cuánto vas a pagar?");
            double pago = sc.nextDouble();
            System.out.println();
            double cambio = pago - precioCompra;
            System.out.println("-----------");
            System.out.println();
            if (cambio > 0) {
                System.out.println("El cambio de la compra es:");
                c.calcular(cambio);
                c.mostrarDevolucion();
            } else {
                System.out.println("Faltan monedas o billetes para pagar la compra.");
            }
            System.out.println();
            System.out.println("------------");
            System.out.println();
            System.out.println("¿Desea hacer otra compra?\nSi / No");
            respuesta = sc.next();
            respuesta = respuesta.toLowerCase();
        } while (respuesta.equals("si"));
}
