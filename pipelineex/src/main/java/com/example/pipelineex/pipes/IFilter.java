package com.example.pipelineex.pipes;

public interface IFilter<T> {
    T execute(T input);
}
