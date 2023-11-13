package org.dbTests;

import org.dbTests.util.DataTransferObject;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Order implements DataTransferObject {

    // ATTs
    private long id;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private Date creationDate;
    private BigDecimal totalDue;
    private String status;
    private String salespersonFirstName;
    private String salespersonLastName;
    private String salespersonEmail;
    private List<OrderLine> orderLine;


    // GETs & SETs
    public void setId(long id) {
        this.id = id;
    }
    public String getCustomerFirstName() {
        return customerFirstName;
    }
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }
    public String getCustomerLastName() {
        return customerLastName;
    }
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public BigDecimal getTotalDue() {
        return totalDue;
    }
    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getSalespersonFirstName() {
        return salespersonFirstName;
    }
    public void setSalespersonFirstName(String salespersonFirstName) {
        this.salespersonFirstName = salespersonFirstName;
    }
    public String getSalespersonLastName() {
        return salespersonLastName;
    }
    public void setSalespersonLastName(String salespersonLastName) {
        this.salespersonLastName = salespersonLastName;
    }
    public String getSalespersonEmail() {
        return salespersonEmail;
    }
    public void setSalespersonEmail(String salespersonEmail) {
        this.salespersonEmail = salespersonEmail;
    }
    public List<OrderLine> getOrderLine() {
        return orderLine;
    }
    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    // METHs
    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", creationDate=" + creationDate +
                ", totalDue=" + totalDue +
                ", status='" + status + '\'' +
                ", salespersonFirstName='" + salespersonFirstName + '\'' +
                ", salespersonLastName='" + salespersonLastName + '\'' +
                ", salespersonEmail='" + salespersonEmail + '\'' +
                ", orderLine=" + orderLine +
                '}';
    }
}