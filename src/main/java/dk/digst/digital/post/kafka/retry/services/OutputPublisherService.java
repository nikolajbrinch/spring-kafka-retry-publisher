package dk.digst.digital.post.kafka.retry.services;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;
import dk.digst.digital.post.kafka.retry.commands.PublishCommand;

@Service
public class OutputPublisherService {

  @Autowired
  private MessageChannel output;

  public Map<String, Object> publish(PublishCommand command) {
    Map<String, Object> message = new HashMap<>();
    message.put("message", command.getMessage());
    MessageBuilder<Map<String, Object>> messageBuilder = MessageBuilder.withPayload(message);

    output.send(messageBuilder.build());

    return message;
  }

}
