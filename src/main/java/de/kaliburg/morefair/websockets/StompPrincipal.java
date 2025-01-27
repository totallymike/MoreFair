package de.kaliburg.morefair.websockets;

import lombok.Data;
import lombok.NonNull;

import java.security.Principal;

@Data
public class StompPrincipal implements Principal {
    @NonNull
    private String name;
    @NonNull
    private Integer ipAddress;

    public StompPrincipal(@NonNull String name, @NonNull Integer ipAddress) {
        this.name = name;
        this.ipAddress = ipAddress;
    }
}
