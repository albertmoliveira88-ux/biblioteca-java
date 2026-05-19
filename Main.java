package Biblioteca;

public class Main {

public static void main(String[] args) {

    Biblioteca Livro1 = new Biblioteca();
    Livro1.setTitulo("");
    Livro1.setAutor("");
    Livro1.setAno();

    System.out.println(Livro1.getTitulo());
    System.out.println(Livro1.getAutor());
    System.out.println("Publicação: "+ Livro1.getAno());

 }
}