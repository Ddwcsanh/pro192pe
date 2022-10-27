
import java.util.ArrayList;

public class Pet implements ITax {

    private String name;
    private String birthday;
    private ArrayList<Service> usedServices;

    public Pet(String name, String birthday) {
        if (isValidBirthday(birthday)) {
            this.name = name;
            this.birthday = birthday;
            usedServices = new ArrayList();
        } else {
            System.out.println("Wrong birthday format!");
        }
    }

    public void addService(String nameService, int price) {
        if (price > 0) {
            Service sv = new Service(nameService, price);
            usedServices.add(sv);
        } else {
            System.out.println("The price must be a positive number!");
        }
    }

    @Override
    public String toString() {
        return name + "-" + getTotalMoney() + "-" + getTax();
    }

    @Override
    public double getTax() {
        return ITax.VAT * getTotalMoney();
    }

    @Override
    public double getTotalMoney() {
        double total = 0;
        for (Service sv : usedServices) {
            total += (double) sv.getPrice();
        }
        String[] birthdays = birthday.split("/");
        int month = Integer.parseInt(birthdays[0]);
        if (month <= 12 && month >= 10) {
            return total * 0.95;
        }
        return total;

    }

    private boolean isValidBirthday(String str) {
        String[] birthdays = str.split("/");
        if (birthdays.length != 3) {
            return false;
        }
        try {
            int month = Integer.parseInt(birthdays[0]);
            int day = Integer.parseInt(birthdays[1]);
            int year = Integer.parseInt(birthdays[2]);
            if (year >= 1900 && year <= 2022) {
                if (month >= 1 && month <= 12) {
                    if (day >= 1 && day <= 31) {
                        return true;
                    } else return false;
                } else return false;
            } else return false;

        } catch (Exception e) {
            return false;
        }
    }
}
