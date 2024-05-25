package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.nombre="Cebra";
        animal1.genero="F";

        Animal animal2 = new Animal();
        animal2.nombre="Caballo";
        animal2.genero="M";

        Animal animal3 = new Animal();
        animal3.nombre = "Cebrallo";
        animal3.genero = "M";



        animal2.encontrarPareja(animal1); //Un animal consigue pareja


        Familia familia = new Familia(animal1, animal2, animal3);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();




    }
}