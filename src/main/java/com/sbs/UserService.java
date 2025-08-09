package com.sbs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sbs.model.User;

@Service
public class UserService {
List<User> li=new ArrayList();
public UserService()
{
	li.add(new User("abc","abc123","abc@gmail.com"));
	li.add(new User("xyz","xyz123","xyz@gmail.com"));
	li.add(new User("pqr","pqr123","pqr@gmail.com"));
	
}

public List<User> getAllUser()
{
	return this.li;
}

public User getUser(String username)
{
	return this.li.stream().filter((user)->user.getUsername().equals(username)).findAny().get();
}

public User addUser(User user) {
    this.li.add(user);
    return user;
}
}
