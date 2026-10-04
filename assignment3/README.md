# Assignment3 - Bridge Pattern

## Overview
Implementation of the Bridge structural design pattern in Java Option A: Shape-Renderer.Decouples the `Shape` abstraction from the `Renderer` implementation hierarchy using object composition

## Components
Abstraction: `Shape`

Refined Abstractions: `Circle`, `Square`

Implementor: `Renderer`

Concrete Implementors: `VectorRenderer`, `RasterRenderer`

Client: `Main` demonstrates runtime switching of renderers

## How to Run
Compile and run `Main.java`