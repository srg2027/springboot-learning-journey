package com.example.VotingApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class VotingApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext("com.example.VotingApplication");

		AuthorityCounter authorityCounter =
				(AuthorityCounter) applicationContext.getBean("simpleauthoritycounter");

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\nWelcome User");
			System.out.println("Choose from below : ");
			System.out.println("1. I wanna vote");
			System.out.println("2. See All votes (ADMIN)");

			int userInput = Integer.parseInt(sc.nextLine());

			switch (userInput) {

				case 1: {

					System.out.print("Enter your userName: ");
					String userName = sc.nextLine();

					User user = (User) applicationContext.getBean("user");
					user.setUserName(userName);

					System.out.println("\nChoose the party you want to vote for:");
					System.out.println("1. Democratic");
					System.out.println("2. Republic");
					System.out.println("3. Independent");

					int userPartySelect = Integer.parseInt(sc.nextLine());

					String beanId = "";

					switch (userPartySelect) {

						case 1:
							beanId = "democratic";
							break;

						case 2:
							beanId = "republic";
							break;

						case 3:
							beanId = "independent";
							break;

						default:
							System.out.println("Invalid Party Selection");
							continue;
					}

					PoliticalParty politicalParty =
							(PoliticalParty) applicationContext.getBean(beanId);

					user.setPoliticalParty(politicalParty);

					UserList userList =
							(UserList) applicationContext.getBean("userlist");

					userList.addUser(user);



					System.out.println("Thank you for voting!");

					break;
				}

				case 2: {

					UserList userList = authorityCounter.getUserList();

					if (userList == null || userList.getUserList().isEmpty()) {
						System.out.println("No votes recorded yet.");
					} else {
						userList.getUserList().forEach(item ->
								System.out.println(
										item.getUserName()
												+ " voted for "
												+ item.getPoliticalParty().getPartyName()
								)
						);
					}
					applicationContext.close();

					break;
				}

				default:
					System.out.println("Invalid Option!");
			}
		}
	}
}