package br.usp.each.saeg.jaguar.core.heuristic;

/**
 * Interface representing an Spectrum-base Fault Localization Heuristic
 *
 * Created by henrique on 7/16/17.
 */
public interface Heuristic {

    double eval(int cef, int cnf, int cep, int cnp);

}
