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

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Node;
import org.jboss.errai.common.client.dom.OptionsCollection;
import org.jboss.errai.common.client.dom.Select;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.common.collect.ImmutableMultimap;

@Page
@Templated
public class FlowSelection {

    @Inject
    @Named("h2")
    @DataField
    private Heading title;

    @Inject
    @DataField
    private Select tasks;

    @Inject
    private TransitionTo<FlowPage> transition;

    @PageState
    private String id;

    @PostConstruct
    private void init() {
        tasks.setSelectedIndex( 0 );
        tasks.setOnchange( evt -> transition( tasks.getValue() ) );
    }

    @PageShowing
    public void displayFlows() {
        title.setTextContent( simpleName( id ) + " Tasks" );
        setOptions();
    }

    private void setOptions() {
        final OptionsCollection options = tasks.getOptions();
        final String entitySimpleName = simpleName( id );
        for (int i = 1; i < options.getLength(); i++) {
            final Node option = options.item( i );
            option.setTextContent( option.getTextContent().replace( "{}", entitySimpleName ) );
        }
    }

    public void transition( final String flowType ) {
        transition.go( ImmutableMultimap.of("entity", id, "flow", flowType ) );
    }

}
