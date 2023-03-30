public class App {
    public static void main(String[] args) throws Exception {
        boolean confirma;
        Conjunto c1 = new Conjunto();

        c1.insertarElemento(1);
        c1.insertarElemento(2);
        c1.insertarElemento(1);
        c1.mostrar();
        c1.numeroElementos();

        Conjunto c2 = new Conjunto();
        c2.insertarElemento(4);
        confirma = c2.insertarElemento(1);
        System.out.println("Se ha insertado el elemento 1 ? " + confirma);
        c2.insertarElemento(5);
        c2.insertarElemento(6);
        c2.mostrar();
        c2.insertarElemento(1);
        c2.mostrar();
        c2.eliminarElemento(5);
        c2.mostrar();

        Conjunto union = Conjunto.union(c1, c2);
        union.mostrar();
        union.numeroElementos();
        System.out.println("¿pertene c2 a union? " + union.pertenece(c2));

        Conjunto c3 = new Conjunto();

        c3.insertarElemento(1);
        c3.insertarElemento(5);
        System.out.println("¿pertene c3 a union? " + union.pertenece(c3));
        c3.insertarElemento(6);
        c3.mostrar();
        union.eliminaConjunto(c3);
        union.mostrar();
    }
}
