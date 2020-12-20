package smart.ad.founder.demo.application.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.ad.founder.demo.application.repo.FoundAdvertsRepo;
import smart.ad.founder.demo.application.service.FoundAdvertService;
import smart.ad.founder.demo.domain.model.entities.FoundAdvert;

import java.util.List;


@Service
@Transactional
public class FoundAdvertsServiceImpl implements FoundAdvertService {

    FoundAdvertsRepo foundAdvertsRepo;

    public FoundAdvertsServiceImpl(FoundAdvertsRepo foundAdvertsRepo) {
        this.foundAdvertsRepo = foundAdvertsRepo;
    }

    @Override
    public List<FoundAdvert> findAllFoundAdverts() {
        return foundAdvertsRepo.findAll();
    }

    @Override
    public FoundAdvert findFoundAdvertById(Long id) {
        return foundAdvertsRepo.findById(id);
    }

    @Override
    public FoundAdvert editFoundAdvert(FoundAdvert newFoundAdvert) {
        return foundAdvertsRepo.editFoundAdvert(newFoundAdvert);
    }

    @Override
    public FoundAdvert createNewFoundAdvert(FoundAdvert foundAdvert) {
        return foundAdvertsRepo.createNewFoundAdvert(foundAdvert);
    }

    @Override
    public void deleteFoundAdvertById(Long id) {
        foundAdvertsRepo.deleteById(id);
    }
}
