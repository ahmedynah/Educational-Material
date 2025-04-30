# 👀 Observer Pattern

## 🔍 What is the Observer Pattern?

The Observer pattern establishes a **one-to-many relationship** between objects such that when one object (the subject) changes state, all its **registered dependents (observers)** are notified automatically.

---

## 🎯 Purpose

To allow objects to **react to events or state changes** without tightly coupling them to the subject. Encourages a **decoupled, event-driven** design.

---

## 💡 Real-World Analogy

Think of a **newsletter subscription**: When a new article is published, everyone subscribed gets notified. They didn’t request it manually — they were automatically updated.

---

## 📦 Key Characteristics

- **Subject**: Keeps a list of observers and notifies them of changes.
- **Observer**: Defines an interface for update logic.
- The pattern supports **dynamic addition/removal** of observers at runtime.

---

## 🚀 Common Use Cases

- **User interface components**: Button clicks notify registered listeners.
- **Event-driven systems**: Messaging or event buses in microservices.
- **Stock ticker apps**: Traders get real-time price updates.
- **Model-View-Controller (MVC)**: Views observe changes in the model.

---

## ⚖️ Pros and Cons

### ✅ Pros
- Supports **loose coupling** between subject and observers.
- Enables **flexible communication** between components.
- Encourages **reactive programming paradigms**.

### ❌ Cons
- Too many observers can be hard to manage or debug.
- Risk of **memory leaks** if observers are not removed properly.
- Notification chain can lead to **unexpected side effects**.
