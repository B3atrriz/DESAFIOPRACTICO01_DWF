# 🎓 Sistema de Gestión Escolar - Proyecto de Cátedra

Este es un sistema web multi-plataforma diseñado para la gestión académica de una institución escolar, permitiendo el control de **Alumnos, Materias, Profesores y Calificaciones**.

## 🛠️ Tecnologías Utilizadas

* **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate, Spring Security (JWT).
* **Frontend:** HTML5, CSS3 (Bootstrap 5), JavaScript Moderno (Fetch API).
* **Base de Datos:** MySQL / SQL Server.

##  Estructura del Proyecto

* `/backend`: Código fuente de la API REST en Spring Boot construido con Maven.
* `/frontend`: Interfaz gráfica web interactiva que consume los servicios del Backend.

---

## 🚀 Instrucciones de Ejecución

### 1. Requisitos Previos
Asegúrate de tener instalado:
* Java Development Kit (JDK) 17 o superior.
* IntelliJ IDEA o Eclipse.
* Un gestor de base de datos (XAMPP / MySQL / SQL Server).

### 2. Configuración del Backend
1. Abre la carpeta `backend` en tu IDE (IntelliJ).
2. Abre el archivo `src/main/resources/application.properties` y configura las credenciales de tu base de datos local (`username` y `password`).
3. Ejecuta la aplicación. El servidor levantará por defecto en: `http://localhost:8080`

### 3. Configuración del Frontend
1. Mueve o asegúrate de que la carpeta `frontend` esté accesible.
2. Abre el archivo `index.html` directamente en tu navegador o utilizando la extensión *Live Server* de VS Code.
3. El frontend está configurado para comunicarse automáticamente con la API en el puerto `8080`.

---

## 👤 Desarrollado por:
* **Estudiante:** Bea 
* **Institución:** Universidad Don Bosco (UDB)
* **Carrera:** Tecnico en computación
