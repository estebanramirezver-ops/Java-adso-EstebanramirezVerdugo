package com.example;

public class User {
    private String firstNamePerson;
    private String secondNamePerson;
    private String lastNamePerson;
    private int agePerson;
    private int brotherPerson;
    private double heightPerson;
    private double weightPerson;
    private boolean loginPerson;
    private boolean studyPerson;
    private char genderPerson;

    public User() {
    }

    public User(String firstNamePerson, String secondNamePerson, String lastNamePerson, int agePerson,
                int brotherPerson, double heightPerson, double weightPerson, boolean loginPerson,
                boolean studyPerson, char genderPerson) {
        this.firstNamePerson = firstNamePerson;
        this.secondNamePerson = secondNamePerson;
        this.lastNamePerson = lastNamePerson;
        setAgePerson(agePerson);
        setBrotherPerson(brotherPerson);
        setHeightPerson(heightPerson);
        setWeightPerson(weightPerson);
        this.loginPerson = loginPerson;
        this.studyPerson = studyPerson;
        this.genderPerson = genderPerson;
    }

    public String getFirstNamePerson() {
        return firstNamePerson;
    }

    public void setFirstNamePerson(String firstNamePerson) {
        this.firstNamePerson = firstNamePerson;
    }

    public String getSecondNamePerson() {
        return secondNamePerson;
    }

    public void setSecondNamePerson(String secondNamePerson) {
        this.secondNamePerson = secondNamePerson;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        if (agePerson < 0)
            System.out.println("La edad no puede ser negativa");
        else {
            this.agePerson = agePerson;
        }
    }

    public int getBrotherPerson() {
        return brotherPerson;
    }

    public void setBrotherPerson(int brotherPerson) {
        if (brotherPerson < 0)
            System.out.println("El número de hermanos no puede ser negativo");
        else {
            this.brotherPerson = brotherPerson;
        }
    }

    public double getHeightPerson() {
        return heightPerson;
    }

    public void setHeightPerson(double heightPerson) {
        if (heightPerson <= 0)
            System.out.println("La estatura debe ser mayor que cero");
        else {
            this.heightPerson = heightPerson;
        }
    }

    public double getWeightPerson() {
        return weightPerson;
    }

    public void setWeightPerson(double weightPerson) {
        if (weightPerson <= 0)
            System.out.println("El peso debe ser mayor que cero");
        else {
            this.weightPerson = weightPerson;
        }
    }

    public boolean isLoginPerson() {
        return loginPerson;
    }

    public void setLoginPerson(boolean loginPerson) {
        this.loginPerson = loginPerson;
    }

    public boolean isStudyPerson() {
        return studyPerson;
    }

    public void setStudyPerson(boolean studyPerson) {
        this.studyPerson = studyPerson;
    }

    public char getGenderPerson() {
        return genderPerson;
    }

    public void setGenderPerson(char genderPerson) {
        this.genderPerson = genderPerson;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstNamePerson='" + firstNamePerson + '\'' +
                ", secondNamePerson='" + secondNamePerson + '\'' +
                ", lastNamePerson='" + lastNamePerson + '\'' +
                ", agePerson=" + agePerson +
                ", brotherPerson=" + brotherPerson +
                ", heightPerson=" + heightPerson +
                ", weightPerson=" + weightPerson +
                ", loginPerson=" + loginPerson +
                ", studyPerson=" + studyPerson +
                ", genderPerson=" + genderPerson +
                '}';
    }
}
