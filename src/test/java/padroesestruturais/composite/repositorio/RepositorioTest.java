package padroesestruturais.composite.repositorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositorioTest {

    @Test
    void deveRetornarEstruturaRepositorio() {
        Pasta pasta1 = new Pasta("src");

        Pasta pasta2 = new Pasta("docs");
        Arquivo arquivo21 = new Arquivo("README.md", 2);
        pasta2.addItem(arquivo21);

        Pasta pasta3 = new Pasta("test");
        Arquivo arquivo31 = new Arquivo("LoginTest.java", 3);
        Arquivo arquivo32 = new Arquivo("CadastroTest.java", 4);
        pasta3.addItem(arquivo31);
        pasta3.addItem(arquivo32);

        Pasta raiz = new Pasta("meu-projeto");
        raiz.addItem(pasta1);
        raiz.addItem(pasta2);
        raiz.addItem(pasta3);

        Repositorio repositorio = new Repositorio();
        repositorio.setRaiz(raiz);

        assertEquals("Pasta: meu-projeto\n" +
                "Pasta: src\n" +
                "Pasta: docs\n" +
                "Arquivo: README.md - tamanho: 2 KB\n" +
                "Pasta: test\n" +
                "Arquivo: LoginTest.java - tamanho: 3 KB\n" +
                "Arquivo: CadastroTest.java - tamanho: 4 KB\n", repositorio.getEstrutura());
    }

    @Test
    void deveRetornarExcecaoRepositorioSemRaiz() {
        try {
            Repositorio repositorio = new Repositorio();
            repositorio.getEstrutura();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Repositório sem raiz", e.getMessage());
        }
    }
}