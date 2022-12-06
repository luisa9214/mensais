# BACEN - Expectativas Mensais


# Sobre o projeto

API de consulta de dados mensais do BACEN.

A aplicação consiste em uma pesquisa de dados econômicos públicos, os dados são coletados via processo de OnBoarding, e depois são listados conforme método escolhido.

## Layout web
<img width="753" alt="image" src="https://user-images.githubusercontent.com/106829344/205995079-0aaa839d-5ea0-45d8-a89b-39ed0e3299ad.png">




# Tecnologias utilizadas
- Java 11
- Spring Boot
- JPA 
- Maven
- Lombok
- Insomnia
- GitFlow
- Banco de dados: MySQL

# Como executar o projeto

## IntelliJ
Pré-requisitos: Java 11
Executar a classe ProjectAplication

## Insomnia
Inserir a URL localhost:8080/mensaisClient

## Executando Métodos no Insomnia
## POST
Acessar a URL localhost:8080/mensaisClient/saveMensais, a função do método é salvar os dados no banco. No campo Json inserir as informações a serem salvas no banco de dados e clicar em SEND.

DELETE
Acessar a URL localhost:8080/mensaisClient/deleteMensais/{id}, a função é excluir informações do banco de dados. Informar o ID do registro que será excluído após a última barra ("/"), também é necessário apagar as chaves ("{}"). Clicar em SEND


GET BY ID
Acessar a URL localhost:8080/mensaisClient/getByIdMensais/{id}, a função é buscar informações por ID de registro no banco de dados. Informar o ID registro de busca no banco de dados após a última barra ("/"), também é necessário apagar as chaves ("{}"). Clicar em SEND

UPDATE
Acessar a URL localhost:8080/mensaisClient/updateMensais/{id}, a função é autalizar informações já existentes no banco de dados. Informar o ID do registro existente que será atualizado após a última barra ("/"), também é necessário apagar as chaves ("{}"). No campo Json inserir as informações a serem salvas no banco de dados e clicar em SEND.

GET DATA REFERÊNCIA
Acessar a URL localhost:8080/mensaisClient/getMensaisReferencia?mensaisDataReferencia={inserir data}, a função é buscar informações por data de referência. Informar a data nom formato MM/AAAA, é necessário remover as chaves ({}). Clicar em SEND.

GET ALL
Acessar a página localhost:8080/mensaisClient/getAllMensais?page=0, a função é retornar todos os registros do banco de dados com paginação. No parâmetro page é necessário informar a página, iniciar com 0 e seguir atualizando a URL em ordem crescente para as buscas nas páginas seguintes. Cada página retorna 20 registros. Clicar em SEND.



# Autor

Luísa Cristina da Silva Araújo



