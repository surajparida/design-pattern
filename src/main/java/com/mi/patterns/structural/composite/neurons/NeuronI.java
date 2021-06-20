package com.mi.patterns.structural.composite.neurons;

public interface NeuronI extends Iterable<Neuron> {
    default void connectTo(NeuronI other) {
        if (this == other) return;

        for (Neuron from : this)
            for (Neuron to : other) {
                from.out.add(to);
                to.in.add(from);
            }
    }
}
