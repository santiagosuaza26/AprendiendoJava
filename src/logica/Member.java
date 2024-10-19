/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.HashSet;
import java.util.HashMap;

/**
 *
 * @author ssuaz
 */
public class Member {

    private int id;
    private String name;
    boolean vip;
    private double funds;
    private HashSet<String> authorizedPeople;
    HashMap<String, Double> unpaidBills;

    public Member() {
    }

    public Member(int id, String name, boolean vip, double funds, HashSet<String> authorizedPeople, HashMap<String, Double> unpaidBills) {
        this.id = id;
        this.name = name;
        this.vip = vip;
        this.funds = funds;
        this.authorizedPeople = authorizedPeople;
        this.unpaidBills = unpaidBills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFunds() {
        return funds;
    }

    public void addFunds(double amount) {
        if (funds + amount > getMaxFunds()) {
            System.out.println("Exceeds maximum allowed funds.");
        } else {
            this.funds += amount;
        }
    }

    public void addAuthorizedPerson(String person) {
        if (authorizedPeople.size() < 10) {
            authorizedPeople.add(person);
        } else {
            System.out.println("Cannot add more authorized people.");
        }
    }

    public HashSet<String> getAuthorizedPeople() {
        return new HashSet<>(authorizedPeople); // Devuelve una copia para evitar modificaciones externas
    }

    public boolean payBill(String bill) {
        if (unpaidBills.containsKey(bill)) {
            double billAmount = unpaidBills.get(bill);
            if (funds >= billAmount) {
                funds -= billAmount;
                unpaidBills.remove(bill);
                return true;
            } else {
                System.out.println("Insufficient funds to pay the bill.");
            }
        }
        return false;
    }

    public void addBill(String concept, double value) {
        if (unpaidBills.size() < 20) {
            unpaidBills.put(concept, value);
        } else {
            System.out.println("Cannot add more unpaid bills.");
        }
    }

    public boolean hasUnpaidBills() {
        return !unpaidBills.isEmpty();
    }

    public int getAuthorizedCount() {
        return authorizedPeople.size();
    }

    public HashMap<String, Double> getUnpaidInvoicesDetails() {
        return unpaidBills;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public HashMap<String, Double> getUnpaidBills() {
        return unpaidBills;
    }

    public void setUnpaidBills(HashMap<String, Double> unpaidBills) {
        this.unpaidBills = unpaidBills;
    }

    private double getMaxFunds() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void setAuthorizedPeople(HashSet<String> authorizedPeople) {
        this.authorizedPeople = authorizedPeople;
    }
    

}
