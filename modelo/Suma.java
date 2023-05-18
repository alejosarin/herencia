package modelo;

public class Suma extends Operacion
{
    //constructor
    public Suma(double x,double y)
    {
        super(x, y);
    }
    public void sumar()
    {
        resultado= x + y;
    }
}
