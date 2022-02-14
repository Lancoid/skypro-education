package com.company.course02.homework03.transport;

public interface TransportInterface {
    String getModelName();

    int getWheelsCount();

    boolean isHasEngine();

    boolean isHasTrailer();

    void updateTyre();

    void checkEngine();

    void checkTrailer();
}
