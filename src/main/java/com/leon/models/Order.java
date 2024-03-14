package com.leon.models;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order
{
    enum OrderType
    {
        Market,
        Limit
    }

    enum OrderStatus
    {
        Pending,
        Completed,
        Cancelled
    }

    enum OrderSide
    {
        Buy,
        Sell,
        ShortSell,
        ShortSellExempt
    }

    @Id
    private int id;
    private OrderType type;
    private String stockCode;
    private OrderStatus status;
    private LocalDateTime timestamp;
    private String currency;
    private String desk;
    private int quantity;
    private OrderSide side;

    private double price;

    public Order()
    {
        this.id = 0;
        this.type = OrderType.Market;
        this.stockCode = "";
        this.status = OrderStatus.Pending;
        this.timestamp = LocalDateTime.now();
        this.desk = "";
        this.quantity = 0;
        this.side = OrderSide.Buy;
        this.price = 0.0;
    }

    public Order(int id, OrderType type, String stockCode, OrderStatus status, LocalDateTime timestamp, String currency, String desk, int quantity, OrderSide side, double price)
    {
        this.id = id;
        this.type = type;
        this.stockCode = stockCode;
        this.status = status;
        this.timestamp = timestamp;
        this.currency = currency;
        this.desk = desk;
        this.quantity = quantity;
        this.side = side;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public OrderType getType()
    {
        return type;
    }

    public void setType(OrderType type)
    {
        this.type = type;
    }

    public String getStockCode(){
        return stockCode;
    }

    public void setStockCode(String stockCode)
    {
        this.stockCode = stockCode;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public LocalDateTime getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk)
    {
        this.desk = desk;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public OrderSide getSide()
    {
        return side;
    }

    public void setSide(OrderSide side)
    {
        this.side = side;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id && quantity == order.quantity && Double.compare(order.price, price) == 0 && type == order.type && stockCode.equals(order.stockCode) && status == order.status && timestamp.equals(order.timestamp) && currency.equals(order.currency) && desk.equals(order.desk) && side == order.side;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, type, stockCode, status, timestamp, currency, desk, quantity, side, price);
    }

    @Override
    public String toString()
    {
        return "Order{" +
                "id=" + id +
                ", type=" + type +
                ", stockCode='" + stockCode + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                ", currency='" + currency + '\'' +
                ", desk='" + desk + '\'' +
                ", quantity=" + quantity +
                ", side=" + side +
                ", price=" + price +
                '}';
    }
}
