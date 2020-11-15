package Teamworkprojects_04;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String teamName;
	private String user;
	private List<String> listOfUsers = new ArrayList<>();
	
	public Team(String teamName, String user) {
		this.teamName = teamName;
		this.user = user;
	}
	
	public Team (List<String> listOfUsers, String teamName, String user) {
		this.listOfUsers = listOfUsers;
		this.teamName = teamName;
		this.user = user;
	}

	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public void setListOfUsers(List<String> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public List<String> getListOfUsers() {
		return listOfUsers;
	}
	
	public String getUser() {
		return this.user;
	}
	public String getTeamName() {
		return this.teamName;
	}
}
