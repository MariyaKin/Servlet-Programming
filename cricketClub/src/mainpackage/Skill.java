package mainpackage;

import java.sql.Connection;

import com.face.bo.SkillBO;
import com.face.dao.SkillDAO;

public class Skill {
	long skillId;
	String skillName;
	public Skill() {
		
	}
	public Skill(String skillName) {
		//super();
		this.skillName = skillName;
	}
	public int getSkillName(Connection connection) {
		int id=SkillDAO.FindBySkillName(connection,skillName);
		SkillBO sbo=new SkillBO();
		sbo.setSkillName(skillName);
		sbo.setSkillId(id);
		return id;
	}
	
	
}
