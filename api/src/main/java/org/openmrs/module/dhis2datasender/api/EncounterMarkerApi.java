package org.openmrs.module.dhis2datasender.api;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.dhis2datasender.EncounterMarker;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EncounterMarkerApi extends OpenmrsService {
	 public void saveEncounter(EncounterMarker encounterMarker);
	 public List<EncounterMarker> getAll();
	 public EncounterMarker findBiId(int id);
	 public EncounterMarker deleteById(int id);

}
