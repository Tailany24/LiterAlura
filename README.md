# LiterAlura

## Descrição
O LiterAlura é um catálogo de livros que utiliza a API Gutendex para buscar informações sobre livros e autores. Ele armazena os dados em um banco de dados PostgreSQL e permite consultar e gerenciar informações sobre livros e autores.

## Funcionalidades
* Busca de livros por título utilizando a API Gutendex.
* Listagem de todos os livros cadastrados.
* Listagem de todos os autores cadastrados.
* Listagem de autores que estavam vivos em um determinado ano.
* Integração com PostgreSQL para armazenamento de dados.


## Tecnologias Utilizadas

* Java
* Spring Boot
* PostgreSQL
* Gutendex API
* PGAdmin 4


## Configuração do Projeto

Pré-requisitos

* Java 11 ou superior instalado
* Maven para gerenciamento de dependências
* PostgreSQL instalado e configurado
* PGAdmin 4 instalado (para administração do banco de dados)

## Passos para Configuração

* Clone o repositório
* bash
* Copiar código
* git clone https://github.com/seu-usuario/literalura.git
* cd literalura


## Configuração do Banco de Dados

* Crie um banco de dados no PostgreSQL através do PGAdmin 4.
* Verifique as configurações de conexão no arquivo application.properties no diretório src/main/resources.


![Captura de tela 2024-07-14 185753](https://github.com/user-attachments/assets/b82d4965-5de8-493f-9ca8-a54996d38b67)




Exemplo:

* bash
* Copiar código
* spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_seu_banco
* spring.datasource.username=seu_usuario
* spring.datasource.password=sua_senha


## Executando o Projeto

* Abra o projeto em sua IDE de preferência (por exemplo, IntelliJ IDEA, Eclipse).
* Execute a classe principal LiteraluraApplication para iniciar a aplicação.


![Captura de tela 2024-07-14 185610](https://github.com/user-attachments/assets/36f82059-34ae-4457-8d7f-623523a3fe0c)




## Utilizando a Aplicação

* Acesse http://localhost:8080 para utilizar a interface da aplicação.
* Siga as instruções no console ou na interface para realizar buscas de livros, listar autores e realizar outras operações disponíveis.

  
## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests ou relatar issues no repositório GitHub.
![badge literalura](https://github.com/user-attachments/assets/fbc2b4a1-810f-4167-870d-f01956771189)

