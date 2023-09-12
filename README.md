# GoDigital Backend
Bem-vindo ao repositório do backend do projeto GoDigital, construído com Spring Boot. Para garantir uma configuração eficiente e rápida, nós containerizamos o banco de dados PostgreSQL usando o Docker.

## 🚀 Começando
Abaixo você encontrará todas as instruções para configurar e executar o projeto em seu ambiente local.

## 🛠️ Pré-requisitos
Você precisará ter instalado em sua máquina:

Java 11 ou superior.

Maven 3.6.0 ou superior.

Docker 19.03 ou superior.

## 🐳 Configurando o Docker
Antes de iniciarmos o projeto, é necessário configurar o banco de dados. Execute o seguinte comando para inicializar um container Docker com o PostgreSQL:

``
sudo docker run --name fiap -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
``

Este comando realiza as seguintes ações:

--name fiap: Define o nome do container como "fiap".

-e POSTGRES_PASSWORD=postgres: Define a senha do usuário PostgreSQL como "postgres".

-p 5432:5432: Mapeia a porta 5432 do container para a porta 5432 de sua máquina local.

-d postgres: Usa a imagem oficial do PostgreSQL.

Aguarde alguns minutos para que o container seja criado e inicializado.

## 🌱 Configurando o Projeto Spring Boot
Após configurar o banco de dados, siga estes passos:

Clone o repositório do projeto:

``
git clone https://github.com/mat-alcantara/backend-fiap
``

Navegue até o diretório do projeto:

``
cd backend-fiap
``

Compile e construa o projeto usando Maven:

``
mvn clean install
``

## 🏃‍♂️ Rodando a Aplicação
Agora você está pronto para iniciar a aplicação. Execute o seguinte comando:

``
mvn spring-boot:run
``

A aplicação estará disponível em http://localhost:3333.

## 📚 Documentação
Para informações adicionais, consulte a documentação oficial do Spring Boot e a documentação oficial do Docker.

## 🤝 Contribuindo
Para contribuir com o projeto, faça um fork do repositório e crie uma nova branch para realizar suas alterações. Após realizar as mudanças, abra um pull request.

## 📄 Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE.md para mais detalhes.

Obrigado por contribuir com o GoDigital!