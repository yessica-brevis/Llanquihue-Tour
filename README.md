
# 🧠 Evaluación Desarrollo Orientado a Objetos I Semana 5  
# 🚐 Llanquihue-Tour

---

## 👤 Autor del proyecto

- **Nombre completo:** Yessica Ximena Brevis Garnica
- **Sección:** 008A  
- **Carrera:** Analista Programador Computacional  
- **Sede:** Online  

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la Semana 5 de la asignatura Desarrollo Orientado a Objetos I.

La aplicación está desarrollada en Java y permite gestionar la información de empleados de la agencia de turismo **Llanquihue Tour**.

El sistema realiza la lectura de datos desde un archivo de texto (`empleados.txt`), los transforma en objetos utilizando programación orientada a objetos y los organiza en estructuras dinámicas para su procesamiento.

Incluye validación de datos como el RUT mediante excepciones personalizadas, además del uso de capas separadas para mejorar la modularidad del sistema.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 LlanquihueTour/

├── 📁 resources/                 # Archivos de datos del sistema
│   └── empleados.txt             # Base de datos de empleados en formato texto

├── 📁 src/

│   ├── 📁 app/                   # Capa principal de ejecución
│   │   └── Main.java             # Punto de entrada del programa

│   ├── 📁 model/                 # Capa de dominio (entidades)
│   │   ├── Persona.java          # Clase base Persona
│   │   ├── Empleado.java         # Hereda de Persona
│   │   ├── Direccion.java        # Representa dirección del empleado
│   │   └── Rut.java              # Manejo y validación de RUT

│   ├── 📁 service/                  # Lógica de negocio
│   │   └── EmpleadoService.java     # Gestión de empleados (listas, filtros)

│   └── 📁 util/                        # Utilidades del sistema
│       ├── LectorArchivo.java          # Lectura de empleados.txt
│       └── RutInvalidoException.java   # Excepción personalizada

⚙️ Instrucciones para compilar y ejecutar
Clonar o descargar el repositorio:
git clone https://github.com/yessica-brevis/Llanquihue-Tour.git
Abrir el proyecto en NetBeans o IntelliJ IDEA.
Verificar que el archivo empleados.txt se encuentre en:
resources/empleados.txt
Compilar el proyecto.
Ejecutar la clase:
app.Main
Revisar la salida del programa en consola.

📂 Repositorio GitHub
https://github.com/yessica-brevis/Llanquihue-Tour.git

📅 Fecha de entrega
22/06/2026
