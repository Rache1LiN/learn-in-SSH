/**
 * 
 */
package edu.fjnu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.fjnu.bean.PetInfo;
import edu.fjnu.utils.DBUtils;

/**
 * @author ASUS
 *
 */
public class PetDaoImpl implements PetDao {
	private static final String SQL_INSERT_PET="insert into petinfo values(seq_pet_id.nextval,?,?,?,?,?,?,?,?,?,' ',?)";
	private static final String SQL_LOAD_ALL_PET="select * from petinfo";
	private static final String SQL_UPDATE_PET="update petinfo set pet_name=?,pet_sex=?,pet_strength=?,pet_cute=?,pet_love=?,pet_intro=?,pet_owner_name=?,pet_owner_email=?,pet_pass=?,pet_type=? where pet_id=?";
	private static final String SQL_FIND_PET="select * from petinfo where pet_id=?";
	@Override
	public void insertPet(PetInfo pet) {
		Connection conn=DBUtils.getConn();
		PreparedStatement ptmt=null;
		try{
			ptmt=conn.prepareStatement(SQL_INSERT_PET);
			ptmt.setString(1,pet.getPetName());
			ptmt.setString(2, pet.getPetSex());
			ptmt.setInt(3, pet.getPetStrength());
			ptmt.setInt(4,pet.getPetCute());
			ptmt.setInt(5, pet.getPetLove());
			ptmt.setString(6, pet.getPetIntro());
			ptmt.setString(7, pet.getPetOwnerName());
			ptmt.setString(8, pet.getPetOwnerEmail());
			ptmt.setString(9, pet.getPetPass());
			ptmt.setString(10, pet.getPetType());
			if(ptmt.executeUpdate()==1){
				System.out.println("insert ok!");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtils.releaseRes(conn, ptmt, null);
		}
		
	}

	@Override
	public List<PetInfo> loadPet(String style, String name) {
		Connection conn=DBUtils.getConn();
		String sql = null;
		PreparedStatement ptmt=null;
		ResultSet rset=null;
		List<PetInfo> petList=new ArrayList<PetInfo>();
		if(name=="" || name==null){
			sql=SQL_LOAD_ALL_PET;
		}else{
			sql = SQL_LOAD_ALL_PET+" where pet_name='"+name+"'";
		}
		if(style!=null){
			switch(style){
			case "a":sql += " order by pet_strength";break;
			case "b":sql += " order by pet_cute";break;
			case "c":sql += " order by pet_love";break;
			}
		}
		try{
			ptmt=conn.prepareStatement(sql);
			rset=ptmt.executeQuery();
			
			while(rset.next()){
				PetInfo pet=new PetInfo();
				pet.setPetId(rset.getLong("pet_id"));
				pet.setPetName(rset.getString("pet_name"));
				pet.setPetSex(rset.getString("pet_sex"));
				pet.setPetStrength(rset.getInt("pet_strength"));
				pet.setPetCute(rset.getInt("pet_cute"));
				pet.setPetLove(rset.getInt("pet_love"));
				pet.setPetIntro(rset.getString("pet_intro"));
				pet.setPetOwnerName(rset.getString("pet_owner_name"));
				pet.setPetOwnerEmail(rset.getString("pet_owner_email"));
				pet.setPetPass(rset.getString("pet_pass"));
				pet.setPetType(rset.getString("pet_type"));
				petList.add(pet);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtils.releaseRes(conn, ptmt, rset);
		}
		
		return petList;
	}

	@Override
	public void updatePet(PetInfo pet) {
		Connection conn=DBUtils.getConn();
		PreparedStatement ptmt=null;
		try{
			ptmt=conn.prepareStatement(SQL_UPDATE_PET);
			ptmt.setString(1, pet.getPetName());
			ptmt.setString(2, pet.getPetSex());
			ptmt.setInt(3, pet.getPetStrength());
			ptmt.setInt(4, pet.getPetCute());
			ptmt.setInt(5, pet.getPetLove());
			ptmt.setString(6,pet.getPetIntro());
			ptmt.setString(7, pet.getPetOwnerName());
			ptmt.setString(8, pet.getPetOwnerEmail());
			ptmt.setString(9, pet.getPetPass());
			ptmt.setString(10,pet.getPetType());
			ptmt.setLong(11, pet.getPetId());
			if(ptmt.executeUpdate()==1){
				System.out.println("updated ok!");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtils.releaseRes(conn, ptmt, null);
		}
		
		
	}

	@Override
	public PetInfo findPetById(Long petId) {
		Connection conn=DBUtils.getConn();
		PreparedStatement ptmt=null;
		ResultSet rset = null;
		PetInfo pet=new PetInfo();
		try{
			ptmt=conn.prepareStatement(SQL_FIND_PET);
			ptmt.setLong(1, petId);
			rset = ptmt.executeQuery();
			if(rset.next()){
				pet.setPetId(petId);
				pet.setPetName(rset.getString("pet_name"));
				pet.setPetSex(rset.getString("pet_sex"));
				pet.setPetStrength(rset.getInt("pet_strength"));
				pet.setPetCute(rset.getInt("pet_cute"));
				pet.setPetLove(rset.getInt("pet_love"));
				pet.setPetIntro(rset.getString("pet_intro"));
				pet.setPetOwnerName(rset.getString("pet_owner_name"));
				pet.setPetOwnerEmail(rset.getString("pet_owner_email"));
				pet.setPetPass(rset.getString("pet_pass"));
				pet.setPetType(rset.getString("pet_type"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtils.releaseRes(conn, ptmt, rset);
		}
		return pet;
	}

}
