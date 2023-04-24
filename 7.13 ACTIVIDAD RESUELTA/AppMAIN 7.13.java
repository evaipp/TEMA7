public class App {
    /**
     * @param args
     * @throws Exception
     */
    
            public static  void main(String[] args)  {
        PILA  P = new PILA();
       System.out.println(P.desapilar);
        for (int i = 0; i++) {
            P.apilar(i);

        }
        integger num = P.desapilar();
        while (num != null) {
            System.out.println(num + " ");
            num = P.desapilar();
        }

        
}

}
