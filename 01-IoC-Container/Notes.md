# IoC Container

## Definition

IoC (Inversion of Control) is a principle where the control of object creation and dependency management is transferred from the application code to the Spring Framework.

## Why is it used?

* Reduces tight coupling
* Makes code easier to test
* Improves maintainability
* Centralized object management

## How it works?

1. Spring starts.
2. IoC Container is created.
3. Spring scans classes.
4. Beans are created and stored.
5. Dependencies are injected where required.

## Example

Without Spring:

```java
Engine engine = new Engine();
Car car = new Car(engine);
```

With Spring:

```java
@Autowired
private Engine engine;
```

Spring creates and injects the object automatically.

## Interview Answer

The IoC Container is the core of Spring Framework. It creates, manages, and injects beans into the application. Instead of developers creating objects manually using `new`, Spring handles object creation and dependency injection.
