-- V2__Create_pilot_table.sql
CREATE TABLE pilot (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       birth_date DATE NOT NULL,
                       license_number INT NOT NULL,
                       world_title INT NOT NULL,
                       team_id BIGINT,
                       CONSTRAINT fk_team
                           FOREIGN KEY (team_id)
                               REFERENCES team (team_id)
);