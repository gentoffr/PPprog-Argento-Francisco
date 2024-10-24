/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico121;

import java.util.Objects;
public abstract class Animal 
{
    protected String nombre;
    protected int edad;
    protected double peso;
    protected DIETA dieta;
    
    public Animal(String nombre, int edad, double peso, DIETA dieta)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dieta = dieta;
    }
    @Override
    public boolean equals(Object o)
    {
        // Este override de equals me permite compara los parametros que yo deseo para saber si es efectivamente igual el objeto ingresado parametricamente
        if (this == o)
        {
            return true;
        }
        if(o == null || o.getClass() != getClass()) // Si es null o no de esta clase 
        {
            return false;
        }
        Animal p = (Animal) o; // Casteo del objeto ingresado por parametro, para poder acceder a sus atributos
        return p.edad == edad && p.nombre == nombre; // Si tanto edad como nombre coinciden, devolver true
    }
    @Override
    public int hashCode()
    {
        // Override mandatorio del hash (no lo entiendo bien)
        return Objects.hash(nombre, edad);
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad()
    {
        return edad;
    }
}
