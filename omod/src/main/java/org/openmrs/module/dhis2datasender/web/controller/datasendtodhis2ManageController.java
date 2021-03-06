/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.dhis2datasender.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.dhis2datasender.EncounterMarker;
import org.openmrs.module.dhis2datasender.api.EncounterMarkerApi;
import org.openmrs.module.dhis2datasender.api.datasendtodhis2Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The main controller.
 */
@Controller
public class  datasendtodhis2ManageController {
	
	protected final Log log = LogFactory.getLog(datasendtodhis2ManageController.class);
	
	@RequestMapping(value = "/module/dhis2datasender/manage", method = RequestMethod.GET)
	public void manage(ModelMap model) {
		model.addAttribute("user", Context.getAuthenticatedUser());
	}
	
	@RequestMapping(value = "/module/dhis2datasender/userList", method = RequestMethod.GET)
	public void usserList(ModelMap model) {
		EncounterMarker encounterMarker = new EncounterMarker();
		encounterMarker.setLastReadEntryId(34);
		encounterMarker.setName("Patient");
		log.info("saving new module objects...................");
		Context.getService(datasendtodhis2Service.class).saveEncountermarker(encounterMarker);
		Context.getService(EncounterMarkerApi.class).saveEncounter(encounterMarker);

		model.addAttribute("uu",Context.getService(datasendtodhis2Service.class).getUserList());
		model.addAttribute("user", Context.getAuthenticatedUser());
	} 
}
