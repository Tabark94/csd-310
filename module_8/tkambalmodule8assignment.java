public class tkambalmodule8assignment {
    private static int standardCost = 500;

    public static int getStandardCost() {
        return standardCost;
    }

    public int getCostWithOilChange(int oilChange) {
        return standardCost + oilChange;
    }

    public int getCostWithOilChangeAndTireRotation(int oilChange, int tireRotation) {
        return standardCost + oilChange + tireRotation;
    }

    public int getCostWithOilChangeTireRotationAndCoupon(int oilChange, int tireRotation, int coupon) {
        return (standardCost + oilChange + tireRotation) - coupon;
    }

    public static void main(String[] args) {
        tkambalmodule8assignment myCar = new tkambalmodule8assignment();

        System.out.println("Standard cost: $" + myCar.getStandardCost());
        System.out.println("Cost with oil change: $" + myCar.getCostWithOilChange(100));
        System.out.println("Cost with oil change and tire rotation: $" + myCar.getCostWithOilChangeAndTireRotation(100, 200));
        System.out.println("Cost with oil change, tire rotation, and coupon: $" + myCar.getCostWithOilChangeTireRotationAndCoupon(100, 200, 50));
    }
}
