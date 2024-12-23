# Compose Multiplatform Application
 
# Example Splash Screen 
    use Navigation and Animation 
    




# [Show Image  ]

<body>
    <h1> Screen Android </h1>
      <img src="image/recoredmobile.gif" alt="Demo GIF" width="150" style="margin-right: 50px;">
</body>
</html>





### Android
To run the application on android device/emulator:  
 - open project in Android Studio and run imported android run configuration

To build the application bundle:
 - run `./gradlew :composeApp:assembleDebug`
 - find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`
Run android UI tests on the connected device: `./gradlew :composeApp:connectedDebugAndroidTest`




<body>
    <h1> Screen Desktop </h1>
   <img src="image/image_desktop.gif" alt="Demo GIF" width="350" style="margin-right: 50px;">
</body>
</html>

 
### Desktop
Run the desktop application: `./gradlew :composeApp:run`
Run desktop UI tests: `./gradlew :composeApp:jvmTest`










<body>
    <h1> Screen Web </h1>
    <img src="image/image_web.gif" alt="Demo GIF" width="450" style="margin-right: 50px;">
</body>
</html>

### Wasm Browser (Alpha)
Run the browser application: `./gradlew :composeApp:wasmJsBrowserDevelopmentRun --continue`
Run browser UI tests: `./gradlew :composeApp:wasmJsBrowserTest`


### JS Browser (Experimental)
Run the browser application: `./gradlew :composeApp:jsBrowserDevelopmentRun --continue`
Run browser UI tests: `./gradlew :composeApp:jsBrowserTest`




### iOS
To run the application on iPhone device/simulator:
 - Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
 - Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio
Run iOS simulator UI tests: `./gradlew :composeApp:iosSimulatorArm64Test`




