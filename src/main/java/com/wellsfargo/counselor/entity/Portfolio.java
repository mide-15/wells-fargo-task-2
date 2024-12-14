package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client clientId, String creationDate){
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId(){return portfolioId;}

    public Client getClientId(){return clientId;}

    public String getCreationDate(){return creationDate;}

    public void setCreationDate(String creationDate){this.creationDate = creationDate;}
}
