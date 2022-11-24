package part_3.Transport.Drivers;

import part_3.Transport.Bus;


public class DriverD extends Driver<Bus> {
    public DriverD(String driverName, char driverLicense, int drivingExperience, Bus car) {
        super(driverName, 'D', drivingExperience, car);
    }
}
