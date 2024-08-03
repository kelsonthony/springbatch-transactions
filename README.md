# Spring Batch Transactions

Projeto para demonstrar como o Spring Batch gerencia transações dentro de um chunk.
O projeto possui um job que lê um arquivo de usuários e os insere no banco de dados.

## Estrutura do Projeto

- `src/main/java/com/kelsonthony/springbatchtransactions/config/DatasourceConfig.java`: Configuração das fontes de dados.
- `src/main/java/com/kelsonthony/springbatchtransactions/step/PessoaStep.java`: Configuração do step do Spring Batch.
- `src/main/resources/application.properties`: Configurações da aplicação.


## Roteiro

- [ ] [Controle transacional com 1 banco de dados]
- [ ] [Transação deixa de funcionar com a adição de um novo banco para escrita]
- [ ] [Ajustar para utilizar transação no banco secundário]


```markdown

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Batch
- MySQL
- Maven

## Configuração do Ambiente

1. **Banco de Dados**: Certifique-se de ter o MySQL instalado e rodando. Crie dois bancos de dados: `spring_batch` e `spring_batch_app`.

2. **Configuração do Banco de Dados**: Atualize o arquivo `src/main/resources/application.properties` com as credenciais do seu banco de dados.

```ini
spring.datasource.jdbcUrl=jdbc:mysql://<host>:<port>/spring_batch
spring.datasource.username=<username>
spring.datasource.password=<password>

app.datasource.jdbcUrl=jdbc:mysql://<host>:<port>/spring_batch_app
app.datasource.username=<username>
app.datasource.password=<password>
```

## Executando o Projeto

1. **Compilar o Projeto**: Execute o comando abaixo para compilar o projeto.
    ```sh
    mvn clean install
    ```

2. **Rodar a Aplicação**: Execute o comando abaixo para iniciar a aplicação.
    ```sh
    mvn spring-boot:run
    ```




## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
```
