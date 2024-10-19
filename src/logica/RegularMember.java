/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ssuaz
 */
class RegularMember extends Member {
    public RegularMember(int id, String name ,double funds) {
    }

    public double getMaxFunds() {
        return 1000000;
    }

    public String getMemberType() {
        return "Regular";
    }
}
