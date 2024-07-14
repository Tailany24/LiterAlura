package com.challenge.literalura.util;

import com.challenge.literalura.model.Autor;
import com.challenge.literalura.model.Livro;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JsonParser {

    public List<Livro> parseLivros(String jsonResponse) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonResponse);
        JsonNode resultsNode = rootNode.get("results");
        List<Livro> livros = new ArrayList<>();

        if (resultsNode.isArray()) {
            for (JsonNode bookNode : resultsNode) {
                Livro livro = new Livro();
                livro.setTitulo(bookNode.get("title").asText());
                livro.setIdiomas(objectMapper.convertValue(bookNode.get("languages"), List.class));
                livro.setNumeroDownloads(bookNode.get("download_count").asInt());

                JsonNode authorNode = bookNode.get("authors").get(0); // Assumindo que há pelo menos um autor
                Autor autor = new Autor();
                autor.setNome(authorNode.get("name").asText());
                autor.setAnoNascimento(authorNode.get("birth_year").asInt());
                autor.setAnoFalecimento(authorNode.get("death_year").asInt());
                livro.setAutor(autor);

                livros.add(livro);
            }
        }

        return livros;
    }
}



