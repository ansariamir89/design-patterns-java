The **Prototype Design Pattern** is used when you need to create new objects by copying an existing object rather than instantiating a new one from scratch. This pattern helps improve performance, especially when object creation is costly.

### **How It Works**
1. You define a `Prototype` interface with a `clone()` method.
2. Concrete classes implement the `Prototype` interface and override the `clone()` method.
3. When a new instance is needed, instead of creating it from scratch, you copy an existing instance.

---

### **Key Benefits**
- **Performance Efficiency** – Avoids expensive object creation by reusing existing instances.
- **Simplifies Object Creation** – Useful when constructors are complex or involve heavy computation.
- **Preserves Object State** – Copies existing objects instead of configuring new ones from scratch.
