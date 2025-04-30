# 🏭 Factory Method Pattern

## 🔍 What is the Factory Method Pattern?

The Factory Method pattern provides an **interface for creating objects**, but allows **subclasses to alter the type of objects that will be created**.

It promotes **loose coupling** by delegating the responsibility of instantiating objects to subclasses or implementing classes, instead of calling a constructor directly.

---

## 🎯 Purpose

- To encapsulate the object creation logic.
- To support **extensibility** without modifying existing code.
- To follow the **Open/Closed Principle** — open for extension, closed for modification.

---

## 💡 Real-World Analogy

Imagine a **transportation company**. The base company knows how to **deliver**, but doesn’t care whether it's by **truck**, **bike**, or **drone** — that decision is delegated to the **logistics branch** (subclass).

Each branch implements its own factory method to produce a specific kind of vehicle. The main company uses the same interface, regardless of the actual vehicle being used.

---

## 🧠 Concept Breakdown

- **Creator (Factory)**: Defines a method to create an object but lets subclasses override it.
- **Concrete Creators**: Implement the factory method to create specific types.
- **Product**: The object that is created.
- **Clients**: Use the factory interface but are unaware of the concrete classes being instantiated.

---

## 🏗 Structure

- Define an **interface or abstract class** for creating an object.
- Subclasses override the **factory method** to specify the product type.
- The client code works with the **creator interface** only.

---

## 🚀 Common Use Cases

- **UI Libraries**: Different platforms (Windows, macOS) produce different button styles but expose the same interface.
- **Document Editors**: Base editor framework can create `PDFDocument`, `WordDocument`, etc., depending on the user’s choice.
- **Notification Systems**: You send notifications via email, SMS, or push. Each type is created through a factory method based on user preference.

---

## ⚖️ Pros and Cons

### ✅ Pros

- Promotes **code reuse** and **flexibility**.
- Eliminates the need to bind application code to specific class names.
- Enhances maintainability and supports **future extensions** easily.

### ❌ Cons

- More classes and boilerplate than simple constructors.
- Can be **overkill** if only a few objects are created with little variation.
- May add **unnecessary abstraction** in simple scenarios.

---

## 📌 Summary

The Factory Method Pattern shines in scenarios where your code needs to work with **products that vary**, but without knowing the **exact classes** involved. By delegating creation to subclasses, your application becomes easier to extend and adapt to future needs.
