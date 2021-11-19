package app;

import model.Computer;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersNumber = 0;

    public void add(Computer computer){
        if (computersNumber < MAX_COMPUTERS && computer != null){
            computers[computersNumber] = computer;
            computersNumber++;
        }
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public int checkAvailability(Computer computer){
        int matchComputers = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (computers[i].equals(computer)){
                matchComputers++;
            }
        }

        return matchComputers;
    }

}
