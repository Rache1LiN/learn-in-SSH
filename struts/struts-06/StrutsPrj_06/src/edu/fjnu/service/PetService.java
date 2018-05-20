/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.PetInfo;

/**
 * @author ASUS
 *
 */
public interface PetService {

	void insertPet(PetInfo pet);
	List<PetInfo> loadPet(String style , String name);
	void updatePet(PetInfo pet);
	PetInfo findPetById(Long petId);
}
