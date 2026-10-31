package com.example;

public class Autor {
    private String idAutor;
    private String Nombre;
    private String nacionalidad;
    private int anioNacimiento;
    private int anioActual = 2026;

    public String getidAutor(){
        return idAutor;
    }

    public String getNombre(){
        return Nombre;
    }

    public String getnacionalidad(){
        return nacionalidad;
    }

    public int getanioNacimiento(){
        return anioNacimiento;
    }

    public void setIdAutor(String idAutor){
        this.idAutor = idAutor;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    public void setAnionacimiento(int anioNacimiento){
        if (anioNacimiento < 0 || anioNacimiento < 1900 || anioNacimiento > anioActual)
            System.out.println("El año de nacimiento ingresado es negativo o no concuerda con el actual, ingrese uno adecuado");
        else {
            this.anioNacimiento = anioNacimiento;
        }
    }
    
    public Autor(String idAutor){
        this.idAutor = idAutor;

        Nombre = "Desconocido";
        nacionalidad = "Desconocida";
        anioNacimiento = 0;
    }    

    public Autor(String idAutor, String Nombre){
        this.idAutor = idAutor;
        this.Nombre = Nombre;

        nacionalidad = "Desconocida";
        anioNacimiento = 0;
    }

    public Autor(String idAutor, String Nombre, String nacionalidad){
        this.idAutor = idAutor;
        this.Nombre = Nombre;
        this.nacionalidad = nacionalidad;

        anioNacimiento = 0;
    }

    public Autor(String idAutor, String Nombre, String nacionalidad, int anioNacimiento){
        this.idAutor = idAutor;
        this.Nombre = Nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;       
    }

    @Override 

    public String toString(){
        return "Id del autor: " + idAutor + "\nNombre del autor: " + Nombre + "\nNacionalidad: " + nacionalidad + "\nAño de nacimiento: " + anioNacimiento;
    }

}
