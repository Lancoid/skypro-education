package com.company.course02.homework03.transport;

abstract class AbstractTransport implements TransportInterface {
    protected String modelName = "";
    protected int wheelsCount = 0;
    protected boolean hasEngine = true;
    protected boolean hasTrailer = false;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
