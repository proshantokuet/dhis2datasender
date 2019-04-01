package org.openmrs.module.dhis2datasender.extension.html;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.dhis2datasender.EncounterMarker;
import org.openmrs.module.dhis2datasender.api.datasendtodhis2Service;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@Configuration
@EnableAsync
@Controller
public class DhisListener {
	protected final Log log = LogFactory.getLog(this.getClass());

	
	public void sendData() throws Exception {
		EncounterMarker encounterMarker = new EncounterMarker();
		encounterMarker.setLastReadEntryId(34);
		encounterMarker.setName("Patient");
		log.info("saving new module objects...................");
		
		Context.getService(datasendtodhis2Service.class).saveEncountermarker(encounterMarker);
	}

}
