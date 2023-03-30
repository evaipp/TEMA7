
public class Conjunto {
    public boolean insertarElemento(int nuevo){
        boolean insertado=false;
        if (!repetido(nuevo)){
            tabla = Arrays.copyOf(tabla,tabla.length+1);
            tabla[tabla.length-1]=nuevo;
            insertado=true;
        }
        return insertado;
    }


    void eliminarElemento(int elemento){
         for (int i=0; i<tabla.length; i++){
             if (tabla[i]==elemento){
                System.arraycopy(tabla , i+1 ,tabla ,i , tabla.length-i-1);
                tabla = Arrays.copyOf(tabla,tabla.length-1);
                }
            }
       
    }


   
    public boolean repetido(int nuevo){
        boolean b=false;
       
        for (int i=0; i<tabla.length && !b; i++){
            if (tabla[i]==nuevo){
                b=true;
            }


        }
        return b;
    }
   
    static Conjunto union(Conjunto c1, Conjunto c2){
        Conjunto resultado = new Conjunto();
        for (int e : c1.tabla){
            resultado.insertarElemento(e);
        }
        for (int e : c2.tabla){
            resultado.insertarElemento(e);
        }
        return resultado;
    }


    public boolean pertenece(Conjunto c){
        boolean pertenece=true;
        for (int e : c.tabla){
            if (Arrays.binarySearch(this.tabla,e)<0){
                pertenece=false;
            }
        }
        return pertenece;
    }


    public boolean eliminaConjunto(Conjunto c){
        boolean eliminado=false;
        for (int e : c.tabla){
            if (Arrays.binarySearch(this.tabla,e)>=0){
                eliminarElemento(e);
                eliminado=true;
            }
        }
        return eliminado;
    }


   
   
    void mostrar(){
        System.out.println(Arrays.toString(tabla));
    }


    void numeroElementos(){
        System.out.println("El numero de elementos son: " +tabla.length);
    }
   



}
