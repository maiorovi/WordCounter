import scala.io.Source

class TextParser {
  def parse(text: String): String = {
    text.replace(",", "")
  }
}