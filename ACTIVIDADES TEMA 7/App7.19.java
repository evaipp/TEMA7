import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        Pila p = new Pila();
        for (int i = 1; i <= 10; i++) {
           p.apila(i);
        }
        
        System.out.println("Cima: " + p.cima());
        while(!p.vacia()) {
           System.out.println(p.desapila());
        }
  
}
}
