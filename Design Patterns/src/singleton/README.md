# 🧩 Singleton Pattern

## 🔍 What is the Singleton Pattern?

The Singleton pattern ensures that a class has **only one instance** throughout the application's lifecycle and provides a **global access point** to that instance.

---

## 🎯 Purpose

- Limit instantiation to a **single object** to avoid inconsistent or conflicting states.
- Useful for coordinating shared resources like databases, configuration settings, or logging systems.

---

## 💡 Real-World Analogy

Imagine a **president** of a country. No matter how many times you ask, you always get the **same person**. You don’t need multiple presidents at once. Similarly, a singleton ensures you always access the **same instance**.

---

## 📦 Key Characteristics

- **Private constructor** to prevent outside instantiation.
- **Static method** to return the same instance.
- **Lazy or eager initialization** depending on needs.
- Often used with thread-safety mechanisms in multithreaded environments.

---

## 🚀 Common Use Cases

- **Logger classes**: You don’t want multiple instances writing logs independently.
- **Configuration managers**: Central place to manage app-wide settings.
- **Database connection pools**: Ensure shared resource is controlled and reused.

---

## ⚖️ Pros and Cons

### ✅ Pros
- Controlled access to sole instance.
- Reduced memory usage by reusing the same object.
- Centralized state management.

### ❌ Cons
- Global state makes **unit testing harder**.
- Hidden dependencies.
- Breaks **Single Responsibility Principle** if misused.
