package example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import shared.SharedMessages
import js.annotation.JSExport

@JSExport
object ScalaJSExample {
  @JSExport
  def main(): Unit = {
    g.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
