package modelo;

public class Restar extends Operacion
{
    //constructor
    public Restar(double x,double y)
    {
        super(x, y);
    }
    public void restar()
    {
        resultado= x - y;
    }
}
