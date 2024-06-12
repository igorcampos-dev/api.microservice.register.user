# API para Criação de Usuário e Envio de Email de Boas-Vindas

## Introdução

Este projeto foi desenvolvido por Igor de Campos com o objetivo de testar suas habilidades lógicas e experiências em programação, especificamente em microserviços. O sistema básico criado permite a criação de usuários e o envio de emails para eles.

## Sobre o Projeto

O microserviço de criação do usuário tem como principal objetivo criar um usuário e enviar um email de validação para ele. Embora seja um projeto relativamente simples, é importante analisar questões que demandam tempo de desenvolvimento, como:

- Validação dos campos;
- Documentação dos controladores e possíveis exceções;
- Envio e captação de mensagens usando RabbitMQ e conceitos de filas;
- Envio de email pelo sistema;
- Comunicação entre microserviços;
- Uso do Spring Actuator para acessar as rotas pelo Swagger e verificar os estados da aplicação;
- Logs para facilitar a depuração.

## Swagger

Os projetos estarão disponíveis no Swagger nas seguintes rotas:

### Local
- User-MS: [clique aqui](http://localhost:8081/swagger-ui/index.html#/)
- Email-MS: [clique aqui](http://localhost:8082/swagger-ui/index.html#/)

### Docker
- User-MS: [clique aqui](http://localhost:81/swagger-ui/index.html#/)
- Email-MS: [clique aqui](http://localhost:82/swagger-ui/index.html#/)

## Diagrama Demonstrando a Lógica do Projeto

<img src="readme-archives/diagrama.png" alt="Diagrama" width="600" height="400">

## Passo a passo de como executar o projeto

Acesse o link desse vídeo para poder gerar a credencial necessária para utilizar o projeto: [aqui](https://www.youtube.com/watch?v=lSURGX0JHbA)

configure as credenciais que estão definidas no: application.properties dos dois microserviços,e o docker compose.
ajuste as credenciais que estão definidas como: SEU_EMAIL_AQUI e SUA_SENHA_AQUI dos arquivos ditos.

### Requisitos
- docker
- jdk 17
- conta de email

### Local

execute:
```bash
docker compose up -d rabbitmq
docker compose up -d database
```

após isso,execute as classes principais dos microserviços, e aguarde o processo de inicialização,acesse o swagger para facilitar.

### Docker

execute:
```bash
docker compose up
```

e aguarde o processo de inicialização dos containers.
