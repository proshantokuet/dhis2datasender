package org.openmrs.module.dhis2datasender.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.module.dhis2datasender.EncounterMarker;
import org.openmrs.module.dhis2datasender.api.db.EncounterMarkerDAO;

public class HibernateEncounterMarkerDAO implements EncounterMarkerDAO{

	protected final Log log = LogFactory.getLog(HibernateEncounterMarkerDAO.class);

	private SessionFactory sessionFactory;
	
	/**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
    }
    
	/**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
	    return sessionFactory;
    }
    

    
	@Override
	public EncounterMarker saveEncounter(EncounterMarker encounterMarker) {
		log.info(encounterMarker);
		sessionFactory.getCurrentSession().saveOrUpdate(encounterMarker);
		return encounterMarker;
	}

}
