package br.com.paulopinheiro.javadpstudy.structural.flyweight.players;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<String,Player> playersMap = new HashMap<>();

    public static Player getPlayer(String playerCategory) {
        Player myPlayer = null;
        if (!playersMap.containsKey(playerCategory)) {
            switch (playerCategory) {
                case "terrorist" ->  {
                    myPlayer = new Terrorist();
                    playersMap.put(playerCategory, myPlayer);
                    System.out.println("Terrorist created");
                }
                case "counter-terrorist" ->  {
                    myPlayer = new CounterTerrorist();
                    playersMap.put(playerCategory, myPlayer);
                    System.out.println("Counter-terrorist created");
                }
                default -> {
                    throw new InvalidParameterException(playerCategory + " doesn't exist");
                }
            }
        } else {
            myPlayer = playersMap.get(playerCategory);
        }
        return myPlayer;
    }
}
