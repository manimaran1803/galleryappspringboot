package entireproject.fullproject.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class securityconfig {
          
    @Autowired

    private  UserDetailsService userDetailsService;

   
    @Bean
    AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());

        return provider ;
    }











    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{

        http.authorizeHttpRequests(res ->
        res.requestMatchers("/gallery").authenticated().
        anyRequest().permitAll()).formLogin(
         form -> form 
         .loginPage("/login")
         .defaultSuccessUrl("/gallery").permitAll()

        ).logout(log -> log.logoutSuccessUrl("/").permitAll());
     
        return http.build();

    }
    
}
