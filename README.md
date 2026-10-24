# Smart Parking Lot System

## 📌 Project Overview

The **Smart Parking Lot System** is a Java-based backend application that simulates the operations of a multi-floor parking lot. The system automatically allocates parking spaces based on vehicle type, manages vehicle check-in and check-out, calculates parking fees based on parking duration, and updates parking spot availability in real time.

This project is designed to demonstrate **Object-Oriented Programming (OOP)**, **Low-Level Design (LLD)** principles, **SOLID principles**, **Exception Handling**, and the **Java Collections Framework**.

---

## 🎯 Objective

Design and implement the backend architecture for a smart parking lot capable of:

* Managing vehicle entry and exit
* Allocating parking spots automatically
* Tracking parking duration
* Calculating parking fees
* Maintaining real-time parking availability

---

## 🚀 Features

* Vehicle Check-In
* Vehicle Check-Out
* Automatic Parking Spot Allocation
* Parking Ticket Generation
* Parking Fee Calculation
* Multi-floor Parking Support
* Real-Time Parking Spot Availability
* Exception Handling for Full Parking Lot
* Modular Object-Oriented Design

---

## 🛠️ Technologies Used

* Java 17+ (Compatible with Java 21)
* IntelliJ IDEA
* Java Collections Framework
* Java Time API (`LocalDateTime`, `Duration`)
* Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```text
SmartParkingLot
│
└── src
    └── com
        └── parking
            ├── enums
            │   ├── VehicleType.java
            │   └── SpotStatus.java
            │
            ├── exception
            │   └── ParkingFullException.java
            │
            ├── model
            │   ├── Vehicle.java
            │   ├── Car.java
            │   ├── Motorcycle.java
            │   ├── Bus.java
            │   ├── ParkingSpot.java
            │   ├── ParkingFloor.java
            │   ├── ParkingLot.java
            │   └── ParkingTicket.java
            │
            ├── service
            │   ├── SpotAllocator.java
            │   ├── FeeCalculator.java
            │   └── ParkingManager.java
            │
            └── Main.java
```

---

## 🏗️ System Design

### Vehicle Types

* Motorcycle
* Car
* Bus

### Parking Spot Types

* Motorcycle Spot
* Car Spot
* Bus Spot

### Core Components

* Vehicle
* ParkingSpot
* ParkingFloor
* ParkingLot
* ParkingTicket
* SpotAllocator
* FeeCalculator
* ParkingManager

---

## 🔄 Application Workflow

### Vehicle Check-In

1. Vehicle arrives at the parking lot.
2. The system identifies the vehicle type.
3. An available parking spot is allocated.
4. A parking ticket is generated.
5. Entry time is recorded.
6. Parking spot status changes to **Occupied**.

### Vehicle Check-Out

1. User provides the parking ticket.
2. Exit time is recorded.
3. Parking duration is calculated.
4. Parking fee is calculated.
5. Parking spot is released.
6. Spot status changes to **Available**.

---

## 💰 Parking Fee Structure

| Vehicle Type | Rate      |
| ------------ | --------- |
| Motorcycle   | ₹20/hour  |
| Car          | ₹50/hour  |
| Bus          | ₹100/hour |

Any fraction of an hour is rounded up to the next full hour.

---

## ⚙️ Spot Allocation Algorithm

The system searches through all parking floors and assigns the first available parking spot matching the vehicle type.

### Algorithm

```text
For each floor
    For each parking spot
        If spot is available
            If spot supports vehicle type
                Allocate spot
                Return parking spot
```

### Time Complexity

* Current Implementation: **O(N)**
* Optimized Implementation (Future): **O(1)** using separate queues for each vehicle type.

---

## 📊 Database Design (Conceptual)

### Vehicle

* Vehicle Number
* Vehicle Type

### Parking Spot

* Spot ID
* Spot Type
* Status

### Parking Ticket

* Ticket ID
* Vehicle
* Parking Spot
* Entry Time
* Exit Time
* Total Fee

### Parking Floor

* Floor ID
* List of Parking Spots

---

## 📖 Object-Oriented Principles Used

* Encapsulation
* Abstraction
* Inheritance
* Polymorphism

---

## 🧩 Design Principles

* Single Responsibility Principle (SRP)
* Open/Closed Principle (OCP)
* Dependency Separation
* Modular Design

---

## 🚧 Future Enhancements

* Singleton Pattern for ParkingLot
* Factory Pattern for Vehicle Creation
* Strategy Pattern for Fee Calculation
* Observer Pattern for Display Board
* Thread-safe Parking Allocation using ReentrantLock
* Multiple Entry and Exit Gates
* Online Payment Integration
* Reservation System
* Spring Boot REST APIs
* MySQL Database Integration
* Unit Testing with JUnit
* Logging using SLF4J and Logback

---

## ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 17 or later.
4. Run `Main.java`.

---

## 🖥️ Sample Output

```text
Vehicle Parked Successfully

Spot : 1

Ticket ID : 1000

Vehicle Exited

Fee = ₹50.0

Spot Released
```

---

## 📚 Concepts Demonstrated

* Java OOP
* Low-Level Design (LLD)
* SOLID Principles
* Java Collections Framework
* Exception Handling
* Layered Architecture
* Parking Spot Allocation Algorithm
* Time-Based Fee Calculation
* Multi-Floor Parking Management
