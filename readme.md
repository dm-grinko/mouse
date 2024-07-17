# Mouse Mover
## Description
Mouse Mover is a Java application that periodically moves the mouse cursor to prevent screen lock or sleep mode. It uses Java's Robot class to simulate mouse movements.

## Usage
To use Mouse Mover, follow these steps:

**Compile the Application:**

```bash
Copy code
javac Main.java
Run the Application:

```bash
Copy code
java Main <interval_in_minutes>
```
Replace <interval_in_minutes> with the interval (in minutes) at which you want the mouse to move. For example:

```bash
Copy code
java Main 10
```
This will move the mouse every 10 minutes.

**Alternatively, if you have the JAR file:**

```bash
Copy code
java -jar ./dist/mouse.jar 10
```
This will move the mouse every 10 minutes using the precompiled JAR file.


## Notes
Adjust the interval to suit your needs by specifying a different value in minutes.
Make sure Java Development Kit (JDK) is installed on your system to compile and run the application.
The application prevents the screen from locking by simulating a mouse movement to (0, 0) and then back to its original position.

## Requirements
Java Development Kit (JDK) 8 or higher.

## Disclaimer
This application is intended for preventing screen lock during presentations or similar activities. Use responsibly and ensure compliance with your organization's policies regarding automation and computer use.