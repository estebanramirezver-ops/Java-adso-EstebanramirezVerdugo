package com.example;

public class genetica_hijo extends genetica_padre {
    private String genero;

    public genetica_hijo(){
        super(1.98, "Mulato", "Escocia", "azul");
        this.genero = "Masculino";
    
    }

    public void actividadAltura(){
        System.out.println("Con su altura actual de " + alturaPadre + " el hijo practica baloncesto");
    }

    public void ojosHijo(){
        System.out.println("El color de los ojos del hijo que es " + colorOjos + " lo heredó de su abuelo de parte de su madre");
    }

    @Override

    public String toString(){
        return "Genetica del hijo: altura: " + alturaPadre + " | color de ojos: " + colorOjos + " | país: " + paisNacimiento + " | género: " + genero;
    }
}
