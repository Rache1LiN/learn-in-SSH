/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.PetInfo;
import edu.fjnu.dao.PetDao;
import edu.fjnu.dao.PetDaoImpl;

/**
 * @author ASUS
 *
 */
public class PetServiceImpl implements PetService {

	@Override
	public void insertPet(PetInfo pet) {
		PetDao petDao=new PetDaoImpl();
		petDao.insertPet(pet);
		
	}

	@Override
	public List<PetInfo> loadPet(String style , String name) {
		PetDao petDao=new PetDaoImpl();
		return petDao.loadPet(style,name);
	}

	@Override
	public void updatePet(PetInfo pet) {
		PetDao petDao=new PetDaoImpl();
		petDao.updatePet(pet);
		
	}

	@Override
	public PetInfo findPetById(Long petId) {
		PetDao petDao=new PetDaoImpl();
		return petDao.findPetById(petId);
	}

}
