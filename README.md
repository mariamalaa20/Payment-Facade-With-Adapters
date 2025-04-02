# 📦 Adapter Facade Order System	

A modular and extensible Java-based order processing system that simulates product inventory management, shipping, and payment handling via adapter patterns. This is ideal for practicing object-oriented design and basic software architecture concepts.

---

## ✨ Features
- 🔁 Uses Adapter Design Pattern for payment systems
- 📦 Simulates product inventory and stock reduction
- 🚚 Manages shipping with simple address handling
- 💳 Handles credit card payments via abstraction

---

## 📋 Requirements
- Java 8 or higher
- A Java IDE (e.g., IntelliJ, Eclipse) or terminal with `javac`

---

## ⚙️ Installation

Clone the repository and compile the files:

```bash
git clone https://github.com/your-username/ecommerce-order-system.git
cd ecommerce-order-system
javac *.java
java Main


.
├── Main.java                 # Entry point for the application
├── OrderManager.java         # Manages inventory and shipping
├── InventorySystem.java      # Simulates product availability and stock control
├── ShippingSystem.java       # Handles shipping process
├── PaymentMethod.java        # Interface for payment abstraction
├── CreditCardAdapter.java    # Adapter to integrate credit card payment
├── CreditCardService.java    # Simulates charging a credit card
