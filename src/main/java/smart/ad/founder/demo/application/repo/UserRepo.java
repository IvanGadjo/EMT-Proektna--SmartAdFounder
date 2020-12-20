package smart.ad.founder.demo.application.repo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.domain.model.entities.User;
import smart.ad.founder.demo.domain.repo.UserRepoJPA;

import java.util.List;

@Service
@Transactional
public class UserRepo {

    UserRepoJPA userRepoJPA;

    public UserRepo(UserRepoJPA userRepoJPA) {
        this.userRepoJPA = userRepoJPA;
    }

    public List<User> findAll(){
        return userRepoJPA.findAll();
    }

    public User findById(Long id){
        return userRepoJPA.findById(id).orElseThrow(RuntimeException::new);
    }

    public User createNewUser(User user){
        return userRepoJPA.save(user);
    }

    public void deleteById(Long id){
        userRepoJPA.deleteById(id);
    }

}
