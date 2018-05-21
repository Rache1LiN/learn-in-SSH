/**
 * 
 */
package edu.fjnu.bean;

import javax.print.attribute.standard.Media;

/**
 * @author ASUS
 *
 */
public class PetInfo {

	private Long petId;
	private String petName;
	private String petSex;
	private int petStrength;
	private int petCute;
	private int petLove;
	private String petIntro;
	private String petOwnerName;
	private String petOwnerEmail;
	private String petPass;
	private Media petPic;
	private String petType;
	public Long getPetId() {
		return petId;
	}
	public void setPetId(Long petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetSex() {
		return petSex;
	}
	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}
	public int getPetStrength() {
		return petStrength;
	}
	public void setPetStrength(int petStrength) {
		this.petStrength = petStrength;
	}
	public int getPetCute() {
		return petCute;
	}
	public void setPetCute(int petCute) {
		this.petCute = petCute;
	}
	public int getPetLove() {
		return petLove;
	}
	public void setPetLove(int petLove) {
		this.petLove = petLove;
	}
	public String getPetIntro() {
		return petIntro;
	}
	public void setPetIntro(String petIntro) {
		this.petIntro = petIntro;
	}
	public String getPetOwnerName() {
		return petOwnerName;
	}
	public void setPetOwnerName(String petOwnerName) {
		this.petOwnerName = petOwnerName;
	}
	public String getPetOwnerEmail() {
		return petOwnerEmail;
	}
	public void setPetOwnerEmail(String petOwnerEmail) {
		this.petOwnerEmail = petOwnerEmail;
	}
	public String getPetPass() {
		return petPass;
	}
	public void setPetPass(String petPass) {
		this.petPass = petPass;
	}
	public Media getPetPic() {
		return petPic;
	}
	public void setPetPic(Media petPic) {
		this.petPic = petPic;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
}
