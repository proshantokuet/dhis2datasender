package org.openmrs.module.dhis2datasender.api.db;

import java.util.List;

import org.openmrs.module.dhis2datasender.EncounterMarker;

public interface EncounterMarkerDAO {
	public EncounterMarker saveEncounter(EncounterMarker encounterMarker);
	public List<EncounterMarker> getAll();
	public EncounterMarker findBiId(int id);
	public EncounterMarker deleteById(int id);

}
