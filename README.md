# Test task
## Traffic lights app

### How to run the app

The app is build with gradle. To run the app, go to the project directory and execute `./gradlew run`.

### Why I chose the current library

The application uses [TornadoFX](https://tornadofx.io) library. At first glance this is just wrapper around JavaFX for
 Kotlin. But there is really more cool stuff if you go deeper!
 
Personally I liked so much, how expressive the syntax of this library. It is really easy to understand. Also, it uses 
 so much Kotlin-specific features, so I got the impression, that you even can learn Kotlin, using this library.
 
Just take a look, how it used the cumbersome JavaFX builders and converted it to elegant expressive syntax like
```kotlin
stackpane {
    recatngle {
        width = 180.0
    }

    circle {
        radius = 60.0
    }
}
```

It has very smooth leaning curve and yet it is at least as powerful as JavaFX.

So I decided to use this library – it is very cool 👍.
