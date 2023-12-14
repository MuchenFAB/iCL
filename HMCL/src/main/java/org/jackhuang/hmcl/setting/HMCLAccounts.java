/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2021  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl.setting;

import com.google.gson.annotations.SerializedName;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import org.jackhuang.hmcl.task.Schedulers;
import org.jackhuang.hmcl.task.Task;
import org.jackhuang.hmcl.util.gson.UUIDTypeAdapter;
import org.jackhuang.hmcl.util.io.HttpRequest;

import java.util.UUID;

public final class HMCLAccounts {

    private static final ObjectProperty<HMCLAccount> account = new SimpleObjectProperty<>();

    private HMCLAccounts() {
    }

    public static HMCLAccount getAccount() {
        return account.get();
    }

    public static ObjectProperty<HMCLAccount> accountProperty() {
        return account;
    }

    public static void setAccount(HMCLAccount account) {
        HMCLAccounts.account.set(account);
    }

    public static Task<Void> login() {
        String nonce = UUIDTypeAdapter.fromUUID(UUID.randomUUID());
        String scope = "openid offline_access";

        return Task.supplyAsync(() -> {
            return new HMCLAccount(null, null, null, null, null, null, null, null);
        }).thenAcceptAsync(Schedulers.javafx(), account -> {
            setAccount(account);
        });
    }

    public static class HMCLAccount implements HttpRequest.Authorization {
        private final String provider;
        private final String nickname;
        private final String email;
        private final String role;
        private final String idToken;
        private final String tokenType;
        private final String accessToken;
        private final String refreshToken;

        public HMCLAccount(String provider, String nickname, String email, String role, String idToken, String tokenType, String accessToken, String refreshToken) {
            this.provider = provider;
            this.nickname = nickname;
            this.email = email;
            this.role = role;
            this.idToken = idToken;
            this.tokenType = tokenType;
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
        }

        public String getProvider() {
            return provider;
        }

        public String getNickname() {
            return nickname;
        }

        public String getEmail() {
            return email;
        }

        public String getRole() {
            return role;
        }

        public String getIdToken() {
            return idToken;
        }

        @Override
        public String getTokenType() {
            return tokenType;
        }

        @Override
        public String getAccessToken() {
            return accessToken;
        }

        public String getRefreshToken() {
            return refreshToken;
        }
    }

    private static class HMCLAccountProfile {
        @SerializedName("ID")
        String id;
        @SerializedName("Provider")
        String provider;
        @SerializedName("Email")
        String email;
        @SerializedName("NickName")
        String nickname;
        @SerializedName("Role")
        String role;
    }

}
