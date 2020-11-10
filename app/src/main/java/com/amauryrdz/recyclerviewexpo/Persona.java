package com.amauryrdz.recyclerviewexpo;

public class Persona {

    private int perfil;
    private String titulo;
    private String texto;

    public Persona(int perfil, String titulo, String texto) {

        this.perfil = perfil;
        this.titulo = titulo;
        this.texto = texto;

    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
