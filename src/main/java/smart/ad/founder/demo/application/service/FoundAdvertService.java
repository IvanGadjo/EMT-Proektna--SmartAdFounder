package smart.ad.founder.demo.application.service;

import smart.ad.founder.demo.domain.model.entities.FoundAdvert;

import java.util.List;

public interface FoundAdvertService {

    List<FoundAdvert> findAllFoundAdverts();

    FoundAdvert findFoundAdvertById(Long id);

    FoundAdvert editFoundAdvert(FoundAdvert newFoundAdvert);

    FoundAdvert createNewFoundAdvert(FoundAdvert foundAdvert);

    void deleteFoundAdvertById(Long id);
}
