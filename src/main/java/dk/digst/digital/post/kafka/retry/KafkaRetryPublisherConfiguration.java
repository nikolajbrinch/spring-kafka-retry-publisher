package dk.digst.digital.post.kafka.retry;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration(proxyBeanMethods = false)
@EnableBinding(Source.class)
public class KafkaRetryPublisherConfiguration implements WebMvcConfigurer {

  // @Bean
  // public PlatformTransactionManager kafkaTransactionManager(BinderFactory binders) {
  // ProducerFactory<byte[], byte[]> producerFactory =
  // ((KafkaMessageChannelBinder) binders.getBinder(null, MessageChannel.class))
  // .getTransactionalProducerFactory();
  //
  // return new KafkaTransactionManager<>(producerFactory);
  // }
}
