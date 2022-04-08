/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package org.scalajs.dom

import scala.scalajs.js

@js.native
trait MediaStreamTrack extends EventTarget {

  /** Is a Boolean value with a value of true if the track is enabled, that is allowed to render the media source
    * stream; or false if it is disabled, that is not rendering the media source stream but silence and blackness. If
    * the track has been disconnected, this value can be changed but has no more effect.
    */
  var enabled: Boolean = js.native

  /** Returns a DOMString containing a unique identifier (GUID) for the track; it is generated by the browser. */
  val id: String = js.native

  /** Returns a DOMString set to "audio" if the track is an audio track and to "video", if it is a video track. It
    * doesn't change if the track is deassociated from its source.
    */
  val kind: String = js.native

  /** Returns a DOMString containing a user agent-assigned label that identifies the track source, as in "internal
    * microphone". The string may be left empty and is empty as long as no source has been connected. When the track is
    * deassociated from its source, the label is not changed.
    */
  val label: String = js.native

  /** Returns a Boolean value with a value of true if the track is muted, false otherwise. */
  val muted: Boolean = js.native

  /** Returns a Boolean value with a value of true if the track is (such a video file source or a camera that settings
    * can't be modified),false otherwise.
    */
  val readonly: Boolean = js.native

  /** Returns an enumerated value giving the status of the track.It takes one of the following values:
    *
    * "live" which indicates that an input is connected and does its best-effort in providing real-time data. In that
    * case, the output of data can be switched on or off using the MediaStreamTrack.enabled attribute.
    *
    * "ended" which indicates that the input is not giving any more data and will never provide new data.
    */
  val readyState: MediaStreamTrackState = js.native

  /** Returns a boolean value with a value of true if the track is sourced by a RTCPeerConnection, false otherwise. */
  val remote: Boolean = js.native

  /** Is a EventHandler containing the action to perform when an started event is fired on the object, that is when a
    * new MediaStreamTrack object is added.
    */
  var onstarted: js.Function1[Event, Any] = js.native

  /** Is a EventHandler containing the action to perform when an mute event is fired on the object, that is when the
    * streaming is terminating.
    */
  var onmute: js.Function1[Event, Any] = js.native

  /** Is a EventHandler containing the action to perform when an unmute event is fired on the object, that is when a
    * MediaStreamTrack object is removed from it.
    */
  var onunmute: js.Function1[Event, Any] = js.native

  /** Is a EventHandler containing the action to perform when an overconstrained event is fired on the object, that is
    * when a MediaStreamTrack object is removed from it.
    */
  var onoverconstrained: js.Function1[Event, Any] = js.native

  /** Is a EventHandler containing the action to perform when an ended event is fired on the object, that is when a
    * MediaStreamTrack object is removed from it.
    */
  var onended: js.Function1[Event, Any] = js.native

  /** Returns a MediaTrackConstraints object containing the currently set constraints for the track; the returned value
    * matches the constraints last set using applyConstraints().
    */
  def getConstraints(): MediaTrackConstraints = js.native

  /** Returns the a list of constrainable properties available for the MediaStreamTrack. */
  def getCapabilities(): js.Any = js.native

  /** Returns a duplicate of the MediaStreamTrack. */
  override def clone(): MediaStreamTrack = js.native

  /** Lets the application specify the ideal and/or ranges of acceptable values for any number of the available
    * constrainable properties of the MediaStreamTrack.
    */
  def applyConstraints(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native

  /** Returns a MediaTrackSettings object containing the current values of each of the MediaStreamTrack's constrainable
    * properties.
    */
  def getSettings(): js.Any = js.native

  /** Stops playing the source associated to the track, both the source and the track are deassociated. The track state
    * is set to ended.
    */
  def stop(): Unit = js.native
}

@deprecated("all the members of MediaStreamTrack are deprecated", "2.0.0")
object MediaStreamTrack {

  @deprecated("MediaStreamTrack's cannot be created manually", "2.0.0")
  @inline
  def apply(
      enabled: js.UndefOr[Boolean] = js.undefined, id: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[String] = js.undefined, label: js.UndefOr[String] = js.undefined,
      muted: js.UndefOr[Boolean] = js.undefined, readonly: js.UndefOr[Boolean] = js.undefined,
      readyState: js.UndefOr[String] = js.undefined, remote: js.UndefOr[Boolean] = js.undefined,
      onstarted: js.UndefOr[js.Function0[Any]] = js.undefined, onmute: js.UndefOr[js.Function0[Any]] = js.undefined,
      onunmute: js.UndefOr[js.Function0[Any]] = js.undefined,
      onoverconstrained: js.UndefOr[js.Function0[Any]] = js.undefined,
      oneended: js.UndefOr[js.Function0[Any]] = js.undefined
  ): MediaStreamTrack = {
    val result = js.Dynamic.literal()
    enabled.foreach(result.enabled = _)
    id.foreach(result.id = _)
    kind.foreach(result.kind = _)
    label.foreach(result.label = _)
    muted.foreach(result.muted = _)
    readonly.foreach(result.readonly = _)
    readyState.foreach(result.readyState = _)
    remote.foreach(result.remote = _)
    onstarted.foreach(result.onstarted = _)
    onmute.foreach(result.onmute = _)
    onunmute.foreach(result.onunmute = _)
    onoverconstrained.foreach(result.onoverconstrained = _)
    oneended.foreach(result.oneended = _)
    result.asInstanceOf[MediaStreamTrack]
  }
}