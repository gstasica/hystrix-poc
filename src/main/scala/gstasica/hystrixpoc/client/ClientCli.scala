package gstasica.hystrixpoc.client

import org.slf4j.LoggerFactory
import gstasica.hystrixpoc.client.invoker.ClientServiceImpl
import org.springframework.http.HttpMethod
import org.springframework.http.RequestEntity
import org.springframework.util.MultiValueMap
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpEntity

object ClientCli extends App {

  val log = LoggerFactory.getLogger(getClass)
  val service = new ClientServiceImpl

  log.info("starting hystrix poc client")

  val niceResult = service.doNiceGetRequest()
  log.info(niceResult)
  log.info("\r\n--------------------------------------")

  val badResult = service.doBadGetRequest()
  log.info(badResult)

  log.info("finished hystrix poc client")
}