public class App {
    public static void main(String[] args) throws Exception {
       CuentaCorriente c;
        c = new CuentaCorriente("12345678-A", "Pepe");
        c.saldo(1000);
        c.saldo(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: " + c.egreso(700));
        System.out.println("Puedo sacar 500 euros: " + c.egreso(500));
        c = new CuentaCorriente("98765432-z", "Paco");
        c.mostrarInformacion(); 
    }
}

