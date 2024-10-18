/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ssuaz
 */
public class VIPMember extends Member {
    private static final double INITIAL_FUNDS = 100000;
    private static final double MAX_FUNDS = 5000000;

    public VIPMember(String id, String name) {
        super(id, name, INITIAL_FUNDS);
    }

    @Override
    public double getMaxFunds() {
        return MAX_FUNDS;
    }
}
