package info.somrat.kotlinspringbootpostgresql.repository

import info.somrat.kotlinspringbootpostgresql.entity.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface MessageRepository : JpaRepository<Message, UUID>