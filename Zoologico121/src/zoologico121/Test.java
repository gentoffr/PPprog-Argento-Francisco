/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoologico121;


public class Test {

    public static void main(String[] args) {
        Ave a1 = new Ave("Pelicano", 12, 7.4, DIETA.OMNIVORO, 19.4); // ave de prueba
        Zoologico zoo = new Zoologico("Temaiken"); // inicializacion de zoo
        setup(zoo);
        zoo.mostrarAnimales(); // muestro estado incial
        System.out.println("----------"); // Testeo de vacunar
        zoo.vacunarAnimales();
        zoo.mostrarAnimales();
        System.out.println("----------");
        // a1 = null; por si se quiere atrapar la nullpointer
        try 
        {
            zoo.agregarAnimal(a1); // Agrego uno existente
        } 
        catch (AnimalRepetidoException e) // cazo la excepcion personalizada
        {
            System.out.println(e); // Lo muestro por consola y sigo corriendo mi programa
        }
        catch (NullPointerException e)
        {
            System.out.println(e); // hago lo mismo por si fuese null
        }
    }
    
    public static void setup(Zoologico zoo)
    {
        // Setup para agilizar main, agrega una serie de animales de testing al zoologico
        zoo.agregarAnimal(new Ave("Pelicano", 12, 7.4, DIETA.OMNIVORO, 19.4));
        zoo.agregarAnimal(new Ave("Carpintero", 15, 2.5, DIETA.HERBIVORO, 12.6));
        zoo.agregarAnimal(new Ave("Martin pescador", 5, 10.12, DIETA.CARNIVORO, 5.10));
        zoo.agregarAnimal(new Reptil("Lagarto", 3, 20.3, DIETA.HERBIVORO, "Queratinosa", "Refrigeracion liquida"));
        zoo.agregarAnimal(new Reptil("Cocodrilo", 10, 120.4, DIETA.CARNIVORO, "Durisima", "Ectotermica"));
        zoo.agregarAnimal(new Reptil("Vibora", 5, 30.2, DIETA.OMNIVORO, "Lisa", "Air cooler"));
        zoo.agregarAnimal(new Mamifero("Leon", 20, 230.2, DIETA.CARNIVORO));
        zoo.agregarAnimal(new Mamifero("Gorila", 15, 332.2, DIETA.HERBIVORO));
        zoo.agregarAnimal(new Mamifero("Zorro", 21, 30.2, DIETA.OMNIVORO));
    }
    
}
