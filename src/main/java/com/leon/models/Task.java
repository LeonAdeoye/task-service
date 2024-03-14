package com.leon.models;

import java.time.LocalDateTime;

public class Task
{
    enum TaskType
    {
        PotentialCross,
        DeskCross,
        Blast,
        Order,
        Alert,
        IOICross
    }

    enum TaskStatus
    {
        Pending,
        Completed,
        Cancelled
    }

    enum TaskSide
    {
        Buy,
        Sell
    }
    private int id;
    private TaskType type;
    private String stockCode;
    private String stockDescription;
    private TaskStatus status;
    private LocalDateTime timestamp;
    private boolean isLive;
    private String market;
    private String metadata;
    private int ranking;
    private String desk;
    private int quantity;
    private String trader;
    private TaskSide side;

    public Task()
    {
        this.id = 0;
        this.type = TaskType.PotentialCross;
        this.stockCode = "";
        this.stockDescription = "";
        this.status = TaskStatus.Pending;
        this.timestamp = LocalDateTime.now();
        this.isLive = false;
        this.market = "";
        this.metadata = "";
        this.ranking = 0;
        this.desk = "";
        this.quantity = 0;
        this.trader = "";
        this.side = TaskSide.Buy;
    }

    public Task(int id, TaskType type, String stockCode, String stockDescription, TaskStatus status, LocalDateTime timestamp, boolean isLive, String market, String metadata, int ranking, String desk, int quantity, String trader, TaskSide side)
    {
        this.id = id;
        this.type = type;
        this.stockCode = stockCode;
        this.stockDescription = stockDescription;
        this.status = status;
        this.timestamp = timestamp;
        this.isLive = isLive;
        this.market = market;
        this.metadata = metadata;
        this.ranking = ranking;
        this.desk = desk;
        this.quantity = quantity;
        this.trader = trader;
        this.side = side;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public TaskType getType()
    {
        return type;
    }

    public void setType(TaskType type)
    {
        this.type = type;
    }

    public String getStockCode()
    {
        return stockCode;
    }

    public void setStockCode(String stockCode)
    {
        this.stockCode = stockCode;
    }

    public String getStockDescription()
    {
        return stockDescription;
    }

    public void setStockDescription(String stockDescription)
    {
        this.stockDescription = stockDescription;
    }

    public TaskStatus getStatus()
    {
        return status;
    }

    public void setStatus(TaskStatus status)
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

    public boolean isLive()
    {
        return isLive;
    }

    public void setLive(boolean live)
    {
        isLive = live;
    }

    public String getMarket()
    {
        return market;
    }

    public void setMarket(String market)
    {
        this.market = market;
    }

    public String getMetadata()
    {
        return metadata;
    }

    public void setMetadata(String metadata)
    {
        this.metadata = metadata;
    }

    public int getRanking()
    {
        return ranking;
    }

    public void setRanking(int ranking)
    {
        this.ranking = ranking;
    }

    public String getDesk()
    {
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

    public String getTrader()
    {
        return trader;
    }

    public void setTrader(String trader)
    {
        this.trader = trader;
    }

    public TaskSide getSide()
    {
        return side;
    }

    public void setSide(TaskSide side)
    {
        this.side = side;
    }

    @Override
    public String toString()
    {
        return "Task{" +
                "id=" + id +
                ", type=" + type +
                ", stockCode='" + stockCode + '\'' +
                ", stockDescription='" + stockDescription + '\'' +
                ", status=" + status +
                ", timestamp='" + timestamp + '\'' +
                ", isLive=" + isLive +
                ", market='" + market + '\'' +
                ", metadata='" + metadata + '\'' +
                ", ranking=" + ranking +
                ", desk='" + desk + '\'' +
                ", quantity=" + quantity +
                ", trader='" + trader + '\'' +
                ", side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return id == task.id && type.equals(task.type) && stockCode.equals(task.stockCode) && stockDescription.equals(task.stockDescription) && status.equals(task.status) && timestamp.equals(task.timestamp) && isLive == task.isLive && market.equals(task.market) && metadata.equals(task.metadata) && ranking == task.ranking && desk.equals(task.desk) && quantity == task.quantity && trader.equals(task.trader) && side.equals(task.side);
    }

    @Override
    public int hashCode()
    {
        return id + type.hashCode() + stockCode.hashCode() + stockDescription.hashCode() + status.hashCode() + timestamp.hashCode() + Boolean.hashCode(isLive) + market.hashCode() + metadata.hashCode() + Integer.hashCode(ranking) + desk.hashCode() + Integer.hashCode(quantity) + trader.hashCode() + side.hashCode();
    }
}

