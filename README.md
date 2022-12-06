# BACEN - Expectativas Mensais


# Sobre o projeto

API de consulta de dados mensais do BACEN.

A aplicação consiste em uma pesquisa de dados econômicos públicos, os dados são coletados via processo de OnBoarding, e depois são listados conforme método escolhido.

## Layout web
<img width="753" alt="image" src="https://user-images.githubusercontent.com/106829344/205995079-0aaa839d-5ea0-45d8-a89b-39ed0e3299ad.png">

![Web 2]
<img width="649" alt="image" src="https://user-images.githubusercontent.com/106829344/205995346-7644645b-1ff1-4696-a082-5982b9b67bca.png">


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
>Executar a classe ProjectAplication

## Insomnia
>Inserir a URL localhost:8080/mensaisClient

## Executando Métodos no Insomnia
POST
>localhost:8080/mensaisClient/saveMensais
>Salva informações no banco de dados
>No campo Json inserir as informações a serem salvas no banco de dados
>Send

DELETE
>localhost:8080/mensaisClient/deleteMensais/{id}
>Exclui informação do banco de dados
>Informar o ID do registro que será excluído após a última barra ("/"), também é necessário apagar as chaves ("{}")
>Send

GET BY ID
>localhost:8080/mensaisClient/getByIdMensais/{id}
>Busca informações por ID de registro
>Informar o ID registro de busca no banco de dados após a última barra ("/"), também é necessário apagar as chaves ("{}")
>Send

UPDATE
>localhost:8080/mensaisClient/updateMensais/{id}
>Atualiza informações já existentes no banco de dados
>Informar o ID do registro existente que será atualizado após a última barra ("/"), também é necessário apagar as chaves ("{}")
>No campo Json inserir as informações a serem salvas no banco de dados
>Send

GET DATA REFERÊNCIA
>localhost:8080/mensaisClient/getMensaisReferencia?mensaisDataReferencia={inserir data}
>Busca informações por data de referência 
>Informar a data nom formato MM/AAAA, é necessário remover as chaves ({})
>Send

GET ALL
>localhost:8080/mensaisClient/getAllMensais?page=0
>Retorna todos os registros do banco de dados com paginação 
>No parâmetro page é necessário informar a página, iniciar com 0 e seguir atualizando a URL em ordem crescente para as buscas nas páginas seguintes. Cada página retorna 20 registros.
>Send



# Autor

Luísa Cristina da Silva Araújo



