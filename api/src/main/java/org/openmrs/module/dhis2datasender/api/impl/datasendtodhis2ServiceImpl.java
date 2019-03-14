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
package org.openmrs.module.dhis2datasender.api.impl;

import java.util.List;

import org.openmrs.User;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.dhis2datasender.api.datasendtodhis2Service;
import org.openmrs.module.dhis2datasender.api.db.datasendtodhis2DAO;

/**
 * It is a default implementation of {@link datasendtodhis2Service}.
 */
public class datasendtodhis2ServiceImpl extends BaseOpenmrsService implements datasendtodhis2Service {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private datasendtodhis2DAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(datasendtodhis2DAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public datasendtodhis2DAO getDao() {
	    return dao;
    }

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return dao.getUserList();
	}
	
}