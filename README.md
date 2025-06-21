# Exercise 1 - Singleton Pattern

## Objective:
Ensure only one instance of a Logger class is used across the application using the Singleton Design Pattern.

## Description:
The `Logger` class restricts instantiation to a single object with:
- A private constructor
- A static `getInstance()` method

`Main.java` verifies that multiple calls to `getInstance()` return the same object.

## Files:
- `Logger.java` – Singleton Logger
- `Main.java` – Tests the Singleton behavior
