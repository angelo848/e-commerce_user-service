CREATE TABLE user_profile
(
    id           BIGSERIAL NOT NULL,
    user_id      BIGINT,
    first_name   VARCHAR(255),
    last_name    VARCHAR(255),
    birth_date   date,
    phone_number VARCHAR(255),
    document     VARCHAR(255),
    created_at   TIMESTAMP WITHOUT TIME ZONE,
    updated_at   TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_user_profile PRIMARY KEY (id)
);

CREATE TABLE users
(
    id              BIGSERIAL NOT NULL,
    email           VARCHAR(255),
    password        VARCHAR(255),
    status          VARCHAR(255),
    created_at      TIMESTAMP WITHOUT TIME ZONE,
    updated_at      TIMESTAMP WITHOUT TIME ZONE,
    user_profile_id BIGINT,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE users
    ADD CONSTRAINT uc_users_user_profile UNIQUE (user_profile_id);

ALTER TABLE users
    ADD CONSTRAINT FK_USERS_ON_USER_PROFILE FOREIGN KEY (user_profile_id) REFERENCES user_profile (id);

ALTER TABLE user_profile
    ADD CONSTRAINT FK_USER_PROFILE_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);