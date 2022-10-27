
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class MyCar implements ICar {

    //return average rate of all cars (3.7 -> 3)
    @Override
    public int f1(List<Car> t) {
        int sum = 0;
        for (int i = 0; i < t.size(); i++) {
            sum += t.get(i).getRate();
        }
        return sum / t.size();
    }

    //swap first max and min rate
    @Override
    public void f2(List<Car> t) {
        int min = t.get(0).getRate();
        int max = t.get(0).getRate();
        int posMax = 0, posMin = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() > max) {
                max = t.get(i).getRate();
                posMax = i;
            }
            if (t.get(i).getRate() < min) {
                min = t.get(i).getRate();
                posMin = i;
            }
        }
        Collections.swap(t, posMax, posMin);
    }

    //sort alphabetically, sort rate descendingly
    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getMaker().compareTo(o2.getMaker()) != 0) {
                    return o1.getMaker().compareTo(o2.getMaker());
                }
                else return (o2.getRate() - o1.getRate());
            }
        });
        
    }

}
