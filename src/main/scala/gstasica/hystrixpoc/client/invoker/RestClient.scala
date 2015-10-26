package gstasica.hystrixpoc.client.invoker

import org.springframework.web.client.RestTemplate
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod

object RestClient {

  val restTemplate = new RestTemplate()

  def doGet(): String = {
    val paramsMap = new HttpHeaders();

    val entity = new HttpEntity("", paramsMap);

    val result = restTemplate.exchange("http://www.onet.pl", HttpMethod.GET, entity, classOf[String])

    result.getBody
  }
}