package com.company;
import java.util.*;

/**
 * Created by sylvain on 2016-11-29.
 * @author sylvain
 * @
 * Cette classe permet d'obtenir une liste de nouvelles au sujet
 * d'une moto en particulier.
 * Les nouvelles proviennent d'internet
 */
public class News {
    private ArrayList<String> news;

    private ArrayList<String> searchParameters;

    /**
     *
     * @param _searchParameters: Liste de paramètres de recherche pour obtenir des nouvelles
     */
    public void News(ArrayList<String> _searchParameters) {

        searchParameters = _searchParameters;

    }

    /**
     * Cette méthode permet de faire l'obtention des nouvelles via google
     *
    */
    private ArrayList<String> getNews()  {

        return new ArrayList<String>();
    }
}
