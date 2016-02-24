package services;
import java.util.List;

import javax.persistence.*;

import org.jboss.logging.Logger;

import entity.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	private EntityManager entityManager;
private Logger logger = Logger.getLogger(this.getClass());
public void startUp() {

		logger.info("EntityManager: "+entityManager);
		logger.info("NamedQuery Result := "+ getNamedQueryList().toString());
		logger.info("NamedQuery Result := "+ getNamedQueryList().size());
	}
	

	public List<Employee> getNamedQueryList() {
        return entityManager.createNamedQuery("selectEmployees").getResultList();      
	}


	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
