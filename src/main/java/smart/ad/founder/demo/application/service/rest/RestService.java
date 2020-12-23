package smart.ad.founder.demo.application.service.rest;


import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import smart.ad.founder.demo.domain.model.FactoryClass;
import smart.ad.founder.demo.domain.model.entities.FoundAdvert;
import smart.ad.founder.demo.domain.model.valueObjects.Keywords;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestService {

    private FactoryClass factory;

    public RestService(FactoryClass factory){
        this.factory = factory;
    }

    public List<FoundAdvert> getAdsUrls_reklama5(Keywords keywords) throws IOException {

        // String url = "https://reklama5.mk/Search?q=volkswagen+golf&city=1&sell=0&sell=1&buy=0&buy=1&trade=0&trade=1&includeOld=0&includeOld=1&includeNew=0&includeNew=1&private=0&company=0&page=1&SortByPrice=0&zz=1&cat=";
        String url = constructReklama5Url(keywords);

        Document doc = Jsoup.connect(url).get();
        Elements adLinks = doc.getElementsByAttributeValue("id", "imgContainer");

        List<String> foundAdvertsUrls = new ArrayList<>();

        adLinks.forEach(el -> {
            // System.out.println(el.toString());
            String secondPart = el.child(0).toString().substring(9,30);
            foundAdvertsUrls.add("https://reklama5.mk" + secondPart);       // go vadi linkot
        });

        List<FoundAdvert> foundAdverts = foundAdvertsUrls.stream().map(fau -> factory.createNewFoundAdvert(fau)).collect(Collectors.toList());
        return foundAdverts;
    }




    public String constructReklama5Url(Keywords keywords){
        // String firstPart = "https://reklama5.mk/Search?q="+keywords.getMainKeyword()+"+";
        String firstPart = "https://reklama5.mk/Search?q="+keywords.getMainKeyword();
        String lastPart = "&city=1&sell=0&sell=1&buy=0&buy=1&trade=0&trade=1&includeOld=0&includeOld=1&includeNew=0&includeNew=1&private=0&company=0&page=1&SortByPrice=0&zz=1&cat=";

//        String []trickLambda = {firstPart};
//        keywords.getOtherKeywords().stream().forEach(ok -> {
//            trickLambda[0] = trickLambda[0].concat(ok);
//            trickLambda[0] = trickLambda[0].concat("+");
//        });
//        firstPart = trickLambda[0];

        String otherKeywordsCombined = keywords.getOtherKeywords().stream().reduce("", (partialString, element) -> partialString + "+" + element);

        firstPart = firstPart.concat(otherKeywordsCombined);

        return firstPart.concat(lastPart);
    }

}
