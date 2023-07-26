# Projeto Java com Spring Cloud

## Arquitetura do Projeto

![Roadmap](https://raw.githubusercontent.com/wmartinsdeveloper/springcloud_workpayroll/main/roadmap_project.jpg)

## Modelo Conceitual

![Modelo](https://raw.githubusercontent.com/wmartinsdeveloper/springcloud_workpayroll/main/roadmap_project.jpg)


## Detalhes do Componentes

### 1 - API Gateway Zuul
   O API Gateway é uma ferramenta de gerenciamento de APIS, capaz de direcionar 
   chamados e controlar o volume do tráfego de dados com eficiência.

### 2 - Service Discovery - Eureka
   O Eureka é um servidor que pode ser configurado e implantado para ter alta disponibilidade,
   com cada servidor replicando estado sobre os serviços registrados para os demais servidores.
   
### 3 - Microserviços

#### Worker
	Manter o cadastro dos trabalhadores com multiplas instâncias promovendo a escalabilidade.
	
#### Payroll
	Responsável em processar a folha de pagamento por meio de comunicação com o microserviço Worker