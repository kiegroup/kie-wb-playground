package demo.client.local.builtin;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.Option;
import org.jboss.errai.common.client.dom.Select;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.nav.client.local.api.LoginPage;
import org.jboss.errai.ui.nav.client.local.api.SecurityError;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.common.collect.ImmutableMultimap;

@Page( role = {DefaultPage.class, LoginPage.class, SecurityError.class} )
@Templated
@Dependent
public class MainPage {

    @Inject
    @DataField
    private Select flows;

    @Inject
    private Document doc;

    @Inject
    private TransitionTo<FlowSelection> transition;

    @Inject
    private ManagedInstance<Class<?>> entityTypes;

    @PostConstruct
    public void init() {
        for (final Class<?> entityType : entityTypes) {
            displayFlowsForEntity( entityType );
        }
        flows.setOnchange( evt -> transition.go( ImmutableMultimap.of("id", flows.getValue() ) ) );
    }

    private void displayFlowsForEntity( final Class<?> entityType ) {
        final Option option = (Option) doc.createElement( "option" );
        option.setTextContent( entityType.getSimpleName() );
        option.setValue( entityType.getName() );
        flows.appendChild( option );
    }

}
