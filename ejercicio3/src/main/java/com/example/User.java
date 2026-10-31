package com.example;

public class User {
        private String iduser;
        private String nombre;
        private String email;
        private int librosPrestados;

    public String getiduser(){
        return iduser;
    }

    public String getnombre(){
        return nombre;
    }

    public String getemail(){
        return email;
    }

    public int getlibrosPrestados(){
        return librosPrestados;
    }



    public void setiduser(String iduser){
        this.iduser = iduser;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setemail(String email){
        this.email = email;
    }

    public void librosPrestados(int librosPrestados){
        if(librosPrestados < 0)
            System.out.println("Ingrese un valor que no sea negativo");
        else{
            this.librosPrestados = librosPrestados;
        }
    }

    public User(String iduser){
        this.iduser = iduser;

        nombre = "Desconocido";
        email = "Desconocido";
        librosPrestados = 0;
    }

    public User(String iduser, String nombre){
        this.iduser = iduser;
        this.nombre = nombre;
        
        email = "Desconocido";
        librosPrestados = 0;
    }

    public User(String iduser, String nombre, String email){
        this.iduser = iduser;
        this.nombre = nombre;
        this.email = email;

        librosPrestados = 0;
    }

    public User(String iduser, String nombre, String email, int librosPrestados){
        this.iduser = iduser;
        this.nombre = nombre;
        this.email = email;
        this.librosPrestados = librosPrestados;
    }

    @Override 

    public String toString(){
        return "ID del usuario: " + iduser + "\nNombre del usuario: " + nombre + "\nCorreo eléctronico: " + email + "\nLibros Prestados: " + librosPrestados;
    }
}
