import javax.swing.event.ListDataEvent;

public class PILA {
    private Lista Lista;

    public PILA() {
        Lista = new Lista();
    }

    void apilar(Integer elemento) {
        Lista.insertarFinal(elemento);

    }

    Integer desapilar() {
        return Lista.eliminar(Lista.tabla.length - 1);

    }

    public void mostrar() {
        Lista.mostrar();
    }
}