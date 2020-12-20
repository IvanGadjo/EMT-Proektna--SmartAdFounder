package smart.ad.founder.demo.domain.model;

import smart.ad.founder.demo.domain.model.entities.FoundAdvert;
import smart.ad.founder.demo.domain.model.entities.User;
import smart.ad.founder.demo.domain.model.entities.UserInterest;
import smart.ad.founder.demo.domain.model.valueObjects.Keywords;
import smart.ad.founder.demo.domain.model.valueObjects.TimeValObject;

public class FactoryClass {

    public UserInterest createNewUserInterest(Keywords keywords, TimeValObject timeValObject,
                                              String category, String region, boolean active){
        return new UserInterest(keywords,timeValObject,category,region,active);
    }

    public User createNewUser(String userToken){
        return new User(userToken);
    }

    public FoundAdvert createNewFoundAdvert(String url){
        return new FoundAdvert(url);
    }
}
