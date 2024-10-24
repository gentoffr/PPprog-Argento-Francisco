/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico121;
import java.util.ArrayList;
public class Zoologico 
{
    private ArrayList<Animal> animales =  new ArrayList<>();
    private String nombre;
    public Zoologico(String nombre)
    {
        this.nombre = nombre;
    }
    public void agregarAnimal(Animal a)
    {
        if(estaEnLista(a))
        {
            throw new AnimalRepetidoException("El animal " + a.getNombre() + " de edad " + a.getEdad() + " ya se haya en el Zoo");
        }
        if(a == null)
        {
            throw new NullPointerException();
        }
        animales.add(a);
        
    }
    private boolean estaEnLista(Animal a)
    {
        int i = 0; // Variable de control
        while(i < animales.size()) // Correr el ciclo hasta que la variable de control exceda la cantidad de animales en la lista
        {   
            if(animales.get(i).equals(a)) // Fijarse por cada animal si coincide con el ingresado parametricamente
            {
                return true;
            }
            i++; // Proxima iteracion
        }
        return false; // Si la variable de control excede el tamaño de la lista, significa que me pase, y el animal no esta
    }
    public void mostrarAnimales()
    {
        for(Animal animal: animales) // For each, por cada animal en la lista de animales
        {
            System.out.println(animal); // Usa el toString propio de cada animal
        }
    }
    public void vacunarAnimales()
    {
        for(Animal a: animales)
        {
            if(a instanceof Vacunable && !((Vacunable)a).getVacunado())
            {
                ((Vacunable) a).setVacunado();
            }
        }   
    }
}
