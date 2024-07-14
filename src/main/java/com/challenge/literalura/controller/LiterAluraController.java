package com.challenge.literalura.controller;

import com.challenge.literalura.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Scanner;

@Controller
public class LiterAluraController {

    @Autowired
    private LivroService livroService;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Buscar livro por título");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Listar autores");
            System.out.println("4. Listar autores vivos em determinado ano");
            System.out.println("5. Sair");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (choice) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    try {
                        livroService.buscarLivrosPorTitulo(titulo).forEach(System.out::println);
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro ao buscar livros: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        livroService.listarLivrosGutendex().forEach(System.out::println);
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro ao listar livros: " + e.getMessage());
                    }
                    break;
                case 3:
                    // Listar autores - implementar se necessário
                    break;
                case 4:
                    // Listar autores vivos em determinado ano - implementar se necessário
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}



