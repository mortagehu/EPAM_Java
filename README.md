# Gyakorlo feladat 2. hét

## 1. Project felállítása
- Létrehozol Github-on egy repot.
- A repo-hoz található HTTPS linket kimásolod.
- Elkészítesz IntelliJ-ben egy sima Java projectet (Create Git Repository fontos!)
  ![git](https://github.com/user-attachments/assets/a54f20d1-ec40-4b62-a09e-c20f7e482510)

- A generált fájlokat is commitolhatod.
- Mikor ez az ablak jelenik meg:
  ![https](https://github.com/user-attachments/assets/3c286c0c-d4d4-4346-aae3-0a6e8db94a47)
- Ide másold be a HTTPS linket, az origin maradhat.

## 2. Feladat elkészítése
- Az `src\main\java\HelloWorld`-ben található a kód, én switch-case-el oldottam meg.

## 3. JAR fájl generálása
- Terminálban bele mész abba a mappába, ahol a `HelloWorld.java` található.

  ```bash
  javac HelloWorld.java
  ```

- Fenti parancsot lefuttatod.
- Létrehozol a "java" mappában egy txt fájlt, neve lehet bármi (itt adod meg, mi a belépési pont, azaz mit futtasson majd a JVM).
- A txt fájlba ezt írd bele:

  ```plaintext
  Main-Class: HelloWorld
  ```

- Majd létrehozod a JAR fájlt:

  ```bash
  jar cfm hello-world.jar manifest.txt HelloWorld.class
  ```

- Futtatod a `.jar` fájlt ezzel a paranccsal:

  ```bash
  java -jar hello-world.jar
  ```
