package info.somrat.kotlinspringbootpostgresql.entity

import org.hibernate.annotations.Type
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Message(
    @Id()
    @Type(type="uuid-char")
    var id: UUID = UUID.randomUUID(),

    val text: String? = ""
)