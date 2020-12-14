/**
 * https://www.youtube.com/watch?v=9Uo8SYk7lbk
 *
 * Incapsularea - un principiu ce uneste datele si codul.
 * Ne permite manupularea cu aceste date, ascude datele de la accessul direct si utilizarea gresita.
 *
 * Ca exemplu putem da o masina. Putem merge cu ea, da jos refestrele, etc.,
 * insa nu avem acces direct la faptul cum ea realizeaza toate procesele date.
 *
 * Daca datele nu trebuiesc pe viitor modificate, atunci nici access direct la ele nu trebuie sa dam/avem.
 */

package com.lessons.encapsulation;

public class Example {
    public int firstPublicVar = 5, secondPublicVar = 7;
    private int firstPrivateVar, secondPrivateVar;
    private double pi = Math.PI;

    public int showResult(){
        return firstPublicVar + secondPublicVar;
    }

    /** Ca sa putem nu doar accesa dar si modifica variabilele folosim getters si setters */
    public int getFirstPrivateVar() {
        return firstPrivateVar;
    }

    public void setFirstPrivateVar(int firstPrivateVar) {
        this.firstPrivateVar = firstPrivateVar;
    }

    public int getSecondPrivateVar() {
        return secondPrivateVar;
    }

    public void setSecondPrivateVar(int secondPrivateVar) {
        this.secondPrivateVar = secondPrivateVar;
    }

    public double getPi() {
        return pi;
    }
}
