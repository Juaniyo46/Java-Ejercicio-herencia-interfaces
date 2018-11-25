package com.company;

public class Película extends Multimedia {
    protected String actor;
    protected String actress;

    public Película(String tittle, String author, String format, int duration, String actor, String actress) {
        super(tittle, author, format, duration);
        this.actor = actor;
        this.actress = actress;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    @Override
    public String toString() {
        return "Película{" +
                "actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", format='" + format + '\'' +
                ", duration=" + duration +
                '}';
    }


}
