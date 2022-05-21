package com.syntax;

import sun.misc.OSEnvironment;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Star="2";
        FactorX.Planet="1000";

        //adding features to our sun
        FeatureSun Xfactor=new FeatureSun();
        Xfactor.color="green";
        Xfactor.radius="4546";
        Xfactor.heat="2345657yt";

        //adding the feature for star in the solar system
        FeatureStars Facx=new FeatureStars();
        Facx.color="green";
        Facx.radius="432758gd978";
        Facx.size="999999m";


        //adding features for planet2
        Planet2 Olso=new Planet2();
        Olso.name="Ozhan";
        Olso.size="76583km";
        Olso.color="pink";


        //        adding features for planet1
        Planet1Features GulK= new Planet1Features();
        GulK.color="blue";
        GulK.size="3848325828km";
        GulK.name="preacheX";
    }
}