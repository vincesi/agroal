// Copyright (C) 2017 Red Hat, Inc. and individual contributors as indicated by the @author tags.
// You may not use this file except in compliance with the Apache License, Version 2.0.

package io.agroal.api.security;

import java.io.Serializable;
import java.security.Principal;

/**
 * @author <a href="lbarreiro@redhat.com">Luis Barreiro</a>
 */
public class NamePrincipal implements Serializable, Principal {

    private static final long serialVersionUID = 6943668105633565329L;

    private final String name;

    public NamePrincipal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // --- //

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || !( o instanceof Principal ) ) {
            return false;
        }
        Principal p = (Principal) o;
        return name == null ? p.getName() == null : name.equals( p.getName() );
    }

    @Override
    public int hashCode() {
        return name == null ? 7 : name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
