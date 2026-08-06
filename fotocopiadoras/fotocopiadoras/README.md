# Fotocopiadoras - API REST (Spring Boot)

CRUD sencillo para la gestión de fotocopiadoras.

## Tecnologías

- Spring Boot 4.1.0
- Java 17
- Maven
- Spring Web
- Spring Data JPA
- MySQL Driver
- Validation
- Lombok
- Spring Boot DevTools

## Estructura del proyecto

```
src/main/java/com/inventario/fotocopiadoras
├── controller/
├── model/
├── repository/
├── service/
├── config/
└── FotocopiadorasApplication.java
src/main/resources/
└── application.properties
```

## Configuración de base de datos

Antes de ejecutar el proyecto, crea la base de datos en MySQL (o deja que se cree automáticamente gracias a `createDatabaseIfNotExist=true`):

```sql
CREATE DATABASE IF NOT EXISTS bd_fotocopiadoras;
```

Los datos de conexión están en `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bd_fotocopiadoras
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Ajusta usuario/contraseña según tu instalación local de MySQL.

## Cómo ejecutar

### Opción 1: Desde IntelliJ IDEA / VS Code

1. Abre la carpeta del proyecto (`File > Open`).
2. El IDE detectará el `pom.xml` y descargará las dependencias automáticamente.
3. Ejecuta la clase `FotocopiadorasApplication.java` (botón "Run" / "▶").

### Opción 2: Desde la terminal con Maven instalado

```bash
mvn clean install
mvn spring-boot:run
```

> Si no tienes Maven instalado, puedes generar el wrapper ejecutando `mvn -N io.takari:maven:wrapper` (con Maven ya instalado una sola vez), o instalar Maven desde https://maven.apache.org/download.cgi

La aplicación se levanta en `http://localhost:8080`.

## Endpoints disponibles

| Método | Endpoint                  | Descripción                      |
|--------|----------------------------|-----------------------------------|
| GET    | `/fotocopiadoras`          | Lista todas las fotocopiadoras   |
| GET    | `/fotocopiadoras/{id}`     | Obtiene una fotocopiadora por id |
| POST   | `/fotocopiadoras`          | Crea una nueva fotocopiadora     |
| PUT    | `/fotocopiadoras/{id}`     | Actualiza una fotocopiadora      |
| DELETE | `/fotocopiadoras/{id}`     | Elimina una fotocopiadora        |

### Ejemplo de cuerpo (JSON) para POST/PUT

```json
{
  "marca": "Xerox",
  "modelo": "WorkCentre 5945",
  "serie": "SN-123456",
  "estado": "Operativa"
}
```

## Notas

- Asegúrate de tener instalado el plugin de **Lombok** en tu IDE (IntelliJ / VS Code) para que la anotación `@Data` funcione correctamente en el editor.
- Si tu IDE marca errores de Lombok, habilita "annotation processing" en la configuración del IDE.
- Verifica que la versión `4.1.0` de Spring Boot esté disponible en el repositorio Maven Central al momento de compilar; si no lo está, ajusta la versión del `<parent>` en `pom.xml` a la última versión estable de Spring Boot 3.x compatible con Java 17.
