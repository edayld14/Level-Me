plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.levelme"
    compileSdk = 35
    ndkVersion = "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }    

    defaultConfig {
        applicationId = "com.example.levelme"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }


    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    // Core library desugaring için bu satır çok önemli:
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.3")

    // Diğer bağımlılıklar (örnek)
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.0")
    // Flutter bağımlılıkları zaten flutter-gradle-plugin ile gelir.
}

flutter {
    source = "../.."
}
