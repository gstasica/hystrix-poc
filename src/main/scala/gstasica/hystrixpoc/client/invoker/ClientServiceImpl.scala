package gstasica.hystrixpoc.client.invoker

import org.springframework.web.client.RestTemplate
import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import com.netflix.hystrix.HystrixCommand

class ClientServiceImpl {

  val log = LoggerFactory.getLogger(getClass)

  def doNiceGetRequest(): String = {
    val caller = new EnhancedCommand("a")

    caller.execute()
  }

  def doBadGetRequest(): String = {
    val caller = new SimpleCommand()

    caller.execute()
  }
}