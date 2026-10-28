package net.fneifnox.custommobattributes.config;

import io.wispforest.owo.config.ui.ConfigScreen;
import io.wispforest.owo.config.ui.ConfigScreenProviders;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.container.UIContainers;
import io.wispforest.owo.ui.core.HorizontalAlignment;
import io.wispforest.owo.ui.core.Insets;
import io.wispforest.owo.ui.core.Positioning;
import io.wispforest.owo.ui.core.Sizing;
import io.wispforest.owo.ui.core.UIComponent;
import net.minecraft.client.gui.screens.Screen;

import java.util.ArrayList;
import java.util.List;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;
import static net.fneifnox.custommobattributes.CustomMobAttributes.MOD_ID;

// owo's config screen with a scrollable section list, the default one gets cut off with this many mobs
public class ScrollableConfigScreen extends ConfigScreen {

    protected ScrollableConfigScreen(Screen parent) {
        super(ConfigScreen.DEFAULT_MODEL_ID, CONFIG, parent);
    }

    public static void register() {
        ConfigScreenProviders.register(MOD_ID, ScrollableConfigScreen::new);
    }

    @Override
    protected void build(FlowLayout rootComponent) {
        super.build(rootComponent);

        List<UIComponent> mainPanelChildren = rootComponent.childById(FlowLayout.class, "main-panel").children();
        if (mainPanelChildren.size() < 2 || !(mainPanelChildren.getLast() instanceof FlowLayout sectionPanel)) return;

        List<UIComponent> sections = new ArrayList<>(sectionPanel.children());
        if (sections.isEmpty()) return;

        // The "Sections" title is positioned on top of the centered list, inside the scroll it simply goes first
        sections.getFirst().positioning(Positioning.layout());
        sections.getFirst().margins(Insets.vertical(5));

        sectionPanel.clearChildren();

        FlowLayout sectionList = UIContainers.verticalFlow(Sizing.content(), Sizing.content());
        sectionList.horizontalAlignment(HorizontalAlignment.CENTER);
        sectionList.padding(Insets.right(4));
        sectionList.children(sections);

        sectionPanel.child(UIContainers.verticalScroll(Sizing.content(), Sizing.fill(100), sectionList)
                .scrollbarThiccness(3));
    }
}
