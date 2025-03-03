package com.example.pipelineex.pipes;

import java.util.List;

import com.example.pipelineex.core.entities.IFilter;
import com.example.pipelineex.core.entities.IMessage;

public class Pipeline extends PipelineBase<IMessage> {
    public Pipeline(List<IFilter<IMessage>> filters) {
        filters.addAll(filters);
    }
}
