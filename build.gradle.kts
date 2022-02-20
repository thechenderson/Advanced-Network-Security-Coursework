import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins{
	application
	kotlin("jvm") version "1.6.10"
}

group = "com.github.thechenderson"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.apache.logging.log4j:log4j-api-kotlin:1.1.0")
	implementation("org.apache.logging.log4j:log4j-api:2.14.1")
	implementation("org.apache.logging.log4j:log4j-core:2.14.1")
	implementation("io.ktor:ktor-server-core:2.0.0-beta-1")
	implementation("io.ktor:ktor-server-netty:2.0.0-beta-1")
	implementation("io.ktor:ktor-server-status-pages:2.0.0-beta-1")
	implementation("io.ktor:ktor-server-default-headers:2.0.0-beta-1")
}

application {
	mainClass.set("com.github.thechenderson.advancednetworksecuritycourework.Application")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
