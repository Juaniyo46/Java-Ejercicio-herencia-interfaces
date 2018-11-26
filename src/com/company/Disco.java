package com.company;

public class Disco extends Multimedia {
    protected String gender;

    public Disco(String tittle, String author, formato format, int duration, String gender) {
        super(tittle, author, format, duration);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "gender='" + gender + '\'' +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", format=" + format +
                ", duration=" + duration +
                '}';
    }

}
