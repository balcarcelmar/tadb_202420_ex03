# Proyecto tabd_202420_ex03

Este proyecto es una API REST en **Spring Boot** que gestiona elementos químicos. Provee operaciones básicas de CRUD (Create, Read, Update, Delete) 

## **Requisitos Previos**

1. **Java 17** (o superior) instalado
3. **PostgreSQL**
4. **DBeaver** u otro cliente donde pueda visualizarla base de datos si lo desea
5. **IntelliJ IDEA** para abrir y ejecutar el proyecto

## Abrir el proyecto
Espera a que IntelliJ cargue el proyecto:
Cuando IntelliJ detecta un proyecto basado en Maven (por el archivo pom.xml), comenzará automáticamente a descargar las dependencias necesarias desde Internet, espere a que craguen las dependencias, luego de ello puede correrlo sin problemas

## NOTAS
* El repository está vacío porque extiende de JPA (Libreria de java que nos facilita la interacción de la base de datos, este tipo de librería es llama ORM)
* la capa context está vacía porque en Spring (Framework) la conexión de base de datos se hace con el application.properties y SpringData (Módulo de spring) se encarga de la conexión
* Los Modelos no tienen getters, setters, ni contructores porque se usó una librería de Java llamada Lombok que mediante anotaciones nos crea implicitamente estos métodos

---

## **Configuración de la Base de Datos**

1. **Conectarse a la base de datos**
Desde application.properties modificar los datos de conexión

spring.application.name=tadb_202420_ex03
spring.datasource.url=jdbc:postgresql://{IP/localhost}:5432/postgres
spring.datasource.username={username}
spring.datasource.password={password}
spring.datasource.driver-class-name=org.postgresql.Driver

3. **Crear la base de datos en PostgreSQL:**

create table elements (

	id BIGINT PRIMARY KEY,
	name varchar(100),
	symbol varchar(100),
	atomic_number float,
	electronic_configuration varchar(100)

);

**Se debe crear una secuencia para poner en funcionamiento el GUID**

CREATE SEQUENCE elements_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

create table compound (

	id BIGINT PRIMARY KEY,
	name varchar(100),
	chemical_formula varchar(100),
	molar_mass float,
	aggregation_state varchar(100)

);

CREATE SEQUENCE compound_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


Luego de creadas las tablas y las secuencias, la API estará lista para ejecutarse.

## **Resumen de Endpoints Disponibles**
Endpoints de Element:

* Obtener todos los elementos
Método: GET
URL: /elements/findAll

* Buscar un elemento por ID
Método: GET
URL: /elements//findById/{elementId}

* Añadir un nuevo elemento
Método: POST
URL: /elements7addElement

* Actualizar un elemento existente
Método: PUT
URL: /elements/{elementId}

* Eliminar un elemento por ID
Método: DELETE
URL: /elements/deleteElement/{elementId}

## **Endpoints de Compound:**

* Obtener todos los compuestos
Método: GET
URL: /compound/findAll

* Buscar un compuesto por ID
Método: GET
URL: /compound/findById/{compoundId}

* Añadir un nuevo compuesto
Método: POST
URL: /compound/addElement

* Actualizar un compuesto existente
Método: PUT
URL: /compound/updateElement/{compoundId}

* Eliminar un compuesto por ID
Método: DELETE
URL: /compound/deleteElement/{compoundId}
