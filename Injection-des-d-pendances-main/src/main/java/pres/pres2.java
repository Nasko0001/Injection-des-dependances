package pres;

import dao.Idao;
import metiers.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        Idao dao=(Idao) cDao.newInstance();



        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        Imetier metier=(Imetier) cDao.newInstance();

        Method method = cMetier.getMethod("setDao",Idao.class);
        method.invoke(metier, dao);


        System.out.println("Résultat => "+metier.calcul());

    }
}
