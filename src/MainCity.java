import controller.CityController;

import java.io.IOException;

public class MainCity {
    public static void main(String[] args) throws IOException {
        CityController cc = new CityController();
        cc.insertIntoCity("Grudziadz",95000.,59.1);
        cc.insertIntoCity("Bydgoszcz",330000.,170.1);
        cc.insertIntoCity("Torun",200000.,115.);

       cc.selectFromCity();
           cc.selectFromCityById(1);
           cc.selectFromCityById(10);

          // cc.updateCityValueByid(1,444.);

        cc.deleteCityValueByid(3);
        cc.deleteCityValueByid(4);
        cc.selectFromCity();
        cc.saveCityTableData();



    }
}
