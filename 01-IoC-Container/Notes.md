# IoC (Inversion of Control)

## Problem Before IoC

In traditional Java applications, developers create and manage objects manually.

```java
Engine engine = new Engine();
Car car = new Car(engine);
```

Problems:

* Tight coupling between classes
* Difficult to replace dependencies
* Harder to test
* Object lifecycle managed manually
* Large applications become difficult to maintain

---

## What is IoC?

IoC (Inversion of Control) is a principle where the control of object creation and dependency management is transferred from the application code to the Spring Framework.

Instead of creating objects using `new`, Spring creates and manages them.

---

## After IoC

Spring IoC Container creates and manages objects (Beans).

```java
@Component
class Engine {
}

@Component
class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
```

Spring automatically:

1. Creates Engine object
2. Creates Car object
3. Injects Engine into Car
4. Manages bean lifecycle

---

## Real Life Analogy

Without IoC:

You cook food yourself every day.

With IoC:

You order food from Zomato. Someone else manages the preparation and delivery.

Similarly, Spring manages object creation for you.

---

## IoC Container

The IoC Container is responsible for:

* Creating beans
* Managing beans
* Injecting dependencies
* Managing bean lifecycle

Main implementations:

1. BeanFactory
2. ApplicationContext (Most commonly used)

---

## Flow of IoC

Application Starts
↓
IoC Container Created
↓
Component Scan Happens
↓
Beans Created
↓
Dependencies Injected
↓
Application Ready

---

## Advantages

* Loose coupling
* Better maintainability
* Easier testing
* Better scalability
* Centralized object management

---

## Interview Answer (30 Seconds)

IoC stands for Inversion of Control. It is a design principle where the responsibility of creating and managing objects is transferred from the application code to the Spring IoC Container. The container creates beans, injects dependencies, and manages their lifecycle, resulting in loosely coupled and maintainable applications.
