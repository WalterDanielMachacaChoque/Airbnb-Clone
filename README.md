# Airbnb clone (fullstack project) Spring boot 3, Angular 17, PrimeNG, PostgreSQL, Auth0 (2024) (Backend)

## Tabla de contenido

- [Descripción general](#overview)
- [Características](#features)
- [Tecnologías utilizadas](#technologies-used)
    - [Backend (airbnb-clone-back)](#backend-book-social-network)
    - [Frontend (airbnb-clone-front)](#frontend-book-social-network-ui)
- [Instalacion](#getting-started)
- [Vista Previa](#Preview)

## Descripción general

Airbnb clone es una aplicación completa. La aplicación garantiza la seguridad mediante tokens JWT y Auth0 (OAuth2). Cumple con las mejores prácticas en el diseño de API REST. El backend está construido con Spring Boot 3 y Spring Security 6, mientras que el frontend se desarrolla usando Angular con Bootstrap para diseño.

## Características

- 📅 Gestión de reservas de viajeros.
- 🏠 Gestión de reservas de propietarios.
- 🔍 Búsqueda de casas por criterios (ubicación, fecha, huéspedes, camas, etc).
- 🔐 Autenticación y Autorización (Gestión de Roles) con Auth0 (OAuth2).
- 🏢 Domain-driven design.

## Tecnologías utilizadas

### Backend (airbnb-clone-back)

- Spring Boot 3
- Spring Security 6
- JWT Token Authentication
- Spring Data JPA
- OpenAPI and Swagger UI Documentation
- Docker
- GitHub Actions
- Auth0 (OAuth2)

### Frontend (airbnb-clone-front)

- Angular
- Component-Based Architecture
- OpenAPI Generator for Angular
- Bootstrap
- PrimeNG

## Instalacion

Para comenzar con el proyecto Airbnb clone, siga las instrucciones de configuración en los directorios respectivos:

Para configurar el backend del proyecto Airbnb clone, siga estos pasos:

1. Clone the repository:

```bash
   git clone https://github.com/WalterDanielMachacaChoque/Airbnb-Clone
```

2. Ejecute el archivo docker-compose:

```bash
  docker-compose up -d
```

3. Navegue hasta el directorio de airbnb-clone-back:

```bash
  cd airbnb-clone-back
```

4. Instalar dependencias (suponiendo que Maven esté instalado):

```bash
  mvn clean install
```

4. Ejecute la aplicación pero primero reemplace `x.x.x` con la versión actual del archivo `pom.xml`

```bash
  java -jar target/airbnb-clone-back-api-x.x.x.jar
```

5. Acceda a la documentación de la API utilizando Swagger UI:

Abra un navegador web y vaya a `http://localhost:8089/swagger-ui/index.html.

##Servidor de desarrollo (Angular)

Ejecute `ngserve` para un servidor de desarrollo. Navegue hasta `http://localhost:4200/`. La aplicación se recargará automáticamente si cambia alguno de los archivos fuente.


## Build

Ejecute `ng build` para construir el proyecto. Los artefactos de compilación se almacenarán en el directorio `dist/`.

## Vista Previa:

### Home:

![My Image](https://i.postimg.cc/L88t8tvV/home.jpg)

### Login (Auth0 (OAuth2))

![My Image](https://i.postimg.cc/3JcR22Y1/login.jpg)

### Reserve (Muestra usuario, El total del precio de dias que desea reservar):

![My Image](https://i.postimg.cc/V6f1xNz5/reservar-habitacion1.jpg)
![My Image](https://i.postimg.cc/tT8bYNhn/reservar-habitacion2.jpg)

### Reserve (Vista de la ultima Reserva existosa):

![My Image](https://i.postimg.cc/Hn0Ndw3g/reservar-habitacion3.jpg)

### My Properties (Agregar Propiedades que alquila el usuario):

![My Image](https://i.postimg.cc/SxHf1X77/agregar-propiedades1.jpg)
![My Image](https://i.postimg.cc/hPX0gbjR/agregar-propiedades2.jpg)
![My Image](https://i.postimg.cc/XvBhJGgp/agregar-propiedades3.jpg)
![My Image](https://i.postimg.cc/rsMYQh2r/agregar-propiedades4.jpg)
![My Image](https://i.postimg.cc/vTh2jWGS/agregar-propiedades5.jpg)

### My Properties (Propiedad Agregada exitosamente):

![My Image](https://i.postimg.cc/FRgTdjks/agregar-propiedades6.jpg)


## Recomendaciones:

- El puerto elegido para el Backend es el "8089", usted puede elegir el que mas le guste.
- Recuerde cambiar las configuraciones de la conexion a la base de datos en los archivos ".yml", tambien el archivo de docker-compose.
