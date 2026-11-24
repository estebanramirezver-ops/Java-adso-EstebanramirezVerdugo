package com.example;

public class Main {
    public static void main(String[] args) {
        User user = new User("Esteban", "Ramirez", "Verdugo", 20, 2, 1.67, 70.5, false, true, 'M');

        System.out.println("Nombre: " + user.getFirstNamePerson() + " " + user.getSecondNamePerson() + " " + user.getLastNamePerson());
        System.out.println("Edad: " + user.getAgePerson());
        System.out.println("Hermanos: " + user.getBrotherPerson());
        System.out.println("Estatura: " + user.getHeightPerson());
        System.out.println("Peso: " + user.getWeightPerson());
        System.out.println("Login: " + user.isLoginPerson());
        System.out.println("Estudia: " + user.isStudyPerson());
        System.out.println("Género: " + user.getGenderPerson());
    }
}
