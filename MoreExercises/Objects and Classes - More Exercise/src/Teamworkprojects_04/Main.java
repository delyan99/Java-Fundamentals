package Teamworkprojects_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfTeams = Integer.parseInt(scan.nextLine());
		List<Team> teamsCreateing = new ArrayList<Team>();
		List<String> teamsJoining = new ArrayList<String>();
		List<Team> teamsResult = new ArrayList<Team>();
		List<String> curentJoining = new ArrayList<String>();
		for (int i = 0; i < countOfTeams; i++) {
			String[] info = scan.nextLine().split("-");
			String user = info[0];
			String team = info[1];
			Team club = new Team(team, user);
			if (teamsCreateing.size() != 0) {
				boolean flag = false;
				for (int j = 0; j < teamsCreateing.size(); j++) {
					flag = teamsCreateing.get(j).getUser().contains(club.getUser());
					if (flag) {
						break;
					}
				}
				if (!flag) {
					boolean flag1 = false;
					for (int j = 0; j < teamsCreateing.size(); j++) {
						flag1 = teamsCreateing.get(j).getTeamName().contains(club.getTeamName());
					}
					if (!flag1) {
						teamsCreateing.add(club);
						System.out.printf("Team %s has been created by %s!%n", team, user);
					} else {
						System.out.printf("Team %s was already created%n", team);
					}
				} else {
					System.out.printf("%s cannot create another team!%n", user);
				}
			} else {
				System.out.printf("Team %s has been created by %s!%n", team, user);
				teamsCreateing.add(club);
			}
		}
		String input = scan.nextLine();
		while (!"end of assignment".equals(input)) {
			Team team = new Team();
			String[] teamJoin = input.split("->");
			String join = teamJoin[0];
			String teamName = teamJoin[1];
			boolean flag = false;
			if (teamsJoining.size() != 0) {
				for (int i = 0; i < teamsCreateing.size(); i++) {
					flag = teamsCreateing.get(i).getTeamName().contains(teamName);
					if (flag) {
						break;
					}
				}
				boolean flag1 = false;
				for (int i = 0; i < teamsCreateing.size(); i++) {
					flag1 = teamsCreateing.get(i).getUser().contains(join);
					if (flag1) {
						break;
					}
				}
				if (!flag) {
					System.out.printf("Team %s does not exist!%n", teamName);
				} else if (flag1) {
					System.out.printf("Member %s cannot join team %s!%n", join, teamName);
				} else {
					String creator = "";
					for (int i = 0; i < teamsCreateing.size(); i++) {
						creator = teamsCreateing.get(i).getUser();
					}
					teamsJoining.clear();
					teamsJoining.add(join);
					team.setListOfUsers(teamsJoining);
					team.setTeamName(teamName);
					team.setUser(creator);
					
					for (int i = 0; i < teamsResult.size(); i++) {
						if(teamsResult.get(i).getTeamName().equals(teamName)) {
							curentJoining.add(teamsResult.get(i).getListOfUsers().toString());
							curentJoining.add(join);
						}
					}
					team.setListOfUsers(curentJoining);
					teamsResult.add(team);
				}
			} else {
				boolean flag3 = false;
				for (int i = 0; i < teamsCreateing.size(); i++) {
					flag3 = teamsCreateing.get(i).getTeamName().contains(teamName);
					if (flag3) {
						break;
					}
				}

				boolean flag2 = false;
				for (int i = 0; i < teamsCreateing.size(); i++) {
					flag2 = teamsCreateing.get(i).getUser().contains(join);
					if (flag2) {
						break;
					}
				}
				if (!flag3) {
					System.out.printf("Team %s does not exist!%n", teamName);
				} else if (flag2) {
					System.out.printf("Member %s cannot join team %s!%n", join, teamName);
				} else {
					String creator = "";
					for (int i = 0; i < teamsCreateing.size(); i++) {
						creator = teamsCreateing.get(i).getUser();
					}
					teamsJoining.add(join);
					team.setListOfUsers(teamsJoining);
					team.setTeamName(teamName);
					team.setUser(creator);
					teamsResult.add(team);
				}
			}

			input = scan.nextLine();
		}
		for (int i = 0; i < teamsCreateing.size(); i++) {
			System.out.println(teamsCreateing.get(i).getTeamName());
			System.out.printf("- %s%n", teamsCreateing.get(i).getUser());
			for (int j = 0; j < teamsCreateing.get(i).getListOfUsers().size(); j++) {
				System.out.printf("-- %s%n", teamsCreateing.get(i).getListOfUsers());
			}

		}

	}

}