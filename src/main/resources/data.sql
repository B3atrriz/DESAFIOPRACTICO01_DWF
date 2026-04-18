-- ========================================
-- INSERTAR PROFESORES (5 registros)
-- ========================================
INSERT INTO profesor (nombre) VALUES ('Carlos Rodríguez');
INSERT INTO profesor (nombre) VALUES ('María López');
INSERT INTO profesor (nombre) VALUES ('Juan Pérez');
INSERT INTO profesor (nombre) VALUES ('Ana Martínez');
INSERT INTO profesor (nombre) VALUES ('Pedro Sánchez');

-- ========================================
-- INSERTAR ALUMNOS (5 registros)
-- ========================================
INSERT INTO alumno (nombre, apellido) VALUES ('Luis', 'García');
INSERT INTO alumno (nombre, apellido) VALUES ('Sofía', 'Hernández');
INSERT INTO alumno (nombre, apellido) VALUES ('Diego', 'Ramírez');
INSERT INTO alumno (nombre, apellido) VALUES ('Valentina', 'Torres');
INSERT INTO alumno (nombre, apellido) VALUES ('Andrés', 'Flores');

-- ========================================
-- INSERTAR MATERIAS (5 registros)
-- ========================================
INSERT INTO materia (nombre, id_profesor) VALUES ('Matemáticas', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('Lenguaje', 2);
INSERT INTO materia (nombre, id_profesor) VALUES ('Ciencias', 3);
INSERT INTO materia (nombre, id_profesor) VALUES ('Historia', 4);
INSERT INTO materia (nombre, id_profesor) VALUES ('Inglés', 5);

-- ========================================
-- INSERTAR INSCRIPCIONES (10 registros)
-- ========================================
-- Alumno 1 (Luis García) inscrito en Matemáticas y Lenguaje
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1, 1);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1, 2);

-- Alumno 2 (Sofía Hernández) inscrita en Matemáticas y Ciencias
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (2, 1);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (2, 3);

-- Alumno 3 (Diego Ramírez) inscrito en Historia e Inglés
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (3, 4);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (3, 5);

-- Alumno 4 (Valentina Torres) inscrita en Lenguaje y Ciencias
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (4, 2);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (4, 3);

-- Alumno 5 (Andrés Flores) inscrito en Matemáticas e Inglés
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (5, 1);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (5, 5);