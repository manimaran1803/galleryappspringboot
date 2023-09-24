package entireproject.fullproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entireproject.fullproject.model.user;



public interface userrepository extends JpaRepository<user,Long>{
    
    user  findByUsername(String username);
}
