package org.library.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record JwtAuthResponse(
        @Schema(description = "JWT токен для доступа", accessMode = Schema.AccessMode.READ_ONLY)
        String accessToken,

        @Schema(description = "Тип токена", accessMode = Schema.AccessMode.READ_ONLY)
        String tokenType
) {
    private static final String BEARER = "Bearer";

    public JwtAuthResponse(String accessToken) {
        this(accessToken, BEARER);
    }
}
