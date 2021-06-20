package com.mi.patterns.structural.composite.neurons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Neuron implements NeuronI {
    public ArrayList<Neuron> in = new ArrayList<>();
    public ArrayList<Neuron> out = new ArrayList<>();

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }
//
//    @Override
//    public void forEach(Consumer<? super Neuron> action) {
//        action.accept(this);
//    }
//
//    @Override
//    public Spliterator<Neuron> spliterator() {
//        return Collections.singleton(this).spliterator();
//    }

//  public void connectTo(Neuron other)
//  {
//    out.add(other);
//    other.in.add(this);
//  }
}


