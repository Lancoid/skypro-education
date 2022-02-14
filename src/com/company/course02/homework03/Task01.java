package com.company.course02.homework03;

import com.company.course02.homework03.serviceStation.ServiceStation;
import com.company.course02.homework03.transport.Bicycle;
import com.company.course02.homework03.transport.Car;
import com.company.course02.homework03.transport.TransportInterface;
import com.company.course02.homework03.transport.Truck;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        ArrayList<TransportInterface> transports = new ArrayList<>();

        transports.add(new Bicycle("bicycle {2 wheels}", 2, false, false));
        transports.add(new Bicycle("bicycle {3 wheels, trailer}", 3, false, true));
        transports.add(new Car("car {4 wheels, engine}", 4, true, false));
        transports.add(new Car("car {4 wheels, engine, trailer}", 4, true, true));
        transports.add(new Truck("truck {6 wheels, engine, trailer}", 6, true, true));
        transports.add(new Truck("truck {8 wheels, engine}", 8, true, false));

        ServiceStation station = new ServiceStation();

        for (TransportInterface transport : transports) {
            station.check(transport);
        }
    }
}
