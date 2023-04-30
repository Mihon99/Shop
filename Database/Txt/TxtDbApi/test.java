package Database.Txt.TxtDbApi;

import java.util.List;

import Model.Entities.Toys.Toy;
import Model.Infrastructure.InfrastructureBasic.Factories.ToyFactoryBasic;
import Model.Infrastructure.Interfaces.EntityFactory;

public class test {
    public static void main(String[] args) {
        String path = "Database/Txt/TxtDb/Database.txt";
        EntityFactory<Toy> factory = new ToyFactoryBasic();
        TxtDbRequest<Toy> db = new TxtDbRequest<Toy>(path, factory);
        Toy toy = db.getEntityById(2);
        if (toy != null) System.out.println(toy.toString());
    }
}