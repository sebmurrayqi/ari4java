package ch.loway.oss.ari4java.generated.ari_1_9_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 24 13:07:49 SAST 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_1_9_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionAsterisk_impl_ari_1_9_0 extends BaseAriAction  implements ActionAsterisk {
/**********************************************************
 * Asterisk dynamic configuration
 * 
 * Retrieve a dynamic configuration object.
 *********************************************************/
private void buildGetObject(String configClass, String objectType, String id) {
reset();
url = "/asterisk/config/dynamic/" + configClass + "/" + objectType + "/" + id + "";
method = "GET";
lE.add( HttpResponse.build( 404, "{configClass|objectType|id} not found") );
}

@Override
public List<ConfigTuple> getObject(String configClass, String objectType, String id) throws RestException {
buildGetObject(configClass, objectType, id);
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<ConfigTuple_impl_ari_1_9_0>>() {} ); 
}

@Override
public void getObject(String configClass, String objectType, String id, AriCallback<List<ConfigTuple>> callback) {
buildGetObject(configClass, objectType, id);
httpActionAsync(callback, new TypeReference<List<ConfigTuple_impl_ari_1_9_0>>() {});
}

/**********************************************************
 * Asterisk dynamic configuration
 * 
 * Create or update a dynamic configuration object.
 *********************************************************/
private void buildUpdateObject(String configClass, String objectType, String id, Map<String,String> fields) {
reset();
url = "/asterisk/config/dynamic/" + configClass + "/" + objectType + "/" + id + "";
method = "PUT";
lParamBody.addAll( HttpParam.build( "fields", fields) );
lE.add( HttpResponse.build( 400, "Bad request body") );
lE.add( HttpResponse.build( 403, "Could not create or update object") );
lE.add( HttpResponse.build( 404, "{configClass|objectType} not found") );
}

@Override
public List<ConfigTuple> updateObject(String configClass, String objectType, String id, Map<String,String> fields) throws RestException {
buildUpdateObject(configClass, objectType, id, fields);
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<ConfigTuple_impl_ari_1_9_0>>() {} ); 
}

@Override
public void updateObject(String configClass, String objectType, String id, Map<String,String> fields, AriCallback<List<ConfigTuple>> callback) {
buildUpdateObject(configClass, objectType, id, fields);
httpActionAsync(callback, new TypeReference<List<ConfigTuple_impl_ari_1_9_0>>() {});
}

/**********************************************************
 * Asterisk dynamic configuration
 * 
 * Delete a dynamic configuration object.
 *********************************************************/
private void buildDeleteObject(String configClass, String objectType, String id) {
reset();
url = "/asterisk/config/dynamic/" + configClass + "/" + objectType + "/" + id + "";
method = "DELETE";
lE.add( HttpResponse.build( 403, "Could not delete object") );
lE.add( HttpResponse.build( 404, "{configClass|objectType|id} not found") );
}

@Override
public void deleteObject(String configClass, String objectType, String id) throws RestException {
buildDeleteObject(configClass, objectType, id);
String json = httpActionSync();
}

@Override
public void deleteObject(String configClass, String objectType, String id, AriCallback<Void> callback) {
buildDeleteObject(configClass, objectType, id);
httpActionAsync(callback);
}

/**********************************************************
 * Asterisk system information (similar to core show settings)
 * 
 * Gets Asterisk system information.
 *********************************************************/
private void buildGetInfo(String only) {
reset();
url = "/asterisk/info";
method = "GET";
lParamQuery.add( HttpParam.build( "only", only) );
}

@Override
public AsteriskInfo getInfo(String only) throws RestException {
buildGetInfo(only);
String json = httpActionSync();
return deserializeJson( json, AsteriskInfo_impl_ari_1_9_0.class ); 
}

@Override
public void getInfo(String only, AriCallback<AsteriskInfo> callback) {
buildGetInfo(only);
httpActionAsync(callback, AsteriskInfo_impl_ari_1_9_0.class);
}

/**********************************************************
 * Asterisk log channels
 * 
 * Gets Asterisk log channel information.
 *********************************************************/
private void buildListLogChannels() {
reset();
url = "/asterisk/logging";
method = "GET";
}

@Override
public List<LogChannel> listLogChannels() throws RestException {
buildListLogChannels();
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<LogChannel_impl_ari_1_9_0>>() {} ); 
}

@Override
public void listLogChannels(AriCallback<List<LogChannel>> callback) {
buildListLogChannels();
httpActionAsync(callback, new TypeReference<List<LogChannel_impl_ari_1_9_0>>() {});
}

/**********************************************************
 * Asterisk log channel
 * 
 * Adds a log channel.
 *********************************************************/
private void buildAddLog(String logChannelName, String configuration) {
reset();
url = "/asterisk/logging/" + logChannelName + "";
method = "POST";
lParamQuery.add( HttpParam.build( "configuration", configuration) );
lE.add( HttpResponse.build( 400, "Bad request body") );
lE.add( HttpResponse.build( 409, "Log channel could not be created.") );
}

@Override
public void addLog(String logChannelName, String configuration) throws RestException {
buildAddLog(logChannelName, configuration);
String json = httpActionSync();
}

@Override
public void addLog(String logChannelName, String configuration, AriCallback<Void> callback) {
buildAddLog(logChannelName, configuration);
httpActionAsync(callback);
}

/**********************************************************
 * Asterisk log channel
 * 
 * Deletes a log channel.
 *********************************************************/
private void buildDeleteLog(String logChannelName) {
reset();
url = "/asterisk/logging/" + logChannelName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Log channel does not exist.") );
}

@Override
public void deleteLog(String logChannelName) throws RestException {
buildDeleteLog(logChannelName);
String json = httpActionSync();
}

@Override
public void deleteLog(String logChannelName, AriCallback<Void> callback) {
buildDeleteLog(logChannelName);
httpActionAsync(callback);
}

/**********************************************************
 * Asterisk log channel
 * 
 * Rotates a log channel.
 *********************************************************/
private void buildRotateLog(String logChannelName) {
reset();
url = "/asterisk/logging/" + logChannelName + "/rotate";
method = "PUT";
lE.add( HttpResponse.build( 404, "Log channel does not exist.") );
}

@Override
public void rotateLog(String logChannelName) throws RestException {
buildRotateLog(logChannelName);
String json = httpActionSync();
}

@Override
public void rotateLog(String logChannelName, AriCallback<Void> callback) {
buildRotateLog(logChannelName);
httpActionAsync(callback);
}

/**********************************************************
 * Asterisk modules
 * 
 * List Asterisk modules.
 *********************************************************/
private void buildListModules() {
reset();
url = "/asterisk/modules";
method = "GET";
}

@Override
public List<Module> listModules() throws RestException {
buildListModules();
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<Module_impl_ari_1_9_0>>() {} ); 
}

@Override
public void listModules(AriCallback<List<Module>> callback) {
buildListModules();
httpActionAsync(callback, new TypeReference<List<Module_impl_ari_1_9_0>>() {});
}

/**********************************************************
 * Asterisk module
 * 
 * Get Asterisk module information.
 *********************************************************/
private void buildGetModule(String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Module could not be found in running modules.") );
lE.add( HttpResponse.build( 409, "Module information could not be retrieved.") );
}

@Override
public Module getModule(String moduleName) throws RestException {
buildGetModule(moduleName);
String json = httpActionSync();
return deserializeJson( json, Module_impl_ari_1_9_0.class ); 
}

@Override
public void getModule(String moduleName, AriCallback<Module> callback) {
buildGetModule(moduleName);
httpActionAsync(callback, Module_impl_ari_1_9_0.class);
}

/**********************************************************
 * Asterisk module
 * 
 * Load an Asterisk module.
 *********************************************************/
private void buildLoadModule(String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "POST";
lE.add( HttpResponse.build( 409, "Module could not be loaded.") );
}

@Override
public void loadModule(String moduleName) throws RestException {
buildLoadModule(moduleName);
String json = httpActionSync();
}

@Override
public void loadModule(String moduleName, AriCallback<Void> callback) {
buildLoadModule(moduleName);
httpActionAsync(callback);
}

/**********************************************************
 * Asterisk module
 * 
 * Unload an Asterisk module.
 *********************************************************/
private void buildUnloadModule(String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Module not found in running modules.") );
lE.add( HttpResponse.build( 409, "Module could not be unloaded.") );
}

@Override
public void unloadModule(String moduleName) throws RestException {
buildUnloadModule(moduleName);
String json = httpActionSync();
}

@Override
public void unloadModule(String moduleName, AriCallback<Void> callback) {
buildUnloadModule(moduleName);
httpActionAsync(callback);
}

/**********************************************************
 * Asterisk module
 * 
 * Reload an Asterisk module.
 *********************************************************/
private void buildReloadModule(String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "PUT";
lE.add( HttpResponse.build( 404, "Module not found in running modules.") );
lE.add( HttpResponse.build( 409, "Module could not be reloaded.") );
}

@Override
public void reloadModule(String moduleName) throws RestException {
buildReloadModule(moduleName);
String json = httpActionSync();
}

@Override
public void reloadModule(String moduleName, AriCallback<Void> callback) {
buildReloadModule(moduleName);
httpActionAsync(callback);
}

/**********************************************************
 * Global variables
 * 
 * Get the value of a global variable.
 *********************************************************/
private void buildGetGlobalVar(String variable) {
reset();
url = "/asterisk/variable";
method = "GET";
lParamQuery.add( HttpParam.build( "variable", variable) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public Variable getGlobalVar(String variable) throws RestException {
buildGetGlobalVar(variable);
String json = httpActionSync();
return deserializeJson( json, Variable_impl_ari_1_9_0.class ); 
}

@Override
public void getGlobalVar(String variable, AriCallback<Variable> callback) {
buildGetGlobalVar(variable);
httpActionAsync(callback, Variable_impl_ari_1_9_0.class);
}

/**********************************************************
 * Global variables
 * 
 * Set the value of a global variable.
 *********************************************************/
private void buildSetGlobalVar(String variable, String value) {
reset();
url = "/asterisk/variable";
method = "POST";
lParamQuery.add( HttpParam.build( "variable", variable) );
lParamQuery.add( HttpParam.build( "value", value) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public void setGlobalVar(String variable, String value) throws RestException {
buildSetGlobalVar(variable, value);
String json = httpActionSync();
}

@Override
public void setGlobalVar(String variable, String value, AriCallback<Void> callback) {
buildSetGlobalVar(variable, value);
httpActionAsync(callback);
}

/** No missing signatures from interface */
};

