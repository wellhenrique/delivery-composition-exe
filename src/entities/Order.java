package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

  private Date moment;
  private OrderStatus status;

  List<OrderItem> orderItem = new ArrayList<>();
  Client client = new Client();

  public Order() {
  }

  public Order(Date moment, OrderStatus status) {
    this.moment = moment;
    this.status = status;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<OrderItem> getOrderItem() {
    return orderItem;
  }

  public Client getClient() {
    return client;
  }

  public void addOrderItem(OrderItem item) {
    this.orderItem.add(item);
  }

  public void removeOrderItem(OrderItem item) {
    this.orderItem.remove(item);
  }

}
