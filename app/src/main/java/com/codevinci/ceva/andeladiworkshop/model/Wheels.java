package com.codevinci.ceva.andeladiworkshop.model;

import javax.inject.Inject;

public class Wheels {
    //we don't own this class so we can't annotate it with @Inject
    private Rims rims;
    private Tyres tyres;


    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }

}
