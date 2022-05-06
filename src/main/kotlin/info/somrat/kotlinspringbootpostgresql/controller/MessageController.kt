package info.somrat.kotlinspringbootpostgresql.controller

import info.somrat.kotlinspringbootpostgresql.domaintransferobject.MessageRequest
import info.somrat.kotlinspringbootpostgresql.entity.Message
import info.somrat.kotlinspringbootpostgresql.service.message.MessageServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/messages" )
class MessageController (val messageService: MessageServiceImpl) {

    @GetMapping
    fun index(): List<Message> = messageService.findAll()

    @PostMapping
    fun post(@RequestBody messageRequest: MessageRequest) : Message = messageService.save(messageRequest)
}