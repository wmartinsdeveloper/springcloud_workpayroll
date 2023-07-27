# Projeto Java com Spring Cloud - Version 2.3.4

## Arquitetura do Projeto

![Roadmap](https://raw.githubusercontent.com/wmartinsdeveloper/springcloud_workpayroll/main/roadmap_project.jpg)

## Modelo Conceitual

![Modelo](https://raw.githubusercontent.com/wmartinsdeveloper/springcloud_workpayroll/main/model.jpg)


## Detalhes do Componentes

### 1 - API Gateway Zuul
   O API Gateway é uma ferramenta de gerenciamento de APIS, capaz de balancear 
   chamadas e controlar o volume do tráfego de dados com eficiência.

### 2 - Service Discovery - Eureka
   O Eureka é um servidor que pode ser configurado e implantado para ter alta disponibilidade,
   com cada servidor replicando estado sobre os serviços registrados para os demais servidores.

### 3 - Spring Cloud Feign
	Utilizado para possibilitar a comunicação do entre os microserviços 
   
### 4 - Ribbon load balacing
	Responsável em balancear as requisições entre diversas instancias do mesmo microserviços
   
### 5 - Microserviços

#### Worker
	Manter o cadastro dos trabalhadores com multiplas instâncias promovendo a escalabilidade.
	
#### Payroll
	Responsável em processar a folha de pagamento por meio de comunicação com o microserviço Worker
	
#### Auth 
	Responsável em estabelecer a autorização utilizando do modelo Auth e JWT Token
	
#### User
	Manter o cadastro dos usuários do sistema e seus respectivas papeis no sistema.

#### Database
	O SGBD como solução para este projeto é o MySQL por conta de sua estrutura conseguir atender
	aos requisitos deste projeto