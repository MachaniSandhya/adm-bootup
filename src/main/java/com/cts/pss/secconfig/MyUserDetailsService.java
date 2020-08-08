/*
 * package com.cts.pss.secconfig;
 * 
 * import java.util.Optional; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service; import
 * com.cts.pss.dao.UserLoginDAO; import com.cts.pss.entities.User;
 * 
 * 
 * @Service public class MyUserDetailsService implements UserDetailsService {
 * 
 * @Autowired private UserLoginDAO repo;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { Optional<User> user =
 * repo.findByUsername(username); user.orElseThrow(()-> new
 * UsernameNotFoundException("User did not found username is = "+username));
 * return user.map(MyUserDetails::new).get(); }
 * 
 * }
 */