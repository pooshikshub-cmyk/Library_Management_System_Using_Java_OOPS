# Java-OOPS-Journey
A dynamic, interactive Java console application utilizing core OOP principles, encapsulation, composition, and custom ArrayList search-flag loops to simulate a real-world library catalog system.


# Dynamic Java Library Management System

A production-ready console-based application built to master **Object-Oriented Programming (OOP)** in Java. This project simulates an interactive library ecosystem where users can publish books, view real-time availability catalogs, rent items, and return inventory safely.

## 🚀 Key Learning Milestones Achieved
* **Object Composition:** Built a structural data flow where a parent controller class (`Library`) dynamically holds and acts upon collections of child entities (`Book`).
* **State Management & Encapsulation:** Protected object fields (`isAvailable`) and used custom behaviors (`BorrowBooks()` / `ReturnBooks()`) to alter states safely without data corruption.
* **Flag-Assisted Loop Logic:** Designed robust search methods inside an `ArrayList` framework using a custom boolean flag tracking structure to completely prevent premature loop termination.
* **Console UI Architecture:** Created a persistent input engine using a `while` control loop alongside buffer-clearing `Scanner` mechanics.

---

## 🛠️ System Architecture

### 1. `Book.java`
Acts as the blueprint blueprint for individual book entities.
* **Attributes:** `title` (String), `authName` (String), `isAvailable` (Boolean)
* **Methods:**
  * `BorrowBooks()`: Flips the internal availability state to `false`.
  * `ReturnBooks()`: Flips the internal availability state to `true`.

### 2. `Library.java`
Acts as the inventory engine managing dynamic arrays of objects.
* **Collection Strategy:** Utilizes a custom `ArrayList<Book>` to dynamically handle runtime memory allocation.
* **Key Mechanisms:**
  * `addBooks(Book b)`: appends new items to the live database sequence.
  * `displayBooks()`: Loops across the index matrices to dump text metadata to screen buffers.
  * `BorrowBook(String name)` / `ReturnBook(String name)`: Leverages a flag verification structure (`boolean found`) outside search loops to cleanly update records without falling into premature fallback exceptions.

### 3. `Main.java`
The system entry point executing user choices continuously via a persistent execution frame.

---

## ⚙️ How To Run the Application

1. Make sure you have the Java Development Kit (JDK) installed on your system.
2. Download or clone this repository containing `Main.java`, `Library.java`, and `Book.java`.
3. Open your terminal or command prompt inside the project folder.
4. Compile the source files:
   ```bash
   javac Main.java Library.java Book.java
   ```
5. Launch the compiled runtime package:
   ```bash
   java Main
   ```

---

## 📈 Future Enhancements Roadmap
- [ ] Add data persistence by wiring up file I/O operations (`.txt` or `.json` saves).
- [ ] Implement user profiles to track exactly which user holds which specific book.
- [ ] Integrate a real database backend layer (JDBC / MySQL).
