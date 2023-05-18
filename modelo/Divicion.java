package modelo;

public class Divicion extends Operacion
{
    //constructor
    public Divicion(double x,double y)
    {
        super(x, y);
    }
    public void divicion()
    {
        resultado= x / y;
    }
}
