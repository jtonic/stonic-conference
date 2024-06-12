import zio._
import zio.Console as ZConsole

object App extends ZIOAppDefault {
  def run = for {
    name <- ZConsole.readLine("What is your name? ")
    _ <- ZConsole.printLine(s"Your name is $name")
  } yield ()
}
