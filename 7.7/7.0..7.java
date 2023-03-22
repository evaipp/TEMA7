public class App {
    public static void main(String[] args) {
     Texto t = new Texto(5);
     t.addprincipio("HO");
     t.addprincipio(';');
     t.addFinal("Lá");
     t.addFinal8('X');
     t.mostrar();
     System.out.println("Número de  voales: " + t.numVocales());
    
    }
}



