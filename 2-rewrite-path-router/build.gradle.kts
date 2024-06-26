//plugins {
//	java
//	id("org.springframework.boot") version "3.2.5"
//	id("io.spring.dependency-management") version "1.1.4"
//}
//
//group = "io.chagchagchag.example"
//version = "0.0.1-SNAPSHOT"
//
//java {
//	sourceCompatibility = JavaVersion.VERSION_17
//}
//
//configurations {
//	compileOnly {
//		extendsFrom(configurations.annotationProcessor.get())
//	}
//}
//
//repositories {
//	mavenCentral()
//}
//
//extra["springCloudVersion"] = "2023.0.1"
//
//dependencies {
//	implementation("org.springframework.cloud:spring-cloud-starter-gateway")
//	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
//	compileOnly("org.projectlombok:lombok")
//	annotationProcessor("org.projectlombok:lombok")
//	testImplementation("org.springframework.boot:spring-boot-starter-test")
//	testImplementation("io.projectreactor:reactor-test")
//}
//
//dependencyManagement {
//	imports {
//		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
//	}
//}
//
//tasks.withType<Test> {
//	useJUnitPlatform()
//}
