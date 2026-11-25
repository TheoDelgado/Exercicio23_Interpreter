package padroesestruturais.flyweight.livraria;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {

    @Test
    void deveRetornarLivros() {
        Catalogo catalogo = new Catalogo();
        catalogo.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        catalogo.cadastrar("Vidas Secas", "Companhia das Letras", "Brasil");
        catalogo.cadastrar("O Cortiço", "Companhia das Letras", "Brasil");
        catalogo.cadastrar("1984", "Penguin", "Reino Unido");

        List<String> saida = Arrays.asList(
                "Livro{titulo='Dom Casmurro', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Vidas Secas', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='O Cortiço', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='1984', editora='Penguin', pais='Reino Unido'}");

        assertEquals(saida, catalogo.obterLivros());
    }

    @Test
    void deveRetornarTotalEditoras() {
        Catalogo catalogo = new Catalogo();
        catalogo.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        catalogo.cadastrar("Vidas Secas", "Companhia das Letras", "Brasil");
        catalogo.cadastrar("O Cortiço", "Companhia das Letras", "Brasil");
        catalogo.cadastrar("1984", "Penguin", "Reino Unido");

        assertEquals(2, EditoraFactory.getTotalEditoras());
    }

    @Test
    void deveReutilizarMesmaInstanciaDeEditora() {
        Editora editora1 = EditoraFactory.getEditora("Companhia das Letras", "Brasil");
        Editora editora2 = EditoraFactory.getEditora("Companhia das Letras", "Brasil");

        assertSame(editora1, editora2);
    }

}