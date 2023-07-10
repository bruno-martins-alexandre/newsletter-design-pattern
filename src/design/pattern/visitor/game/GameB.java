package design.pattern.visitor.game;

import lombok.Getter;

/**
 * Describes the base properties of the {@link GameB} - a type of {@link Game}.
 */
public final class GameB extends Game {

    @Getter
    private final String gameBSpecificProperty;

    public GameB(String name, String description, String gameBSpecificProperty) {
        super(name, description);
        this.gameBSpecificProperty = gameBSpecificProperty;
    }

    public <T> T acceptVisitor(GameVisitor<T> gameVisitor) {
        return gameVisitor.visit(this);
    }

}
