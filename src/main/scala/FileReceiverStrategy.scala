import scala.io.Source

trait ReceiverStrategy {
  def receive(resource: Resource): String
}

class FileReceiverStrategy() extends ReceiverStrategy {
  def receive(resource: Resource): String = {
    Source.fromFile(resource.getPath).getLines().toList.foldLeft("")((acc, str) => acc + str)
  }
}
