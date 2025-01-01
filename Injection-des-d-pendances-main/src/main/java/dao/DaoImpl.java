package dao;

public class DaoImpl implements Idao{

    @Override
    public double getData() {
        System.out.println("Version base de donnée");
        double temperature = Math.random()*40;
        return temperature;
    }
}
