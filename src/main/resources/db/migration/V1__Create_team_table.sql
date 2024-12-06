CREATE TABLE team (
                      team_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      team_name VARCHAR(255) NOT NULL,
                      car_name VARCHAR(255) NOT NULL,
                      engine VARCHAR(255) NOT NULL,
                      foundation DATE NOT NULL
);