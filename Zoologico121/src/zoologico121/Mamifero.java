
package zoologico121;
// clase Mamifero
public class Mamifero extends Animal implements Vacunable
{
    private static final boolean VACUNABLE = true; // Atributo que comparten todas las instancias
    private boolean vacunado = false; // Atributo para saber si esta vacunado
    public Mamifero(String nombre, int edad, double peso, DIETA dieta)
    {
        super(nombre, edad, peso, dieta);
    }

    @Override
    public String toString() {
        return "Mamifero [peso=" +  peso + ", dieta=" + dieta + " vacunado=" + vacunado + "]";
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
