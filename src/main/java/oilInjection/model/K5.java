package oilInjection.model;

public class K5 extends Car {
    private K5(Distance tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 13;
        this.name = "K5";
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    Distance getTripDistance() {
        return this.tripDistance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void registerTripDistance(Distance tripDistance) {
        this.tripDistance = tripDistance;
    }

    public static K5 of(final double distance) {
        return new K5(Distance.of(distance));
    }
}