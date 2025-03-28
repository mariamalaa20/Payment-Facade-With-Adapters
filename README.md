

```
# 📦 Payment Facade With Adapters

A simple yet extensible Java-based order processing system that demonstrates the use of object-oriented principles like abstraction and the Adapter design pattern. It integrates inventory checks, payment handling, and shipping functionalities in a clean, modular structure.

---

## ✨ Features

- 📦 Order processing with inventory check and shipment  
- 💳 Payment handling using Adapter Pattern for credit card service  
- 🏗️ Modular architecture for easy maintenance and extension  
- 📄 Console-based logs for system actions  

---

## ⚙️ Requirements

- Java 8 or higher  
- A Java IDE (e.g., IntelliJ, Eclipse) or command-line compiler  

---

## 🛠️ Installation, Project Structure & Output Example

Clone the repository and compile the Java files:

```bash
git clone https://github.com/yourusername/order-processing-system.git
cd order-processing-system
javac *.java


---

## 🛠️ Installation, Project Structure & Output Example

Clone the repository and compile the Java files:

```bash
git clone https://github.com/yourusername/order-processing-system.git
cd order-processing-system
javac *.java
```

```
order-processing-system/
├── CreditCardAdapter.java       # Adapter for integrating credit card service
├── CreditCardService.java       # Simulated external credit card API
├── InventorySystem.java         # Manages stock and availability
├── Main.java                    # Entry point of the application
├── OrderManager.java            # Core order processor
├── PaymentMethod.java           # Interface for payment strategies
└── ShippingSystem.java          # Handles shipping to customer address
```

Run the program using:

```bash
java Main
```

Example Output:

```
Stock reduced for product: ABC123
Shipping to 123 Main Street
Charged 100.0 TL from card 1234-5678-9012-3456
```




---
```
