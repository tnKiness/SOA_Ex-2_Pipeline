package com.example.pipelineex.pipes;

import java.util.List;

import com.example.pipelineex.core.messagequeue.IMessage;

public class Pipeline extends PipelineBase<IMessage> {
    public Pipeline(List<IFilter<IMessage>> filters) {
        this.filters.addAll(filters);
    }
}
