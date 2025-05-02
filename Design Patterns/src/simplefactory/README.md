# 🏭 Simple Factory Pattern

## 📘 Definition

The **Simple Factory Pattern** is a **creational design pattern** that provides a static method to create and return instances of different classes based on given input. Unlike the **Factory Method Pattern**, the Simple Factory does not rely on inheritance or interface implementation in the same way — it’s more of a programming idiom than a formal design pattern in the GoF catalog.

---

## 🧠 Real-Life Analogy

Imagine a **coffee shop**. You walk in and say, "I want a cappuccino."  
The barista (factory) handles all the preparation and gives you the right coffee.  
You don’t care how it’s made, and you don’t create it yourself.

---

## 🧱 Structure

- **Product Interface** – common interface for all objects created by the factory.
- **Concrete Products** – actual classes implementing the product interface.
- **Factory Class** – contains a static method to create and return the desired object.
- **Client** – uses the factory to obtain instances without knowing the class name.

---

## ✅ When to Use

- When object creation is complex and you want to **centralize it**.
- When you want to **hide object creation logic** from the client.
- When you have **many similar objects** that share a common interface or parent.

---

## ☕ Example: Coffee Factory

We want to create two types of coffee: **Espresso** and **Cappuccino**.

- `Coffee`: interface
- `Espresso`, `Cappuccino`: implementations
- `CoffeeFactory`: static method to produce coffee
- `Main`: client code using the factory

The factory takes in a string like `"espresso"` or `"cappuccino"` and returns the correct `Coffee` object.

---

## 💡 Benefits

- Centralizes object creation.
- Reduces coupling between client and implementation.
- Easy to manage and modify creation logic.

---

## ⚠️ Limitations

- Adding a new type means modifying the factory, which violates the **Open/Closed Principle**.
- Not considered a formal design pattern by GoF (Gang of Four).
- Becomes harder to manage as the number of object types increases.

---

## 🆚 Simple Factory vs Factory Method

| Aspect                | Simple Factory                                | Factory Method                                 |
|-----------------------|-----------------------------------------------|------------------------------------------------|
| **Definition**        | A static method that creates objects          | A method defined in a subclass to create objects |
| **Pattern Type**      | Creational idiom (not in GoF)                 | Creational design pattern (GoF)                |
| **Object Creation**   | Centralized in one class                      | Delegated to subclasses                        |
| **Flexibility**       | Less flexible (harder to extend)              | More flexible via subclassing                  |
| **Extensibility**     | Requires modifying the factory                | Easily extended via inheritance                |
| **Inheritance**       | Not needed                                    | Often involves abstract classes or interfaces  |
| **Open/Closed Principle** | ❌ Violated when adding new types         | ✅ Supports it better                          |
| **Use Case**          | When types are limited and known              | When you expect new types in the future        |

---

## 🧪 Summary

The **Simple Factory Pattern** is a great starting point for decoupling object creation from usage. It's easy to implement, but for larger systems or evolving requirements, **Factory Method** or **Abstract Factory** patterns are more maintainable and extensible.

---

## 📚 Further Reading

- ["Design Patterns: Elements of Reusable Object-Oriented Software"](https://en.wikipedia.org/wiki/Design_Patterns) by Gamma et al.
- Factory Method Pattern
- Abstract Factory Pattern

