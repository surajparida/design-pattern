package com.mi.patterns.structural.bridge.render;

import com.google.inject.AbstractModule;

public class ShapeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
