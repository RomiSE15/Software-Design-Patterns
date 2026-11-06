# Assignment 6 - Visitor Pattern

## Overview
Implementation of the Visitor behavioral design pattern in Java (Option A: File System). Operations (size calculation and file search) are separated from the file system structure without modifying the element classes.

## Project Structure
- `FileSystemElement`: Element interface declaring `accept(FileSystemVisitor visitor)`.
- `FileElement`, `DirectoryElement`: Concrete elements implementing double dispatch.
- `FileSystemVisitor`: Visitor interface declaring `visitFile()` and `visitDirectory()`.
- `SizeCalculatorVisitor`: Calculates the total size of files.
- `SearchVisitor`: Searches for files matching a specific name/extension.
- `Main`: Demonstrates tree creation, traversal, and execution of visitors.
- `FileSystemVisitorTest`: JUnit 5 tests verifying visitor operations.

## How to Run
- Run `Main.java` in IntelliJ IDEA to see the console output.
- Run `FileSystemVisitorTest.java` execute unit tests.