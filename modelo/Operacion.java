package modelo;
public class Operacion
{
    //Atributos
    protected double x;
    protected double y;
    protected double resultado;

    //constructor
    public Operacion(double x, double y) 
    {
        this.x = x;
        this.y = y;
        this.resultado=0;
    } 

    //metodos

    public double mostrarResultado()
    {
        return this.resultado;
    }

    
    
}