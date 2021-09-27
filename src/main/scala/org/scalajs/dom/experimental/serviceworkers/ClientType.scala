package org.scalajs.dom.experimental.serviceworkers

import org.scalajs.dom._
import org.scalajs.dom.webgl.RenderingContext
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
sealed trait ClientType extends js.Any

object ClientType {
  val window: ClientType = "window".asInstanceOf[ClientType]

  val worker: ClientType = "worker".asInstanceOf[ClientType]

  val sharedworker: ClientType = "sharedworker".asInstanceOf[ClientType]

  val all: ClientType = "all".asInstanceOf[ClientType]
}
