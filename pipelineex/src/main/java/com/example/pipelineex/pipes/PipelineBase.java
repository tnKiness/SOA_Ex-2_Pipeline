package com.example.pipelineex.pipes;

import java.util.ArrayList;
import java.util.List;

import com.example.pipelineex.core.entities.IFilter;

public abstract class PipelineBase<T> {
    protected List<IFilter<T>> filters = new ArrayList<>();

    public PipelineBase() {}

    public void registerFilter(IFilter<T> filter) {
        filters.add(filter);
    }

    public T processFilters(T input) {
        for (IFilter<T> filter : filters) {
            input = filter.execute(input);
        }
        return input;
    }
}
