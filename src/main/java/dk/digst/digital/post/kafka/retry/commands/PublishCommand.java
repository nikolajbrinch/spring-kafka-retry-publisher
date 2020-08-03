package dk.digst.digital.post.kafka.retry.commands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublishCommand {

  private String message;

}
