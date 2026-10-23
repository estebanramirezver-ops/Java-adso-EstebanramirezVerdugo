package com.example;

public class User {
        public class valoresAtributos{
            private String firstnamePerson;
            private String secondnamePerson;
            private String lastnamePerson;
            private int agePerson;
            private int brotherPerson;
            private double heightPerson;
            private double weightPerson;
            private boolean loginPerson;
            private boolean studyPerson;
            private char genderPerson;

            public valoresAtributos(){

            }

            public valoresAtributos(String firstnamePerson, String secondnamePerson, String lastnamePerson, int agePerson, int brotherPerson, double heightPerson, double weightPerson, boolean loginPerson, boolean studyPerson, char genderPerson) {
                this.firstnamePerson = firstnamePerson;
                this.secondnamePerson = secondnamePerson;
                this.lastnamePerson = lastnamePerson;
                this.agePerson = agePerson;
                this.brotherPerson = brotherPerson;
                this.heightPerson = heightPerson;
                this.weightPerson = weightPerson;
                this.loginPerson = loginPerson;
                this.studyPerson = studyPerson;
                this.genderPerson = genderPerson;
            }   

            public String getFirstnamePerson() {
                return firstnamePerson;
            }

            public void setFirstnamePerson(String firstnamePerson) {
                this.firstnamePerson = firstnamePerson;
            }

            public String getSecondnamePerson() {
                return secondnamePerson;
            }

            public void setSecondnamePerson(String secondnamePerson) {
                this.secondnamePerson = secondnamePerson;
            }

            public String getLastnamePerson() {
                return lastnamePerson;
            }

            public void setLastnamePerson(String lastnamePerson) {
                this.lastnamePerson = lastnamePerson;
            }

            public int getAgePerson() {
                return agePerson;
            }

            public void setAgePerson(int agePerson) {
                this.agePerson = agePerson;
            }

            public int getBrotherPerson() {
                return brotherPerson;
            }

            public void setBrotherPerson(int brotherPerson) {
                this.brotherPerson = brotherPerson;
            }

            public double getHeightPerson() {
                return heightPerson;
            }

            public void setHeightPerson(double heightPerson) {
                this.heightPerson = heightPerson;
            }

            public double getWeightPerson() {
                return weightPerson;
            }

            public void setWeightPerson(double weightPerson) {
                this.weightPerson = weightPerson;
            }

            public boolean isLoginPerson() {
                return loginPerson;
            }

            public void setLoginPerson(boolean loginPerson) {
                this.loginPerson = loginPerson;
            }

            public boolean isStudy_person() {
                return studyPerson;
            }

            public void setStudy_person(boolean study_person) {
                this.studyPerson = study_person;
            }

            public char getGender_person() {
                return genderPerson;
            }

            @Override 
            public String toString() {
                return "valoresAtributos{" +
                        "firstnamePerson='" + firstnamePerson + '\'' +
                        ", secondnamePerson='" + secondnamePerson + '\'' +
                        ", lastnamePerson='" + lastnamePerson + '\'' +
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
    }