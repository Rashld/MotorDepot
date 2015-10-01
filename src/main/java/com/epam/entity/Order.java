package com.epam.entity;

import com.epam.entity.enums.OrderStatus;
import com.epam.entity.enums.VehicleClass;
import com.epam.entity.enums.VehicleType;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Order extends Entity{
    private Client client;
    private Driver driver;
    private VehicleClass vehicleClass;
    private VehicleType vehicleType;
    private String pickUpLocation;
    private String DropOffLocation;
    private Timestamp receivedTime;
    private BigDecimal cost;
    private OrderStatus orderStatus;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(VehicleClass vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation() {
        return DropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        DropOffLocation = dropOffLocation;
    }

    public Timestamp getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Timestamp receivedTime) {
        this.receivedTime = receivedTime;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        if (!super.equals(o)) return false;

        Order order = (Order) o;

        if (getClient() != null ? !getClient().equals(order.getClient()) : order.getClient() != null) return false;
        if (getDriver() != null ? !getDriver().equals(order.getDriver()) : order.getDriver() != null) return false;
        if (getVehicleClass() != order.getVehicleClass()) return false;
        if (getVehicleType() != order.getVehicleType()) return false;
        if (getPickUpLocation() != null ? !getPickUpLocation().equals(order.getPickUpLocation()) : order.getPickUpLocation() != null)
            return false;
        if (getDropOffLocation() != null ? !getDropOffLocation().equals(order.getDropOffLocation()) : order.getDropOffLocation() != null)
            return false;
        if (getReceivedTime() != null ? !getReceivedTime().equals(order.getReceivedTime()) : order.getReceivedTime() != null)
            return false;
        if (getCost() != null ? !getCost().equals(order.getCost()) : order.getCost() != null) return false;
        return getOrderStatus() == order.getOrderStatus();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getClient() != null ? getClient().hashCode() : 0);
        result = 31 * result + (getDriver() != null ? getDriver().hashCode() : 0);
        result = 31 * result + (getVehicleClass() != null ? getVehicleClass().hashCode() : 0);
        result = 31 * result + (getVehicleType() != null ? getVehicleType().hashCode() : 0);
        result = 31 * result + (getPickUpLocation() != null ? getPickUpLocation().hashCode() : 0);
        result = 31 * result + (getDropOffLocation() != null ? getDropOffLocation().hashCode() : 0);
        result = 31 * result + (getReceivedTime() != null ? getReceivedTime().hashCode() : 0);
        result = 31 * result + (getCost() != null ? getCost().hashCode() : 0);
        result = 31 * result + (getOrderStatus() != null ? getOrderStatus().hashCode() : 0);
        return result;
    }
}
