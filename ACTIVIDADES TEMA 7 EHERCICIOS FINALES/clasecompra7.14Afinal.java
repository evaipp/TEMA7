
public class Compra {
    public class Compra {

        private final double[] monedas = { 500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05,
                0.02, 0.01 };
        private double[] devolver = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        public void calcular(Double cambio) {
            for (int i = 0; i < monedas.length && cambio != 0; i++) {
                devolver[i] = Math.floor(cambio / monedas[i]);
                cambio -= devolver[i] * monedas[i];
            }
        }

        public void mostrarDevolucion() {
            for (int i = 0; i < monedas.length && devolver[i] > 0; i++) {
                if (monedas[i] > 2) {
                    System.out.println("Hay " + devolver[i] + " billetes de: " + monedas[i] + " euros.");
                } else {
                    System.out.println("Hay " + devolver[i] + " monedas de: " + monedas[i] + " euros.");
                }
            }
        }
    }

}
