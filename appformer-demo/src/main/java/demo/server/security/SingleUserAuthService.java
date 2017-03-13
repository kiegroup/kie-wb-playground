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


package demo.server.security;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.errai.bus.server.annotations.Service;
import org.jboss.errai.security.shared.api.identity.User;
import org.jboss.errai.security.shared.api.identity.UserImpl;
import org.jboss.errai.security.shared.service.AuthenticationService;

/**
 * Temporary authentication service until we decide how authentication will work in LiveSpark apps.
 *
 * @author Max Barkley <mbarkley@redhat.com>
 */
@Service
@ApplicationScoped
public class SingleUserAuthService implements AuthenticationService {

    private final User user = new UserImpl( "user" );

    @Override
    public User login( String username,
                       String password ) {
        throw new UnsupportedOperationException( "This service only supports a single, permanently logged-in user." );
    }

    @Override
    public boolean isLoggedIn() {
        return true;
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException( "This service only supports a single, permanently logged-in user." );
    }

    @Override
    public User getUser() {
        return user;
    }

}
