package org.openmrs.module.dhis2datasender;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsData;

@SuppressWarnings("serial")
public class EncounterMarker extends BaseOpenmrsData implements Serializable {

	private Integer markerId;
	private Integer lastReadEntryId;
	private String name;
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Integer getMarkerId() {
		return markerId;
	}

	public void setMarkerId(Integer markerId) {
		this.markerId = markerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLastReadEntryId() {
		return lastReadEntryId;
	}

	public void setLastReadEntryId(Integer lastReadEntryId) {
		this.lastReadEntryId = lastReadEntryId;
	}
	

}
