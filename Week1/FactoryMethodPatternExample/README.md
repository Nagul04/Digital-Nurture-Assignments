# Exercise 2 - Factory Method Pattern

## ✅ Objective
Use the Factory Method Pattern to create different types of documents (Word, PDF, Excel) in a structured and extensible way.

## 📘 Description
This Java program demonstrates the Factory Method Pattern by creating different document types using separate factory classes:
- Promotes loose coupling by delegating object creation to subclasses
- Makes it easier to introduce new document types in the future

## 📂 Files
- `Document.java` – Interface for documents
- `WordFactory.java`, `PdfFactory.java`, `ExcelFactory.java` – Factory classes for creating specific documents
- `Main.java` – Test class demonstrating use of all factories
- `output.png` – Screenshot showing console output for each document created

## 🖥️ Sample Output

## 📊 Time Complexity

- Creating an object via a factory is **O(1)** – straightforward instantiation.
- No loops or recursion involved.

## 🚀 Optimization

- Object creation is already efficient.
- If object construction becomes costly, consider using:
  - **Object caching** or
  - **Singleton pattern** for shared instances
- Factory design helps maintain open/closed principle for scalability.
