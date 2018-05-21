/**
 * 
 */
package edu.fjnu.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import edu.fjnu.bean.PetInfo;
import edu.fjnu.service.PetService;
import edu.fjnu.service.PetServiceImpl;

/**
 * @author ASUS
 *
 */
public class PetAction extends BaseAction {

	private PetInfo pet;
	private String style;
	private List<PetInfo> petList;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public List<PetInfo> getPetList() {
		return petList;
	}

	public void setPetList(List<PetInfo> petList) {
		this.petList = petList;
	}

	public PetInfo getPet() {
		return pet;
	}

	public void setPet(PetInfo pet) {
		this.pet = pet;
	}
	public String mainMenu()throws Exception{
		pet = new PetInfo();
		return "main_menu";
	}
	
	public String addPet()throws Exception{
		
		return "adapt_pet";
	}
	public String selfPet()throws Exception{
		return "self_pet";
	}
	public String createPet()throws Exception{
		PetService petService=new PetServiceImpl();
		petService.insertPet(pet);
		return null;
	}
	
	public String search()throws Exception{
		PetService petService=new PetServiceImpl();
		if(style==" " || style==null || style=="")
			petList = petService.loadPet(null,name);
		else
			petList = petService.loadPet(style,name);
		return "search_pet";
		
	}
	
	public String Login()throws Exception{
		
		return "main_menu";
	}
	public void validateLogin(){
		PetService petService=new PetServiceImpl();
		petList = petService.loadPet(style,null);
		for(PetInfo aPet:petList){
			if(aPet.getPetId().equals(pet.getPetId()) && aPet.getPetPass().equals(pet.getPetId())){
				ActionContext ac = ActionContext.getContext();
				ac.getSession().put("petId", pet.getPetId());
			}else{
				this.addActionError("用户名或密码错误！");
			}
		}
	}
}
