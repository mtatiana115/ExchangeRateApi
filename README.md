# 💱 Exchange Rate API - Conversor de Monedas
Una aplicación de consola elegante y eficiente para convertir monedas en tiempo real 🌍

---

## 🚀 Características

✨ **Conversión en tiempo real** - Obtén tasas de cambio actualizadas al instante  
🌎 **Soporte para múltiples monedas** - Más de 160 monedas disponibles  
💻 **Interfaz de consola intuitiva** - Navegación simple y clara  
⚡ **Respuesta rápida** - Conversiones instantáneas con la API ExchangeRate  
🎯 **Opciones predefinidas** - Conversiones rápidas para monedas latinoamericanas  
🔧 **Manejo robusto de errores** - Validación completa de entrada de datos  

## 🏗️ Arquitectura del Proyecto

```
ExchangeRateApi/
├── 📁 src/main/java/
│   ├── 📄 App.java                    # Punto de entrada principal
│   ├── 📁 api/
│   │   └── 📄 ExchangeRateAPI.java    # Cliente HTTP para la API
│   ├── 📁 model/
│   │   └── 📄 ExchangeRateResponse.java # Modelo de datos de respuesta
│   ├── 📁 service/
│   │   └── 📄 CurrencyConverter.java   # Lógica de conversión
│   └── 📁 ui/
│       └── 📄 ConsoleUI.java          # Interfaz de usuario
├── 📁 lib/
│   └── 📄 gson-2.10.1.jar            # Dependencia Gson
├── 📁 bin/                            # Clases compiladas
└── 📄 README.md
```

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| **Java** | 17+ | Lenguaje principal |
| **Gson** | 2.10.1 | Serialización/deserialización JSON |
| **HTTP Client** | Java 11+ | Cliente HTTP nativo |
| **ExchangeRate-API** | v6 | Proveedor de tasas de cambio |

## 📋 Prerequisitos

Antes de comenzar, asegúrate de tener instalado:

- ☕ **Java Development Kit (JDK) 11 o superior**
- 🔑 **API Key de ExchangeRate-API** (disponible gratuitamente en [exchangerate-api.com](https://exchangerate-api.com))
- 📱 **Terminal o línea de comandos**

## ⚡ Instalación y Configuración

### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/exchange-rate-api.git
cd ExchangeRateApi
```

### 2️⃣ Verificar la estructura
Asegúrate de que tienes la siguiente estructura:
```
ExchangeRateApi/
├── src/main/java/...
├── lib/gson-2.10.1.jar
└── bin/ (se creará automáticamente)
```

### 3️⃣ Configurar API Key
Edita el archivo `src/main/java/App.java` y reemplaza la API key:
```java
String apiKey = "TU_API_KEY_AQUI"; // Reemplaza con tu clave
```

## 🚀 Ejecutar el Proyecto

### 📦 Compilación
Abre tu terminal en la carpeta raíz del proyecto y ejecuta:

```bash
# 🔨 Compilar todos los archivos Java
javac -cp ".:lib/gson-2.10.1.jar" \
    src/main/java/App.java \
    src/main/java/ui/ConsoleUI.java \
    src/main/java/service/CurrencyConverter.java \
    src/main/java/api/ExchangeRateAPI.java \
    src/main/java/model/ExchangeRateResponse.java \
    -d bin
```

### ▶️ Ejecución
Una vez compilado exitosamente:

```bash
# 🎯 Ejecutar la aplicación
java -cp "bin:lib/gson-2.10.1.jar" main.java.App
```

### 🖥️ Ejecución en diferentes sistemas

<details>
<summary><b>🪟 Windows</b></summary>

```cmd
:: Compilar
javac -cp ".;lib/gson-2.10.1.jar" src/main/java/App.java src/main/java/ui/ConsoleUI.java src/main/java/service/CurrencyConverter.java src/main/java/api/ExchangeRateAPI.java src/main/java/model/ExchangeRateResponse.java -d bin

:: Ejecutar
java -cp "bin;lib/gson-2.10.1.jar" main.java.App
```
</details>

<details>
<summary><b>🐧 Linux/Mac</b></summary>

```bash
# Compilar
javac -cp ".:lib/gson-2.10.1.jar" \
    src/main/java/App.java \
    src/main/java/ui/ConsoleUI.java \
    src/main/java/service/CurrencyConverter.java \
    src/main/java/api/ExchangeRateAPI.java \
    src/main/java/model/ExchangeRateResponse.java \
    -d bin

# Ejecutar
java -cp "bin:lib/gson-2.10.1.jar" main.java.App
```
</details>

## 💰 Monedas Soportadas

### 🌟 Conversiones Rápidas Predefinidas
- 🇺🇸 **USD** → 🇦🇷 **ARS** (Peso Argentino)
- 🇺🇸 **USD** → 🇧🇴 **BOB** (Boliviano)
- 🇺🇸 **USD** → 🇧🇷 **BRL** (Real Brasileño)
- 🇺🇸 **USD** → 🇨🇱 **CLP** (Peso Chileno)
- 🇺🇸 **USD** → 🇨🇴 **COP** (Peso Colombiano)

### 🌍 Otras monedas disponibles
EUR, GBP, JPY, CNY, AUD, CAD, CHF, SEK, NOK, DKK, y más de 150 monedas adicionales.

## 🎮 Uso de la Aplicación

Al ejecutar la aplicación, verás un menú interactivo:

```
¡Bienvenido al Conversor de Monedas!

Seleccione una opción:
1. USD a ARS (Peso Argentino)
2. USD a BOB (Boliviano Boliviano)
3. USD a BRL (Real Brasileño)
4. USD a CLP (Peso Chileno)
5. USD a COP (Peso Colombiano)
6. Otra moneda
7. Salir
Opción: 
```

### 🔄 Ejemplo de conversión
```
Opción: 1
Ingrese cantidad a convertir: 100

100.00 USD = 36,250.50 ARS
```

## 🛠️ Scripts de Automatización

### 📄 Crear script de compilación (`compile.sh` / `compile.bat`)

**Linux/Mac (`compile.sh`):**
```bash
#!/bin/bash
echo "🔨 Compilando aplicación..."
javac -cp ".:lib/gson-2.10.1.jar" \
    src/main/java/App.java \
    src/main/java/ui/ConsoleUI.java \
    src/main/java/service/CurrencyConverter.java \
    src/main/java/api/ExchangeRateAPI.java \
    src/main/java/model/ExchangeRateResponse.java \
    -d bin
echo "✅ Compilación completada!"
```

**Windows (`compile.bat`):**
```batch
@echo off
echo 🔨 Compilando aplicación...
javac -cp ".;lib/gson-2.10.1.jar" src/main/java/App.java src/main/java/ui/ConsoleUI.java src/main/java/service/CurrencyConverter.java src/main/java/api/ExchangeRateAPI.java src/main/java/model/ExchangeRateResponse.java -d bin
echo ✅ Compilación completada!
```

### ▶️ Crear script de ejecución (`run.sh` / `run.bat`)

**Linux/Mac (`run.sh`):**
```bash
#!/bin/bash
echo "🚀 Iniciando Conversor de Monedas..."
java -cp "bin:lib/gson-2.10.1.jar" main.java.App
```

**Windows (`run.bat`):**
```batch
@echo off
echo 🚀 Iniciando Conversor de Monedas...
java -cp "bin;lib/gson-2.10.1.jar" main.java.App
```

## 🐛 Solución de Problemas

### ❌ Error: "no se ha encontrado o cargado la clase principal"
```bash
# ✅ Solución: Usar el nombre completo del paquete
java -cp "bin:lib/gson-2.10.1.jar" main.java.App  # ✅ Correcto
java -cp "bin:lib/gson-2.10.1.jar" App            # ❌ Incorrecto
```

### ❌ Error: "ClassNotFoundException: com.google.gson..."
- Verifica que `lib/gson-2.10.1.jar` existe en tu proyecto
- Asegúrate de incluir la librería en el classpath durante la ejecución

### ❌ Error: "Moneda no soportada"
- Verifica que el código de moneda sea válido (ej: USD, EUR, COP)
- Los códigos deben estar en mayúsculas y seguir el estándar ISO 4217

## 📊 Características Técnicas

- 🏛️ **Patrón de Arquitectura:** Separación de responsabilidades (MVC-like)
- 🔐 **Seguridad:** Validación de entrada y manejo de errores
- 📡 **API:** RESTful HTTP Client con Java 11+
- 🔄 **Datos:** Serialización/deserialización automática con Gson
- ⚡ **Performance:** Conexiones HTTP reutilizables y eficientes

## 🤝 Contribuir

Las contribuciones son bienvenidas! Para contribuir:

1. 🍴 Fork el proyecto
2. 🌿 Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push a la rama (`git push origin feature/AmazingFeature`)
5. 🔀 Abre un Pull Request

## 👩‍💻 Autor

**Tatiana** - *Desarrolladora Full Stack*
