package com.company.course02.homework03.transport;

public class Truck extends AbstractTransport {
    public Truck(String modelName, int wheelsCount, boolean hasEngine, boolean hasTrailer) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.hasEngine = hasEngine;
        this.hasTrailer = hasTrailer;
    }
}
