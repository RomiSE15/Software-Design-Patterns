# Assignment4  Facade Pattern

## Overview
Implementation of the Facade design pattern in Java for video conversion. `VideoConversionFacade` provides one simple method to convert videos, hiding the complex subsystem

## Components
- **Facade:** `VideoConversionFacade`
- **Subsystem:** `VideoFile`, `CodecFactory`, `BitrateReader`, `AudioMixer`
- **Exception:** `VideoConversionException`
- **Client:** `Main`
- **Tests:** `VideoConversionFacadeTest`

## How to Run
- Run `Main.java`
- Run `VideoConversionFacadeTest.java` with JUnit 5 to run unit tests