public class App {
    public static void main(String[] args) throws Exception {
        Colores colores = new Colores();
      colores.addColor("Marrón");
      colores.addColor("Azul");
      colores.addColor("Amarillo");
      colores.addColor("Celeste");
      colores.addColor("Rosa");
      
      System.out.println(Arrays.toString(colores.seleccionColores(3)))

    }
}
