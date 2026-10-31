package com.example;

public class Main {
    public static void main(String[] args){

        Autor nAutor = new Autor("123J", "Gabriel Garcia Marquez", "Colombiana", 1927);
        Autor name = new Autor("456Y", "Miguel Garcia", "Peruana");
        User user = new User("789H", "David Velazquez", "elmasputitoUWU@gmail.com");

        // Aquí se conecta el Autor con el Libro
        Libro cads = new Libro("675H", "100 anios de soledad", nAutor, 1967, 45000, 10);


        System.out.println(cads.toString());
        System.out.println("================");
        System.out.println(nAutor.toString());
        System.out.println("================");
        System.out.println(name.toString());
        System.out.println("================");
        System.out.println(user.toString());
    }
}