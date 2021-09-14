public class Garden {
    public static void main(String[] args) {

        double dailyGardenWaterConsumption;
        double weeklyGardenWaterConsumption;
        double yearlyGardenWaterConsumption;


        Plant plant1 = new Plant();
        plant1.name = "tulip1";
        plant1.description = "Red tulip";
        plant1.dailyWaterConsumption = 0.10;
        

        Plant plant2 = new Plant();
        plant2.name = "tulip2";
        plant2.description = "Green tulip";
        plant2.dailyWaterConsumption = 0.20;

        Plant plant3 = new Plant();
        plant2.name = "tulip3";
        plant3.description = "Yellow tulip";
        plant3.dailyWaterConsumption = 0.30;

        dailyGardenWaterConsumption = plant1.dailyWaterConsumption + plant2.dailyWaterConsumption
                + plant3.dailyWaterConsumption;
        weeklyGardenWaterConsumption = dailyGardenWaterConsumption * 7;
        yearlyGardenWaterConsumption = dailyGardenWaterConsumption * 365;

        System.out.println("Garden Plants");
        System.out.println("Name: " + plant1.name + ", Description: " + plant1.description +
                ", Water Consumption: " + plant1.dailyWaterConsumption);
        System.out.println("Name: " + plant2.name + ", Description: " + plant2.description +
                ", Water Consumption: " + plant2.dailyWaterConsumption);
        System.out.println("Name: " + plant3.name + ", Description: " + plant3.description +
                ", Water Consumption: " + plant3.dailyWaterConsumption);
        System.out.println("Daily Garden Water Consumption: " + dailyGardenWaterConsumption + " l");
        System.out.println("Weekly Garden Water Consumption: " + weeklyGardenWaterConsumption+ " l");
        System.out.println("Yearly Garden Water Consumption: " + yearlyGardenWaterConsumption+ " l");

    }
}
