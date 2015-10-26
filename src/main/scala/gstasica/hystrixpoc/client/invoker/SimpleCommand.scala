package gstasica.hystrixpoc.client.invoker

import org.springframework.web.client.RestTemplate

class SimpleCommand extends Command {
  
  def execute(): String = {
    RestClient.doGet()
  }
}