/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.lite.spring.namespace;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.dangdang.ddframe.job.lite.spring.namespace.parser.dataflow.DataFlowJobBeanDefinitionParser;
import com.dangdang.ddframe.job.lite.spring.namespace.parser.script.ScriptJobBeanDefinitionParser;
import com.dangdang.ddframe.job.lite.spring.namespace.parser.simple.SimpleJobBeanDefinitionParser;

/**
 * 分布式作业的命名空间处理器.
 * 
 * @author caohao
 */
public class JobNamespaceHandler extends NamespaceHandlerSupport {
    
    @Override
    public void init() {
        registerBeanDefinitionParser("simple", new SimpleJobBeanDefinitionParser());
        registerBeanDefinitionParser("dataflow", new DataFlowJobBeanDefinitionParser());
        registerBeanDefinitionParser("script", new ScriptJobBeanDefinitionParser());
    }
}