/*
 * Copyright (C) 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package demo.client.local.builtin;

import static demo.client.local.builtin.Util.simpleName;
import static org.jboss.errai.common.client.dom.DOMUtil.removeAllElementChildren;

import java.lang.annotation.Annotation;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.kie.appformer.flow.api.AppFlow;
import org.kie.appformer.flow.api.AppFlowExecutor;
import org.kie.appformer.flow.api.Unit;
import org.kie.appformer.formmodeler.rendering.client.flow.ForEntity;

import com.google.common.collect.ImmutableMultimap;

@Page
@Templated
public class FlowPage {

    @Inject
    @DataField
    private Div container;

    @Inject
    @Named("h2")
    @DataField
    private Heading title;

    @PageState
    private String entity;

    @PageState
    private String flow;

    @Inject
    private AppFlowExecutor executor;

    @Inject
    @Any
    private ManagedInstance<AppFlow<Unit, ?>> provider;

    @Inject
    private TransitionTo<FlowSelection> transition;

    @PageShowing
    private void start() {
        final AppFlow<Unit, ?> flow = getFlow();
        executor.execute( flow, output -> transition.go( ImmutableMultimap.of( "id", entity ) ) );
        title.setTextContent( simpleName( entity ) + " Flow Page" );
    }

    public void display( @Observes final IsElement view ) {
        removeAllElementChildren( container );
        container.appendChild( view.getElement() );
    }

    private AppFlow<Unit, ?> getFlow() {
        return provider
                .select( new ForEntity() {

                    @Override
                    public Class<? extends Annotation> annotationType() {
                        return ForEntity.class;
                    }

                    @Override
                    public String value() {
                        return entity;
                    }
                },
                new Named() {

                    @Override
                    public Class<? extends Annotation> annotationType() {
                        return Named.class;
                    }

                    @Override
                    public String value() {
                        return flow;
                    }
                } ).get();
    }

}
