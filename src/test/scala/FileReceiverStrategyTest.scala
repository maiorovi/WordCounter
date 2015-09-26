import org.scalatest.{BeforeAndAfterEach, Suite}

class FileReceiverStrategyTest extends Suite with BeforeAndAfterEach {

  private val expectedContent:String = "Hello World!!It`s me!!"
  private val receiver = new FileReceiverStrategy
  private val resource = new Resource("TestFile.txt")

  def testGivenFileReadsCorrectly() {
    val content = receiver.receive(resource)

    assert(content == expectedContent)
  }
}
