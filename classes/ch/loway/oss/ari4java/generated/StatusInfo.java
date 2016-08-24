package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 24 13:07:49 SAST 2016
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


public interface StatusInfo {

// void setStartup_time Date
/**********************************************************
 * Time when Asterisk was started.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setStartup_time(Date val );



// Date getStartup_time
/**********************************************************
 * Time when Asterisk was started.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Date getStartup_time();



// Date getLast_reload_time
/**********************************************************
 * Time when Asterisk was last reloaded.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Date getLast_reload_time();



// void setLast_reload_time Date
/**********************************************************
 * Time when Asterisk was last reloaded.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setLast_reload_time(Date val );


}
;
