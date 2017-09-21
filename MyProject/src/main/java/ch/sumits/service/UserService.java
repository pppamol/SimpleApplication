package ch.sumits.service;

import ch.sumits.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
