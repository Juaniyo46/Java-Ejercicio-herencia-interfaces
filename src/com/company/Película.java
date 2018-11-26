package com.company;

public class Película extends Multimedia {
    protected String actor;
    protected String actress;

    public Película(String tittle, String author, formato format, int duration, String actor, String actress) {
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

        String result = "Película{" +
                "actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", format='" + format + '\'' +
                ", duration=" + duration
                ;

        if (this.actor != null) {
            result += "actor='" + actor + '\'';
        }

        if (this.actress != null) {
            result += "actrees='" + actress + '\'';
        }

        return result;
    }


}
