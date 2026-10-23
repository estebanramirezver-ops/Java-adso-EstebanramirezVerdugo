package com.example;

public class Main {
    public static void main(String[] args) {
        User.valoresAtributos User = new User().new valoresAtributos("Esteban", "Ramirez", "Verdugo", 20, 2, 1.67, 70.5, false, true, 'M');
        System.out.println("Nombre: " + User.getFirstnamePerson() + " " + User.getSecondnamePerson() + " " + User.getLastnamePerson());
        System.out.println("Edad: " + User.getAgePerson());
        System.out.println("Hermanos: " + User.getBrotherPerson());
        System.out.println("Estatura: " + User.getHeightPerson());
        System.out.println("Peso: " + User.getWeightPerson());
        System.out.println("Login: " + User.isLoginPerson());
        System.out.println("Estudia: " + User.isStudy_person());
        System.out.println("Género: " + User.getGender_person());
    }    
} 