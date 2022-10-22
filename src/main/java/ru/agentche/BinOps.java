package ru.agentche;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 22.10.2022
 */
public class BinOps {
    public String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
    }
}
