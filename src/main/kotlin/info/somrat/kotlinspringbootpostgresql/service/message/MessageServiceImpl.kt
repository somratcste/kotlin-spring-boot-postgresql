package info.somrat.kotlinspringbootpostgresql.service.message

import info.somrat.kotlinspringbootpostgresql.domaintransferobject.MessageRequest
import info.somrat.kotlinspringbootpostgresql.entity.Message
import info.somrat.kotlinspringbootpostgresql.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageServiceImpl (val messageRepository: MessageRepository) : MessageService {

    override fun findAll(): List<Message> = messageRepository.findAll()

    override fun save(messageRequest: MessageRequest): Message {
        val message = Message(
            text = messageRequest.text
        )
        return messageRepository.save(message);
    }
}