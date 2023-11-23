# eshop.backend
eShop exercise with Spring Booy and H2

### Download
> $ git clone https://github.com/arquitechthor/eshop.backend.git

### Install & Run
You can use maven wrapper from Spring Initializr, but will need Java 17 for run:
> $ ./mvnw clean spring-boot:run

Also you can use docker for running the project:
> docker build -t eshop .

then
> docker run -p 9000:9000 eshop

