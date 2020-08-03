package dk.digst.digital.post.kafka.retry.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import dk.digst.digital.post.kafka.retry.commands.PublishCommand;
import dk.digst.digital.post.kafka.retry.services.OutputPublisherService;

@RestController
@RequestMapping("publish")
public class PublishController {

  @Autowired
  private OutputPublisherService outputPublisherService;

  @RequestMapping(method = RequestMethod.POST, value = "/",
      consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
  public ResponseEntity<Map<String, Object>> create(
      @Validated @RequestBody PublishCommand command) {
    return ResponseEntity.ok(outputPublisherService.publish(command));
  }

}
