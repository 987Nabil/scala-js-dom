package org.scalajs.dom.experimental.push

import org.scalajs.dom.Blob
import org.scalajs.dom.experimental.serviceworkers.ExtendableEvent
import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBuffer, Uint8Array}

/** This represents a JavaScript enumeration representing the various keys you an request from a [[PushSubscription]] as
  * described here: [[http://www.w3.org/TR/push-api/#idl-def-PushEncryptionKeyName]]
  */
@js.native
sealed trait PushEncryptionKeyName extends js.Any

/** Static definitions for [[PushEncryptionKeyName]] */
object PushEncryptionKeyName {

  /** used to retrieve the P-256 ECDH Diffie-Hellman public key described here:
    * [[https://tools.ietf.org/html/draft-ietf-webpush-encryption-01]]
    */
  val p256dh: PushEncryptionKeyName = "p256dh".asInstanceOf[PushEncryptionKeyName]

  /** used to retrieve the authentication secret described here:
    * [[https://tools.ietf.org/html/draft-ietf-webpush-encryption-01]]
    */
  val auth: PushEncryptionKeyName = "auth".asInstanceOf[PushEncryptionKeyName]
}
