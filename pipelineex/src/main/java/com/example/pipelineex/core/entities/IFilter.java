package com.example.pipelineex.core.entities;

public interface IFilter<T> {
    T execute(T input);
}
