package info.somrat.kotlinspringbootpostgresql.service.message;

import info.somrat.kotlinspringbootpostgresql.domaintransferobject.MessageRequest;
import info.somrat.kotlinspringbootpostgresql.entity.Message;
import java.util.List;

interface MessageService {
    List<Message> findAll();

    Message save(MessageRequest messageRequest);
}
