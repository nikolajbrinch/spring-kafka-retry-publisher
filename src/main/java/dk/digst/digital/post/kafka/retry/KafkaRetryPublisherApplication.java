package dk.digst.digital.post.kafka.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaRetryPublisherApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaRetryPublisherApplication.class, args);
  }
}
