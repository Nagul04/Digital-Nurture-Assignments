# Exercise 1 - Singleton Pattern

## ✅ Objective
Ensure that a logging utility class has only one instance throughout the application lifecycle using the Singleton Design Pattern.

## 📘 Description
This Java program demonstrates the Singleton Pattern by implementing a `Logger` class that:
- Has a private static instance of itself
- Uses a private constructor to restrict instantiation
- Provides a public static method `getInstance()` to return the single instance

The `Main` class verifies that multiple calls to `getInstance()` return the same Logger object.

## 📂 Files
- `Logger.java` – Singleton class for logging
- `Main.java` – Test class to demonstrate Singleton behavior
- `output.png` – Screenshot showing both logger instances are the same

## 🖥️ Sample Output

## 📊 Time Complexity

- Accessing the singleton instance via `getInstance()` is **O(1)** (constant time).
- No loops or recursion involved.

## 🚀 Optimization

- To avoid synchronization overhead in multi-threaded environments, consider using:
  - **Eager initialization**, or
  - **Double-checked locking with `volatile`** (for thread-safe lazy initialization)
- Current implementation is efficient for single-threaded or basic scenarios.
