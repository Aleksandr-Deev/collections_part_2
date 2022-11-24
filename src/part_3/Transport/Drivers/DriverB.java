package part_3.Transport.Drivers;

import com.sun.jdi.connect.Transport;
import part_3.Transport.Car;

public class DriverB extends Driver<Car> implements Transport {
    public DriverB(String driverName, char driverLicense, int drivingExperience, Car car) {
        super(driverName, 'B', drivingExperience, car);
    }

    @Override
    public String name() {
        return null;
    }
}
