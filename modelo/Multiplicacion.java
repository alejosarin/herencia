package modelo;

public class Multiplicacion extends Operacion
{
    //constructor
    public Multiplicacion(double x,double y)
    {
        super(x, y);
    }
    public void multiplicacion()
    {
        resultado= x * y;
    }
}
