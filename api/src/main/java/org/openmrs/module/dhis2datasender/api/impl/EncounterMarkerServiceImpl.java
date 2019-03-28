package org.openmrs.module.dhis2datasender.api.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.dhis2datasender.EncounterMarker;
import org.openmrs.module.dhis2datasender.api.EncounterMarkerApi;
import org.openmrs.module.dhis2datasender.api.db.EncounterMarkerDAO;

public class EncounterMarkerServiceImpl extends BaseOpenmrsService implements EncounterMarkerApi  {
	protected final Log log = LogFactory.getLog(EncounterMarkerServiceImpl.class);

	private EncounterMarkerDAO dao;
	
	public EncounterMarkerDAO getEncounterMarkerDAO() {
		return dao;
	}

	public void setDao(EncounterMarkerDAO encounterMarkerDAO) {
		this.dao = encounterMarkerDAO;
	}

	@Override
	public void saveEncounter(EncounterMarker encounterMarker) {
		log.info("OKKK");
		dao.saveEncounter(encounterMarker);
		
	}

}
