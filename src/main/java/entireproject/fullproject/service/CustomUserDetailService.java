package entireproject.fullproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import entireproject.fullproject.Repository.userrepository;
import entireproject.fullproject.model.user;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private userrepository userrepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       user user=userrepository.findByUsername(username);
       if(user==null){
        throw new UsernameNotFoundException("user not found");
       }

       return new CustomUserDetail(user);
       
    }
    
}
