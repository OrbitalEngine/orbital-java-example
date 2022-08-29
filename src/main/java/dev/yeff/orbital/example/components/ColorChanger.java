package dev.yeff.orbital.example.components;

import dev.yeff.orbital.Game;
import dev.yeff.orbital.ecs.Component;
import dev.yeff.orbital.ecs.components.render.RenderShapeComponent;
import dev.yeff.orbital.graphics.Color;
import dev.yeff.orbital.io.Input;
import dev.yeff.orbital.io.Keys;
import dev.yeff.orbital.io.Mouse;

import java.util.Objects;
import java.util.Optional;

public class ColorChanger extends Component {
    private RenderShapeComponent shape;

    @Override
    public void init(Game game) {
        shape = parent.getComponent(RenderShapeComponent.class);
    }

    @Override
    public void update(Game game) {
        Mouse mouse = Input.getMouse();

        if (mouse.isMouseDown(Keys.MOUSE_MIDDLE) && Objects.equals(shape.color, Optional.of(Color.RED)))
            shape.color = Optional.of(Color.BLUE);
        else
            shape.color = Optional.of(Color.RED);
    }
}
