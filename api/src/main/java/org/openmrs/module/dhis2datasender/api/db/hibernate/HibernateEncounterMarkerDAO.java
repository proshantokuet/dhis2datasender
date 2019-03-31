package org.openmrs.module.dhis2datasender.api.db.hibernate;

import java.util.List;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<EncounterMarker> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from EncounterMarker ").list();
	}

	@Override
	public EncounterMarker findBiId(int id) {
		// TODO Auto-generated method stub
		List<EncounterMarker> lists =  sessionFactory.getCurrentSession().createQuery("from EncounterMarker where markerId = :id").setInteger("id", id).list();
		if(lists.size()!=0){
			return lists.get(0);
		}else{
			return null;
		}
	}

	@Override
	public EncounterMarker deleteById(int id) {	
		EncounterMarker encounterMarker= findBiId(id);
		sessionFactory.getCurrentSession().delete(encounterMarker);
		return encounterMarker;
	}

}
