package com.company.course02.homework03.serviceStation;

import com.company.course02.homework03.transport.TransportInterface;

public class ServiceStation {
    public void check(TransportInterface transport) {
        System.out.println("------------- Обслуживаем " + transport.getModelName());

        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }

        if (transport.isHasEngine()) {
            transport.checkEngine();
        }

        if (transport.isHasTrailer()) {
            transport.checkTrailer();
        }

        System.out.println("-------------");
    }
}
