# Exemplo de API monolítica com Java, Spring Boot e PostgreSQL

Este projeto é um exemplo de uma arquitetura monolítica desenvolvida com Java 17, utilizando Spring Boot 3 e PostgreSQL 16.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **PostgreSQL 16**

## Arquitetura

Este projeto foi desenvolvido seguindo a arquitetura monolítica, que é uma das abordagens tradicionais para o desenvolvimento de aplicações. 

Nessa arquitetura, todos os componentes de software, como módulos de autenticação, banco de dados, lógica de negócios, e interfaces de usuário, são integrados e executados como uma única aplicação.

## Entidades

A API possui três principais entidades:

- **Company**: Representa uma empresa no sistema, contendo informações como nome, descrição, quais empregos são dessa empresa e quais as notas da avaliação.
- **Job**: Representa uma vaga de emprego oferecida por uma empresa, contendo detalhes como título, descrição, valor minimo e máximo do salário, localização e empresa.
- **Review**: Representa uma avaliação de uma empresa por parte de um funcionário ou candidato, contendo informações como título, descrição, nota e a qual empresa está vinculado essa avaliação.

## Endpoints

A API disponibiliza os seguintes endpoints para interação com as entidades:

- `/companies` - Endpoints para criar, listar, atualizar e deletar empresas.
- `/jobs` - Endpoints para criar, listar, atualizar e deletar vagas de emprego.
- `/reviews` - Endpoints para criar, listar, atualizar e deletar avaliações.

Possui implementado os métodos HTTP `GET`, `POST`, `DELETE` e `PUT` para cada endpoint

Para cada método HTTP possui implementado um endpoint que pode ser utilizado por id
- Exemplo:
    - `/companies/1`
    - `/jobs/2`
    - `/reviews/3`

Esse projeto está sendo utilizado como exemplo para estudo de refatoração de arquitetura monolitica para arquitetura de micro serviços, dividindo cada entidade para um serviço.

## Observações

Esse projeto está sendo utilizado como exemplo para estudo de refatoração de arquitetura monolitica para arquitetura de micro serviços, dividindo cada entidade para um serviço.

Segue abaixo os repositórios de cada serviço:


