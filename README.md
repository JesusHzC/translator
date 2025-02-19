## Translator App

Translate text or record audio to many languages.

## Technologies Used

- KMP (Kotlin Multiplatform)
- Jetpack Compose
- SwiftUi
- Clean Code  
- SQLite
- Ktor
- Dependency Injection  

## Screenshots
<p align="center">
  <img src="./screens/home.png" height="550">
  <img src="./screens/record.png" height="550">
</p>

## Instalation
  - Install [KDoctor]([https://linktodocumentation](https://github.com/Kotlin/kdoctor)) and follow environment setup
  - Install JDK 17
  - To Run IOS APP you need add your apple id to XCode with Apple developer account to certificate the application
  - Note: API used in this APP is PRIVATE, you need to create NetworkConstants in Shared Module -> commonManin -> NetworkConstants to get successfuled build
```kotlin
object NetworkConstants {
    const val BASE_URL = "https://url-api"
}
```
