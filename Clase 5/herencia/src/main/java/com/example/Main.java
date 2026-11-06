package com.example;

public class Main {
    public static void main(String[] args) {
        genetica_padre padre = new genetica_padre(1.88, "Negro", "Indonesia", "Verde");
        
        System.out.println("=======Genética del padre =======");
        System.out.println(padre);
        padre.ojosIdenticos();
        padre.paisPadre();
        System.out.println("================================"); 

        genetica_hijo hijo = new genetica_hijo();

        System.out.println("=======Genética del hijo =======");
        System.out.println(hijo);
        hijo.actividadAltura();
        hijo.ojosHijo();
    }
}