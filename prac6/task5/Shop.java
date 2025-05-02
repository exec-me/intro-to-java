package prac6.task5;

import java.util.ArrayList;

class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public boolean removeComputer(Computer computer) {
        return computers.remove(computer);
    }

    public Computer findComputer(Brand brand) {
        for (Computer c : computers) {
            if (c.getBrand() == brand) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }
}

