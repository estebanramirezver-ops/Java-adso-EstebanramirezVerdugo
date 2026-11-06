package com.example;

public class genetica_padre {
    protected double alturaPadre;
    protected String colorPiel;
    protected String paisNacimiento;
    protected String colorOjos;

    public genetica_padre(double alturaPadre, String colorPiel, String paisNacimiento, String colorOjos)
    {
        this.alturaPadre = alturaPadre;
        this.colorPiel = colorPiel;
        this.paisNacimiento = paisNacimiento;
        this.colorOjos = colorOjos;
    }

    public void ojosIdenticos(){
        System.out.println(colorOjos + " es el color del padre");
    }

    public void paisPadre(){
        System.out.println(paisNacimiento + " es el país de origen del padre");
    }

    @Override 
    public String toString(){
        return "Altura:" +  alturaPadre + " | Color de piel: " + colorPiel + " | Pais de origen: " + paisNacimiento + " | Color de ojos: " + colorOjos;
    }
}
