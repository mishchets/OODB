package lab9;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateDB {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("lab9");
        entityManagerFactory.close();
    }
}