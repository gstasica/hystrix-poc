package gstasica.hystrixpoc.client.invoker

import com.netflix.hystrix.HystrixCommand
import com.netflix.hystrix.HystrixCommandGroupKey

class EnhancedCommand(name: String) extends HystrixCommand[String](CommandGroupKey.key) with Command {

  def run(): String = {
    RestClient.doGet()
  }
}

object CommandGroupKey {
  private[invoker] final val key = HystrixCommandGroupKey.Factory.asKey("ExampleGroup")
}