The **Builder Design Pattern** is used to construct complex objects step by step. Instead of having a constructor with multiple parameters, Builder provides a clean way to create objects using method chaining.

---

### **How It Works**
1. Define a `Builder` class inside or alongside the main class.
2. Use **method chaining** to set object properties.
3. A `build()` method finalizes object creation.

---

### **Key Benefits**
- **Improves readability** – No need for long constructor calls.
- **Step-by-step object creation** – Can set only required properties.
- **Immutable objects** – Helps enforce object integrity.
- **Avoids telescoping constructors** – Prevents overload issues.

