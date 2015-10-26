package gstasica.hystrixpoc.client.invoker

trait Command {
  def execute:String
}