/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ssuaz
 */
class VIPMember extends Member {
    public VIPMember(int id, String name) {
    }

    public double getMaxFunds() {
        return 5000000;
    }

    public String getMemberType() {
        return "VIP";
    }
}
