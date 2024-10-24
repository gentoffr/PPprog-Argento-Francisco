
package zoologico121;
// clase Reptil
public class Reptil extends Animal
{
    private String tipoEscama;
    private String regTemp;
    public Reptil(String nombre, int edad, double peso, DIETA dieta, String tipoEscama, String regTemp)
    {
        super(nombre, edad, peso, dieta);
        this.tipoEscama = tipoEscama;
        this.regTemp = regTemp;
    }

    @Override
    public String toString() {
        return "Reptil{" + "tipoEscama=" + tipoEscama + ", regTemp=" + regTemp + '}';
    }
    
}
