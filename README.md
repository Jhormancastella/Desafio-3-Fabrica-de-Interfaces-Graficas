# 🎯 Desafío 3: Fábrica de Interfaces Gráficas 🎨

## 📌 Descripción

Expandir el sistema de interfaces gráficas para admitir más entornos:

- **Modo Oscuro**
- **Modo Claro**

Cada tema de UI debe permitir:

1. **Crear un botón estilizado** (`createStyledButton()`)
2. **Crear una barra de navegación** (`createNavBar()`)

---

## 🛠️ Tareas

1. **Usa Abstract Factory** para manejar los diferentes estilos de UI.
2. **Crea una fábrica concreta** para cada tema (Modo Oscuro, Modo Claro).
3. **Asegúrate de que los componentes sean compatibles** entre sí.

---

## 🚀 Estructura del Proyecto

### 📂 Clases Principales

1. **Interfaces:**
   - `UIFactory`: Define los métodos para crear componentes de UI.
   - `Button`: Define los métodos comunes para los botones.
   - `NavBar`: Define los métodos comunes para las barras de navegación.

2. **Fábricas Concretas:**
   - `DarkModeUIFactory`: Implementa `UIFactory` para crear componentes en modo oscuro.
   - `LightModeUIFactory`: Implementa `UIFactory` para crear componentes en modo claro.

3. **Componentes Concretos:**
   - `DarkModeButton`: Implementa `Button` para botones en modo oscuro.
   - `LightModeButton`: Implementa `Button` para botones en modo claro.
   - `DarkModeNavBar`: Implementa `NavBar` para barras de navegación en modo oscuro.
   - `LightModeNavBar`: Implementa `NavBar` para barras de navegación en modo claro.

4. **Cliente:**
   - `Client`: Solicita un tema de UI y utiliza la fábrica correspondiente para obtener los componentes.

---

## 🚀 Instalación y Configuración

### 📋 Requisitos Previos

- **Java Development Kit (JDK) 17 o superior**
- **Git instalado en tu sistema**

### 📥 Clonar Repositorio

```bash
git clone https://github.com/Jhormancastella/Desafio-3-Fabrica-de-Interfaces-Graficas.git
```

### 🛠️ Compilar y Ejecutar

1. Abre una terminal en la carpeta del proyecto.
2. Compila los archivos Java:

```bash
javac -d . *.java
```

3. Ejecuta el programa:

```bash
java Client
```

---

## 🛠️ Uso

1. **Selección de Tema:**
   - El programa solicitará al usuario seleccionar un tema de UI (Modo Oscuro, Modo Claro).

2. **Creación de Componentes:**
   - Una vez seleccionado el tema, se crearán un botón estilizado y una barra de navegación.

---

## 📋 Ejemplo de Ejecución

```plaintext
Seleccione el tema de UI (Modo Oscuro, Modo Claro): Modo Oscuro
Creando botón estilizado en Modo Oscuro...
Botón creado: [DarkModeButton]
Creando barra de navegación en Modo Oscuro...
Barra de navegación creada: [DarkModeNavBar]
```

---

## 📋 Características

- **Soporte para múltiples temas** (Modo Oscuro, Modo Claro).
- **Uso del patrón Abstract Factory** para garantizar flexibilidad y escalabilidad.
- **Interfaz común** para todos los componentes, permitiendo operaciones como crear botones y barras de navegación.

---

## 🚨 Estado del Ejercicio

- **Culminado.**

---

## 👤 Autor

- **Jhorman Jesús Castellanos Morales**