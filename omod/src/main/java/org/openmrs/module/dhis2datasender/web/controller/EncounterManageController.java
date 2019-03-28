package org.openmrs.module.dhis2datasender.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.dhis2datasender.EncounterMarker;
import org.openmrs.module.dhis2datasender.api.EncounterMarkerApi;
import org.openmrs.module.dhis2datasender.api.impl.EncounterMarkerServiceImpl;
import org.openmrs.ui.framework.annotation.SpringBean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class EncounterManageController {
	protected final Log log = LogFactory.getLog(getClass());

	@RequestMapping(value = "/module/dhis2datasender/saveEncounterMarker", method = RequestMethod.GET)
	public void saveEncounterMarker(HttpServletRequest request, HttpSession session, Model model) {
		model.addAttribute("encounterMarker", new EncounterMarker());		
    }
	@RequestMapping(value = "/module/dhis2datasender/saveEncounterMarker", method = RequestMethod.GET)
	public ModelAndView saveUser(@SpringBean EncounterMarkerServiceImpl service,@ModelAttribute("encounterMarker") EncounterMarker encounterMarker, HttpSession session) throws Exception {
		
		if (encounterMarker != null) {
			//service.saveSocialUser(socialUser);
			log.info("saving new module objects...................");
			Context.getService(EncounterMarkerApi.class).saveEncounter(encounterMarker);

			return new ModelAndView("redirect:/module/dhis2datasender/saveEncounterMarker.form");
		}
		return null;
	}

}
