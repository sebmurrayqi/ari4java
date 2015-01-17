package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Jan 17 10:23:16 CET 2015
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ChannelDialplan {

// String getDialplan_app
/**********************************************************
 * The application about to be executed.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getDialplan_app();



// Channel getChannel
/**********************************************************
 * The channel that changed dialplan location.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Channel getChannel();



// void setDialplan_app String
/**********************************************************
 * The application about to be executed.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDialplan_app(String val );



// String getDialplan_app_data
/**********************************************************
 * The data to be passed to the application.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getDialplan_app_data();



// void setDialplan_app_data String
/**********************************************************
 * The data to be passed to the application.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDialplan_app_data(String val );



// void setChannel Channel
/**********************************************************
 * The channel that changed dialplan location.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(Channel val );


}
;
