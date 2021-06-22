package ez.gateway

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@ConfigurationProperties("gateway")
@Configuration
class GatewayClientAutoConfig {
  /**
   * gateway app url (eg. http://127.0.0.1:8777);
   * use it at feign client config (eg. api-client.foo.url=${gateway.url}/FOO)
   */
  lateinit var url: String
}
