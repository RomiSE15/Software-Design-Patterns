# Assignment 5 — Strategy Pattern

## Overview
Implementation of the Strategy design pattern in Option A: Navigation / Route Planning.The `Navigator` context delegates route calculation to interchangeable strategies `CarStrategy`, `WalkingStrategy`, `BicycleStrategy` without using conditional statements

## Project Structure
- `RouteStrategy`: Common interface for all route algorithms
- `CarStrategy`, `WalkingStrategy`, `BicycleStrategy`: Concrete algorithm implementations
- `Navigator`: Context class holding a strategy reference and supporting runtime switching
- `Main`: Client configuring strategies and demonstrating runtime swapping
- `NavigatorTest`: Unit tests verifying strategy behavior and runtime switching

## How to Run
Run `Main.java` to see the console output
