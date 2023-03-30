
public class punto {
    double X;
    double Y;
    double DX;
    double DY;
    double otroPunto;

    public Punto() {
    }

    public Punto(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public Punto(double X, double Y, double DX, double DY) {
        this.X = X;
        this.Y = Y;
        this.DX = DX;
        this.DY = DY;
    }

    public void desplazaX(double DX) {
        X = X + DX;
        System.out.println("La cantidad incrementada a X es: " + DX);
    }

    public void desplazaY(double DY) {
        Y = Y + DY;
        System.out.println("La cantidad incrementada a Y es: " + DY);
    }

    public void desplaza(double DX, double DY) {
        X += DX;
        Y += DY;
        System.out.println("El componente X se ha desplazado: " + X);
        System.out.println("El componente Y se ha desplazado: " + Y);
    }

    double distaciaEuclidea(double puntoOtro) {
        return Math.sqrt(Math.pow(X - puntoOtro, 2) +
                Math.pow(Y - puntoOtro, 2));
    }

    public void muestra() {
        System.out.println(X + " X        Y " + Y);
        System.out.println(DX + " DX       DY " + DY);

    }

}

}
