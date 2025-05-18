The **Factory Design Pattern** is used to create objects without exposing the instantiation logic to the client. Instead of using `new` directly, we delegate object creation to a factory method.

---

### **How It Works**
1. Define an **interface** or **abstract class** for the products.
2. Implement different **concrete classes** of the product.
3. Create a **Factory class** that generates objects based on input parameters.

---

### **Key Benefits**
- **Encapsulates object creation** – Simplifies client-side code.
- **Reduces dependencies** – Helps manage complex object instantiation.
- **Promotes loose coupling** – Clients depend on the factory rather than concrete classes.
- **Improves scalability** – Easy to add new product types without modifying existing client code.
