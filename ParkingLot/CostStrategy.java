package ParkingArea;

public abstract class CostStrategy {
    
    abstract double calculateCost(long minutes, CostType costType,  long baseAmount);
}


class CarCostStrategy extends CostStrategy{

    @Override
    double calculateCost(long minutes, CostType costType, long baseAmount) {
        // TODO Auto-generated method stub
        if (costType == CostType.HOURLY) {
            return (minutes/60) * 40;
        }
        else{
            return (minutes) * 0.5;
        }
       
    }
    
}


class BikeCostStrategy extends CostStrategy{


    @Override
    double calculateCost(long minutes, CostType costType,  long baseAmount) {
        // TODO Auto-generated method stub
        if (costType == CostType.HOURLY) {
            return (minutes/60) * 20;
        }
        else{
            return (minutes) * 0.3;
        }
       
    }
    
}


class CostStrategyFactory{

    CostStrategy costStrategy;

    public CostStrategyFactory(VehicleType vehicleType) {
        if(vehicleType == VehicleType.FOUR_WHEELER) {
            this.costStrategy = new CarCostStrategy();
        }
        else{
            this.costStrategy = new BikeCostStrategy();
        }
    }

    double calculateCost(long totalTime, CostType costType,  long baseAmount){
        return costStrategy.calculateCost(totalTime, costType,  long baseAmount);
    }
}