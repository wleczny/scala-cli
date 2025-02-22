package scala.cli.commands.shared

import caseapp.*

// format: off
@HelpMessage("Print help message")
case class HelpOptions(
  @Recurse
    logging: LoggingOptions = LoggingOptions()
) extends HasLoggingOptions
// format: on

object HelpOptions {
  implicit lazy val parser: Parser[HelpOptions] = Parser.derive
  implicit lazy val help: Help[HelpOptions]     = Help.derive
}
