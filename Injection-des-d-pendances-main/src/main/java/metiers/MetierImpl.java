package metiers;

import dao.Idao;

public class MetierImpl implements Imetier{
    private Idao dao; //couplage faible
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double resultat = tmp *540/Math.cos(tmp*Math.PI/100);
        return resultat;
    }
    
    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
