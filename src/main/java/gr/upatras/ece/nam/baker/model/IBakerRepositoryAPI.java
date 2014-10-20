/**
 * Copyright 2014 University of Patras 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License.
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and limitations under the License.
 */

package gr.upatras.ece.nam.baker.model;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;


public interface IBakerRepositoryAPI {

	//utility

	Response getEntityImage(String uuid, String imgfile);
	
	//USER related methods 
	Response getUsers(); 
	Response getUserById(int userid);
	Response addUser(BakerUser user);
	Response updateUserInfo(int userid, BakerUser user);
	Response deleteUser(int userid);
	Response getAllBunsofUser(int userid);
	Response getAllAppsofUser(int userid);
	Response getAllWidgetsofUser(int userid);
	Response getAllCoursesofUser(int userid);

	//Sessions
	public Response addUserSession(UserSession userSession);
	public Response getUserSessions();
	
	//categories
	Response getCategories();
	Response getCategoryById(int catid);
	Response addCategory(Category c);
	Response updateCategory(int catId, Category c);
	Response deleteCategory(int catId);
	
	//BUNs related API methods
	Response getBuns(Long categoryid);
	Response getBunMetadataByID(int bunid);
	Response getBunMetadataByUUID(String uuid);		
	Response getBunofUser( int userid, int bunid);
	Response downloadBunPackage(String uuid, String bunfile);	
	Response updateBunMetadata(int bid, int userid, String bunname, int bunid, String uuid, 
			String shortDescription, String longDescription, String version,
			String categories, Attachment image, Attachment bunFile);
	Response addBunMetadata(int userid, String bunname, String shortDescription, String longDescription, 
			String version,  String categories ,Attachment image, Attachment bunFile);
	void deleteBun( int bunid);
	
	//Subscribed machines
	Response getSubscribedMachines();
	Response getSubscribedMachineById(int smId);
	Response addSubscribedMachine(SubscribedMachine sm);
	Response updateSubscribedMachine(int smId, SubscribedMachine sm);
	Response deleteSubscribedMachine(int smId);
	
	//Apps Related API methods
	Response getApps(Long categoryid);
	Response getAppMetadataByID(int appid);
	Response getAppMetadataByUUID(String uuid);		
	Response getAppofUser( int userid, int appid);
	Response updateAppMetadata(int aid, int userid, String appname, int appid, String uuid, 
			String shortDescription, String longDescription, String version,
			String categories, Attachment image);
	Response addAppMetadata(int userid, String appname, String shortDescription, 
			String longDescription, String version, String categories, Attachment image);
	void deleteApp(int appid);
	
	//Widgets Related API methods
	Response getWidgets(Long categoryid);
	Response getWidgetByID(int appid);
	Response getWidgetUUID(String uuid);		
	Response getWidgetofUser( int userid, int widgetid);
	Response updateWidget(int aid, int userid, String widgetname, String url, 
			int appid, String uuid, String shortDescription, String longDescription, String version,
			String categories, Attachment image, Attachment widgetFile);
	Response addWidget(int userid, String widgetname, String url, String 
			shortDescription, String longDescription, String version, String categories, 
			Attachment image, Attachment widgetFile);
	void deleteWidget(int appid);
	
	//courses Related API methods
	Response getCourses(Long categoryid);
	Response getCoursetByID(int courseid);
	Response getCourseUUID(String uuid);		
	Response getCourseofUser( int userid, int courseid);
	Response updateCourse(int cid, int userid, String coursename,  
			int courseid, String uuid, String shortDescription, String longDescription, String version,
			String categories, Attachment image, Attachment courseFile);
	Response addCourse(int userid, String coursename, String 
			shortDescription, String longDescription, String version, String categories, 
			Attachment image, Attachment courseFile);
	void deleteCourse(int courseid);
	
	
}
