package com.challenge.literalura.service;

import com.challenge.literalura.client.GutendexClient;
import com.challenge.literalura.model.Livro;
import com.challenge.literalura.util.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class LivroService {

    @Autowired
    private GutendexClient gutendexClient;

    @Autowired
    private JsonParser jsonParser;

    public List<Livro> listarLivrosGutendex() throws IOException, InterruptedException {
        String jsonResponse = gutendexClient.getAllBooks();
        return jsonParser.parseLivros(jsonResponse);
    }

    public List<Livro> buscarLivrosPorTitulo(String titulo) throws IOException, InterruptedException {
        String jsonResponse = gutendexClient.searchBooks(titulo);
        return jsonParser.parseLivros(jsonResponse);
    }
}




