package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class BootexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootexampleApplication.class, args);
		//UserRepository userRepository= context.getBean(UserRepository.class);
		
		/*
		 * User user = new User(); user.setName("Durgesh Singh");
		 * user.setCity("New Delhi India");
		 * user.setStatus("I am java & Python Programmer");
		 * 
		 * User user1= userRepository.save(user); System.out.println(user1);
		 */
		
		// Create Object of User
		/*
		 * User user1 = new User(); user1.setName("Uttam"); user1.setCity("CITY1");
		 * user1.setStatus("Java Program");
		 * 
		 * 
		 * User user2 = new User(); user2.setName("Uttam Kumar");
		 * user2.setCity("CITY New "); user2.setStatus("Java Program And Python");
		 */
		
		// Saving Single User
		// User resultUser=userRepository.save(user2);
		
		
		// Save  Multiple User
		/*
		 * List<User> users = List.of(user1,user2);
		 * 
		 * Iterable<User> result = userRepository.saveAll(users); result.forEach(user->{
		 * System.out.println(user); });
		 */
		
		
		// Update the user of id 1
		/*
		 * Optional<User> optional = userRepository.findById(1); 
		 * User user =optional.get(); 
		 * user.setName("Ankit Tiwari Singh"); User result =
		 * userRepository.save(user); System.out.println(result);
		 */
	
		
		//How to get the Data
		// 1 FindById(id) -> return Optional containing Your Data
		// 2 FindAll -> Iterable
		
		
		
		// How to Print the Data 
		// Method 1
		/*
		 * Iterable<User> itr = userRepository.findAll();
		 * Iterator<User> iterator = itr.iterator(); while (iterator.hasNext()) { User
		 * user = (User) iterator.next(); System.out.println(user);
		 * 
		 * }
		 */
		
		// Method 2	
		/*
		 * itr.forEach(user->{ System.out.println(user); });
		 */
		
		// Deleting the user element
		/*
		 * userRepository.deleteById(1); System.out.println("Deleted");
		 */
		
		/*
		 * // Delete All Iterable<User> allusers = userRepository.findAll();
		 * allusers.forEach(user ->System.out.println(user));
		 * userRepository.deleteAll(allusers);
		 */
		// It Works
		
		
	}

}
