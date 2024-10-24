
package zoologico121;
// clase Ave
public class Ave extends Animal implements Vacunable
{
    private static final boolean VACUNABLE = true; // Atributo que comparten todas las instancias
    private boolean vacunado = false;
    private double envergaduraAlas;
    public Ave(String nombre, int edad, double peso, DIETA dieta, double envergaduraAlas)
    {
        super(nombre, edad, peso, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }
    @Override
    public String toString()
    {
        return "Ave [envergaduraAlas=" + envergaduraAlas + " vacunado=" + vacunado + "]"; 
    }
    @Override
    public boolean getVacunable()
    {
        return VACUNABLE;
    }
    @Override
    public void setVacunado()
    {
        vacunado = true;
    }
    @Override
    public boolean getVacunado() {
        return vacunado;
    }
}
