package ua.lviv.dao;

import ua.lviv.User;
import ua.lviv.shared.AbstractCRUD;

public interface UserDao extends  AbstractCRUD<User>{
  User getUserByEmail (String email);
}
