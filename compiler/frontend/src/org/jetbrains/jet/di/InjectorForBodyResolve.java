/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.di;

import org.jetbrains.jet.lang.resolve.BodyResolver;
import org.jetbrains.jet.lang.resolve.calls.CallResolverExtensionProvider;
import org.jetbrains.jet.lang.PlatformToKotlinClassMap;
import org.jetbrains.jet.lang.resolve.FunctionAnalyzerExtension;
import org.jetbrains.jet.storage.StorageManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.TopDownAnalysisParameters;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.resolve.BodiesResolveContext;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptor;
import org.jetbrains.jet.lang.resolve.AnnotationResolver;
import org.jetbrains.jet.lang.resolve.calls.CallResolver;
import org.jetbrains.jet.lang.resolve.calls.ArgumentTypeResolver;
import org.jetbrains.jet.lang.types.expressions.ExpressionTypingServices;
import org.jetbrains.jet.lang.resolve.calls.CallExpressionResolver;
import org.jetbrains.jet.lang.resolve.DescriptorResolver;
import org.jetbrains.jet.lang.resolve.DelegatedPropertyResolver;
import org.jetbrains.jet.lang.resolve.TypeResolver;
import org.jetbrains.jet.lang.resolve.QualifiedExpressionResolver;
import org.jetbrains.jet.lang.resolve.calls.CandidateResolver;
import org.jetbrains.jet.lang.resolve.ControlFlowAnalyzer;
import org.jetbrains.jet.lang.resolve.DeclarationsChecker;
import org.jetbrains.jet.lang.resolve.ScriptBodyResolver;
import org.jetbrains.jet.lang.resolve.TopDownAnalysisContext;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.generators.injectors.GenerateInjectors. DO NOT EDIT! */
@SuppressWarnings("ALL")
public class InjectorForBodyResolve {
    
    private final BodyResolver bodyResolver;
    private final CallResolverExtensionProvider callResolverExtensionProvider;
    private final PlatformToKotlinClassMap platformToKotlinClassMap;
    private final FunctionAnalyzerExtension functionAnalyzerExtension;
    private final StorageManager storageManager;
    private final Project project;
    private final TopDownAnalysisParameters topDownAnalysisParameters;
    private final BindingTrace bindingTrace;
    private final BodiesResolveContext bodiesResolveContext;
    private final ModuleDescriptor moduleDescriptor;
    private final AnnotationResolver annotationResolver;
    private final CallResolver callResolver;
    private final ArgumentTypeResolver argumentTypeResolver;
    private final ExpressionTypingServices expressionTypingServices;
    private final CallExpressionResolver callExpressionResolver;
    private final DescriptorResolver descriptorResolver;
    private final DelegatedPropertyResolver delegatedPropertyResolver;
    private final TypeResolver typeResolver;
    private final QualifiedExpressionResolver qualifiedExpressionResolver;
    private final CandidateResolver candidateResolver;
    private final ControlFlowAnalyzer controlFlowAnalyzer;
    private final DeclarationsChecker declarationsChecker;
    private final ScriptBodyResolver scriptBodyResolver;
    private final TopDownAnalysisContext topDownAnalysisContext;
    
    public InjectorForBodyResolve(
        @NotNull Project project,
        @NotNull TopDownAnalysisParameters topDownAnalysisParameters,
        @NotNull BindingTrace bindingTrace,
        @NotNull BodiesResolveContext bodiesResolveContext,
        @NotNull ModuleDescriptor moduleDescriptor
    ) {
        this.bodyResolver = new BodyResolver();
        this.callResolverExtensionProvider = new CallResolverExtensionProvider();
        this.platformToKotlinClassMap = moduleDescriptor.getPlatformToKotlinClassMap();
        this.functionAnalyzerExtension = new FunctionAnalyzerExtension();
        this.storageManager = topDownAnalysisParameters.getStorageManager();
        this.project = project;
        this.topDownAnalysisParameters = topDownAnalysisParameters;
        this.bindingTrace = bindingTrace;
        this.bodiesResolveContext = bodiesResolveContext;
        this.moduleDescriptor = moduleDescriptor;
        this.annotationResolver = new AnnotationResolver();
        this.callResolver = new CallResolver();
        this.argumentTypeResolver = new ArgumentTypeResolver();
        this.expressionTypingServices = new ExpressionTypingServices(storageManager, platformToKotlinClassMap);
        this.callExpressionResolver = new CallExpressionResolver();
        this.descriptorResolver = new DescriptorResolver();
        this.delegatedPropertyResolver = new DelegatedPropertyResolver();
        this.typeResolver = new TypeResolver();
        this.qualifiedExpressionResolver = new QualifiedExpressionResolver();
        this.candidateResolver = new CandidateResolver();
        this.controlFlowAnalyzer = new ControlFlowAnalyzer();
        this.declarationsChecker = new DeclarationsChecker();
        this.scriptBodyResolver = new ScriptBodyResolver();
        this.topDownAnalysisContext = new TopDownAnalysisContext();

        this.bodyResolver.setAnnotationResolver(annotationResolver);
        this.bodyResolver.setCallResolver(callResolver);
        this.bodyResolver.setContext(bodiesResolveContext);
        this.bodyResolver.setControlFlowAnalyzer(controlFlowAnalyzer);
        this.bodyResolver.setDeclarationsChecker(declarationsChecker);
        this.bodyResolver.setDelegatedPropertyResolver(delegatedPropertyResolver);
        this.bodyResolver.setExpressionTypingServices(expressionTypingServices);
        this.bodyResolver.setFunctionAnalyzerExtension(functionAnalyzerExtension);
        this.bodyResolver.setScriptBodyResolverResolver(scriptBodyResolver);
        this.bodyResolver.setTopDownAnalysisParameters(topDownAnalysisParameters);
        this.bodyResolver.setTrace(bindingTrace);

        functionAnalyzerExtension.setTrace(bindingTrace);

        annotationResolver.setCallResolver(callResolver);
        annotationResolver.setExpressionTypingServices(expressionTypingServices);

        callResolver.setArgumentTypeResolver(argumentTypeResolver);
        callResolver.setCandidateResolver(candidateResolver);
        callResolver.setExpressionTypingServices(expressionTypingServices);
        callResolver.setTypeResolver(typeResolver);

        argumentTypeResolver.setExpressionTypingServices(expressionTypingServices);
        argumentTypeResolver.setTypeResolver(typeResolver);

        expressionTypingServices.setAnnotationResolver(annotationResolver);
        expressionTypingServices.setCallExpressionResolver(callExpressionResolver);
        expressionTypingServices.setCallResolver(callResolver);
        expressionTypingServices.setDescriptorResolver(descriptorResolver);
        expressionTypingServices.setExtensionProvider(callResolverExtensionProvider);
        expressionTypingServices.setProject(project);
        expressionTypingServices.setTypeResolver(typeResolver);

        callExpressionResolver.setExpressionTypingServices(expressionTypingServices);

        descriptorResolver.setAnnotationResolver(annotationResolver);
        descriptorResolver.setDelegatedPropertyResolver(delegatedPropertyResolver);
        descriptorResolver.setExpressionTypingServices(expressionTypingServices);
        descriptorResolver.setStorageManager(storageManager);
        descriptorResolver.setTypeResolver(typeResolver);

        delegatedPropertyResolver.setExpressionTypingServices(expressionTypingServices);

        typeResolver.setAnnotationResolver(annotationResolver);
        typeResolver.setModuleDescriptor(moduleDescriptor);
        typeResolver.setQualifiedExpressionResolver(qualifiedExpressionResolver);

        candidateResolver.setArgumentTypeResolver(argumentTypeResolver);

        controlFlowAnalyzer.setTopDownAnalysisParameters(topDownAnalysisParameters);
        controlFlowAnalyzer.setTrace(bindingTrace);

        declarationsChecker.setTrace(bindingTrace);

        scriptBodyResolver.setContext(topDownAnalysisContext);
        scriptBodyResolver.setExpressionTypingServices(expressionTypingServices);
        scriptBodyResolver.setTrace(bindingTrace);

        topDownAnalysisContext.setTopDownAnalysisParameters(topDownAnalysisParameters);

    }
    
    @PreDestroy
    public void destroy() {
    }
    
    public BodyResolver getBodyResolver() {
        return this.bodyResolver;
    }
    
    public Project getProject() {
        return this.project;
    }
    
    public BindingTrace getBindingTrace() {
        return this.bindingTrace;
    }
    
    public BodiesResolveContext getBodiesResolveContext() {
        return this.bodiesResolveContext;
    }
    
}
