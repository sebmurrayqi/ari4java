package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Jan 17 10:23:16 CET 2015
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Notification that a device state has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class DeviceStateChanged_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements DeviceStateChanged, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Device state object  */
  private DeviceState device_state;
 public DeviceState getDevice_state() {
   return device_state;
 }

 @JsonDeserialize( as=DeviceState_impl_ari_0_0_1.class )
 public void setDevice_state(DeviceState val ) {
   device_state = val;
 }

/** No missing signatures from interface */
}

