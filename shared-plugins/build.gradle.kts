plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.example"
version = "1.0"

gradlePlugin {
    (plugins) {
        "shared" {
            id = "com.example.shared-plugin"
            implementationClass = "com.example.gradle.ExampleSharedPlugin"
        }
    }
}

dependencies {
    compileOnly(gradleApi())
}
