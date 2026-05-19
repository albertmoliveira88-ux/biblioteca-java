package Biblioteca;

public class Biblioteca {

       private String titulo;
       private String autor;
       private int ano;

    public void setTitulo(String titulo) {
        if (titulo.length() > 1) {
            this.titulo = titulo;
        }
    }

    public String getTitulo() {
        return "Título: "+ titulo;
    }

    public void setAutor(String autor) {
        if (autor.length() > 1) {
            this.autor = autor;
        }
    }

    public String getAutor() {
        return "Autor(a): "+ autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
}


