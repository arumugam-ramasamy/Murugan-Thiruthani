package com.evolutionary.security.security;

import com.google.common.collect.Sets;

import java.util.Set;
import com.evolutionary.security.security.ApplicationUserPermission ;

import static com.evolutionary.security.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_WRITE, STUDENT_READ,
            COURSE_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions ;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions ;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
