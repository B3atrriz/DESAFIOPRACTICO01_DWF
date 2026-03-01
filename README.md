# Sistema Escolar Básico con Spring Boot

## Descripción
Sistema escolar con persistencia en base de datos H2 usando Spring Boot y JPA.

## Tecnologías
- Java 17
- Spring Boot 3.3.8
- Spring Data JPA
- H2 Database
- Lombok
- JUnit 5

## Estructura de Base de Datos
- Profesor (id, nombre)
- Alumno (id, nombre, apellido)
- Materia (id, nombre, id_profesor)
- Alumno_Materia (id_alumno, id_materia)

## Cómo ejecutar
1. Clonar repositorio
2. Abrir en IntelliJ IDEA
3. Ejecutar `SpringSchoolSystemApplication`
4. Acceder a H2 Console: http://localhost:8080/h2-console

## Video demostrativo
[Enlace](https://youtu.be/OAoqcHjKiv0)
