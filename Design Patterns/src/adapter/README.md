# 🔌 Adapter Pattern

## 🔍 What is the Adapter Pattern?

The Adapter pattern acts as a **bridge** between two incompatible interfaces. It allows a system to use classes that otherwise couldn’t work together due to mismatched interfaces.

---

## 🎯 Purpose

To **adapt** an existing class or interface to meet the needs of a **new interface**, without modifying the original source code.

---

## 💡 Real-World Analogy

Think of a **travel adapter** for power sockets. Your device has a plug that doesn’t fit the local socket, but instead of buying a new charger, you use an adapter that converts it.

---

## 📦 Key Characteristics

- Introduces a **middle layer** that translates method calls.
- Does not change the original class (composition over inheritance).
- Makes legacy or third-party code compatible with new client expectations.

---

## 🚀 Common Use Cases

- **Integrating legacy systems** into new architectures.
- **Standardizing third-party libraries** to match your app’s interface.
- **Bridging microservices** with different contracts or APIs.

---

## ⚖️ Pros and Cons

### ✅ Pros
- Promotes **reuse** without modification.
- Improves **flexibility** and **extensibility**.
- Decouples client and adaptee classes.

### ❌ Cons
- Adds additional layers and complexity.
- Can become messy with too many adapters stacked together.
