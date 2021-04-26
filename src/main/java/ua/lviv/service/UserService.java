package ua.lviv.service;
import ua.lviv.User;
import ua.lviv.shared.AbstractCRUD;

public interface UserService extends AbstractCRUD<User>{
	User getUserByEmail (String email);
}
