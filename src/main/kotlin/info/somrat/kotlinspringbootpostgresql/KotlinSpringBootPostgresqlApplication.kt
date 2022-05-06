package info.somrat.kotlinspringbootpostgresql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootPostgresqlApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringBootPostgresqlApplication>(*args)
}
