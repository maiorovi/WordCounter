import org.scalatest.{FunSuite, Suite}

class TextParserTest extends FunSuite{
  val parser = new TextParser

  test("parser cleans input text from ,") {
    val input = "Hello, World!"

    assert(parser.parse(input) == "Hello World!")
  }

  test("parser cleans input text from !") {

  }
}
