# Explorando Padrões de Projeto com Spring Boot

## Introdução

Este projeto é uma API simples para inserção e consulta de dados utilizando CEPs do território nacional brasileiro. Ele serve como uma aplicação demonstrativa para o estudo e prática dos principais padrões de projeto, aplicados na prática com o framework Spring Boot.

O objetivo é explorar boas práticas de desenvolvimento e padrões de design, visando construir sistemas mais organizados, manuteníveis e escaláveis.

> Projeto desenvolvido durante o **Santander Bootcamp 2023: FullStack Angular + Java.**

## Tecnologias
- Java 17
- Spring Boot 3.x
- Maven
- JUnit 5 (para testes unitários)
- Lombok

## Estrutura do Projeto
```bash
src
 └── main
      ├── java
      │    └── com.suuzanemoura.labpadroesprojeto
      │         ├── config        # Configurações gerais do Spring
      │         ├── controller    # Controladores REST (API)
      │         ├── model         # Modelos de domínio / entidades
      │         ├── repository    # Repositórios para acesso a dados
      │         ├── service       # Lógica de negócio e serviços
      │         └── pattern       # Implementação dos padrões de projeto
      └── resources
           ├── application.properties # Configurações do Spring Boot
           └── static                  # Recursos estáticos (se houver)

```


## Instalação

### Pré-requisitos

- Java JDK 17 ou superior instalado
- Maven instalado
- IDE recomendada: IntelliJ IDEA, Eclipse ou VS Code com suporte Java

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/suuzanemoura/lab-padroes-projeto-spring.git
```

2. Acesse o diretório do projeto:
```bash
cd lab-padroes-projeto-spring
```

3. Compile e execute o projeto usando Maven:
```bash
mvn spring-boot:run
```

4. O servidor será iniciado na porta padrão 8080. Você pode acessar os endpoints configurados via API REST (caso existam).
   
5. Para executar os testes automatizados do projeto, rode o comando:
```bash
mvn test
```

## Destaques do Projeto

- **Aplicação de padrões de projeto**: Implementação prática de design patterns clássicos, como Singleton, Strategy e Factory Method, no contexto de uma aplicação com Spring Boot;
- **Integração com serviço de CEP**: Realiza a busca automática de informações de endereço com base no CEP informado, simulando integração com serviços externos;
- **Arquitetura em camadas**: Estrutura organizada em camadas (Controller, Service, Repository), seguindo princípios de separação de responsabilidades e boas práticas de desenvolvimento;
- **Uso de injeção de dependência**: Demonstração do uso eficaz da injeção de dependência provida pelo Spring Framework para promover acoplamento fraco e maior testabilidade;
- **Código modular e reutilizável**: Foco na criação de componentes coesos e reutilizáveis, facilitando a manutenção e escalabilidade do projeto.


## Endpoints
### 🟢 **Users**
- **POST** `/users` → Cria um novo usuário informando nome e CEP. O endereço é preenchido automaticamente a partir do CEP fornecido.
- **GET** `/users` → Retorna a lista completa de usuários cadastrados no sistema.
- **GET** `/users/{id}` → Retorna os dados de um usuário específico com base no ID informado.
- **PUT** `/users/{id}` → Atualiza os dados de um usuário existente (nome e/ou endereço), identificado pelo seu ID.
- **DELETE** `/users/:id` → Remove um usuário do sistema a partir do seu ID.

## Status do projeto

- ✅ Projeto concluído – aberto a melhorias futuras conforme disponibilidade.

## <img alt="Coração Roxo" height="15" src="https://github.com/suuzanemoura/suuzanemoura/assets/104701271/ce158244-38f2-4162-b0a4-24b1cfa66ef8"> **Contato**  
[![Email](https://img.shields.io/badge/-Gmail-EBE2F1?style=for-the-badge&logo=gmail&logoColor=460C68)](mailto:suuzanemoura@gmail.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-EBE2F1?style=for-the-badge&logo=linkedin&logoColor=460C68)](https://www.linkedin.com/in/suuzanemoura)
[![Behance](https://img.shields.io/badge/-Behance-EBE2F1?style=for-the-badge&logo=behance&logoColor=460C68)](https://www.behance.net/suzanemoura)
