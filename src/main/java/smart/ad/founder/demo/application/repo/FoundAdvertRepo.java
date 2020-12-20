package smart.ad.founder.demo.application.repo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.domain.model.entities.FoundAdvert;
import smart.ad.founder.demo.domain.repo.FoundAdvertRepoJPA;

import java.util.List;

@Service
@Transactional
public class FoundAdvertRepo {

    FoundAdvertRepoJPA foundAdvertRepoJPA;

    public FoundAdvertRepo(FoundAdvertRepoJPA foundAdvertRepoJPA) {
        this.foundAdvertRepoJPA = foundAdvertRepoJPA;
    }

    public List<FoundAdvert> findAll(){
        return foundAdvertRepoJPA.findAll();
    }

    public FoundAdvert findById(Long id){
        return foundAdvertRepoJPA.findById(id).orElseThrow(RuntimeException::new);
    }

    public FoundAdvert createNewUser(FoundAdvert foundAdvert){
        return foundAdvertRepoJPA.save(foundAdvert);
    }

    public void deleteById(Long id){
        foundAdvertRepoJPA.deleteById(id);
    }

}
