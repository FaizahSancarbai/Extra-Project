# 🐾 HomeAnimal – Java OOP Task

A Java project demonstrating **class hierarchies**, **interfaces**, and **bounded generics** through an animal management system.

---

## 📁 Project Structure

```
src/
└── animals/
    ├── Animal.java         # Parent class
    ├── Run.java            # Interface
    ├── Speak.java          # Interface
    ├── Dog.java            # Extends Animal, implements Run & Speak
    ├── Cat.java            # Extends Animal, implements Run & Speak
    ├── Shark.java          # Extends Animal only (cannot be a HomeAnimal)
    ├── HomeAnimal.java     # Generic parameterized class
    └── Main.java           # Entry point
```

---

## 🚀 Getting Started


## 🧩 Task Breakdown

### a) Class Hierarchy

`Animal` is the parent class. `Dog`, `Cat`, and `Shark` all inherit from it.

```
Animal
├── Dog
├── Cat
└── Shark
```

### b) Interfaces

Two interfaces are defined:

| Interface | Method   | Implemented by  |
|-----------|----------|-----------------|
| `Run`     | `run()`  | `Dog`, `Cat`    |
| `Speak`   | `speak()`| `Dog`, `Cat`    |

`Dog` and `Cat` override both methods with their own behaviour.  
`Shark` does **not** implement either interface.

### c) Bounded Generic Class

`HomeAnimal<T>` uses a **type bound** to restrict which classes can be used:

```java
public class HomeAnimal<T extends Animal & Run & Speak>
```

This means `T` must:
- Extend `Animal` ✅
- Implement `Run` ✅
- Implement `Speak` ✅

➡ `Dog` and `Cat` qualify. `Shark` does **not** — the compiler rejects it at compile time.

### d) HomeAnimal Methods

| Method             | Description                                      |
|--------------------|--------------------------------------------------|
| `HomeAnimal(T)`    | Constructor — stores the animal object           |
| `getAnimal()`      | Returns the wrapped animal object (reference)    |
| `showType()`       | Prints the runtime class/type of the animal      |
| `sleepOnTheCouch()`| Prints a message — a perk of being a home animal |

### e) Main Class Demo

```java
// ✅ Works fine
HomeAnimal<Dog> homeDog = new HomeAnimal<>(new Dog("Rex"));
HomeAnimal<Cat> homeCat = new HomeAnimal<>(new Cat("Whiskers"));

// ❌ Compile error — Shark doesn't implement Run & Speak
// HomeAnimal<Shark> homeShark = new HomeAnimal<>(new Shark("Jaws"));
```

---

## 💻 Output

```
Rex the dog is running!
Rex says: Woof!
Type: Dog
Rex is sleeping on the couch... Zzzz
----------
Whiskers the cat is running!
Whiskers says: Meow!
Type: Cat
Whiskers is sleeping on the couch... Zzzz
----------
Shark cannot be a HomeAnimal! (compile error if you try)
```

---

## 🧠 Key OOP Concepts

| Concept | Where Used |
|---|---|
| **Inheritance** | `Dog`, `Cat`, `Shark` extend `Animal` |
| **Interfaces** | `Run`, `Speak` |
| **Method Overriding** | `run()` and `speak()` in `Dog` & `Cat` |
| **Generics with bounds** | `<T extends Animal & Run & Speak>` in `HomeAnimal` |
| **Compile-time type safety** | Shark is rejected before the program even runs |

---

## 📝 Notes

- The `Shark` line in `Main.java` is intentionally commented out to demonstrate that the compiler **prevents** invalid usage of `HomeAnimal` — uncomment it to see the compile error yourself.
- `getClass().getSimpleName()` is used in `showType()` to retrieve the runtime type name dynamically.